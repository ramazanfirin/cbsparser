package org.slevin.dao.service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slevin.common.Bina;
import org.slevin.common.Ilce;
import org.slevin.common.Mahalle;
import org.slevin.common.Sehir;
import org.slevin.common.Sokak;
import org.slevin.dao.BaseParserDao;
import org.slevin.dao.BinaDao;
import org.slevin.dao.IlceDao;
import org.slevin.dao.MahalleDao;
import org.slevin.dao.SehirDao;
import org.slevin.dao.SokakDao;
import org.slevin.util.NetgisParseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.Coordinate;


@Component
@Transactional
public abstract class BaseParserService implements BaseParserDao{
	Long sehirId=new Long(1);
	protected String ilceName = "";
	protected Long ilceIndex ;
	protected String endPoint = "";
	protected String host = "";
	protected String origin = "";
	protected String referrer = "";
	protected String sokakQuery = "";
	protected String BinaQuery = "";
	protected String CoordinateQuery = "";
	
	
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired(required=true)
	MahalleDao mahalleService;
	
	@Autowired(required=true)
	SehirDao sehirService;
	
	@Autowired(required=true)
	IlceDao ilceService;
	
	@Autowired(required=true)
	SokakDao sokakService;

	@Autowired(required=true)
	BinaDao binaService;

	
	
	
	public BaseParserService() {
		super();
		// TODO Auto-generated constructor stub
		prepare();
	}

	public void insertMahalle() throws Exception {
		Ilce ilce = ilceService.findByPropertySingleResult("ilceIndex", getIlceIndex());
		List<String> list = getMahalleList();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			Mahalle mahalle = new Mahalle(); 
			mahalle.setComplated(false);
			//String s = new String(string.getBytes(), "ISO-8859-9");
			mahalle.setName(string);
			mahalle.setIlce(ilce);
			mahalleService.merge(mahalle);
		}
	}

	public void insertSokak() throws Exception {
		List<Mahalle> list = mahalleService.findUncomplatedList(getIlceIndex());
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Mahalle mahalle = (Mahalle) iterator.next();
			try{
			List<BaseModel> sokakList = NetgisParseUtil.parseSokakResult(mahalle.getName(), getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getSokakQuery(), mahalle.getName()));
			for (Iterator iterator2 = sokakList.iterator(); iterator2.hasNext();) {
				BaseModel baseModel = (BaseModel) iterator2.next();
				if(baseModel.getName().startsWith(";"))
					continue;
				Sokak sokak = new Sokak();
				sokak.setComplated(false);
				sokak.setName(baseModel.getName());
				sokak.setMahalle(mahalle);
				sokak.setValue(baseModel.getValue());
				sokakService.merge(sokak);
			}
			mahalle.setComplated(true);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			mahalleService.merge(mahalle);
		}
	}

	public void insertBina() throws Exception {
		List<Sokak> list = sokakService.findUncomplatedList(getIlceIndex());
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Sokak sokak = (Sokak) iterator.next();
//			if(sokak.getMahalle().getIlce().getIlceIndex().longValue()!=getIlceIndex())
//				continue;
			try{
				List<BaseModel> binaList = NetgisParseUtil.parseBinaList(sokak.getValue(), getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getBinaQuery(), sokak.getValue()));
				for (Iterator iterator2 = binaList.iterator(); iterator2.hasNext();) {
					BaseModel baseModel = (BaseModel) iterator2.next();
					if(baseModel.getName().startsWith(";"))
						continue;
					Bina bina = new Bina();
					bina.setComplated(false);
					bina.setName(baseModel.getName());
					bina.setSokak(sokak);
					bina.setValue(baseModel.getValue());
					binaService.merge(bina);
				}
				sokak.setComplated(true);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			sokakService.merge(sokak);
		}
		
	}

	public void insertCoordinate() throws Exception {
		List<Bina> binaList =binaService.findUncomplatedList(getIlceIndex());
		List<Bina> tempList = new ArrayList<Bina>();
		int count=0;
		Bina bina = null;
		for (Iterator iterator = binaList.iterator(); iterator.hasNext();) {
			try{
				count++;
				bina = (Bina) iterator.next();
				Coordinate coordinate = NetgisParseUtil.parseCoordinate(bina.getValue(), getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getCoordinateQuery(), bina.getValue()));
				if(coordinate.getLat().startsWith(";"))
					continue;
				bina.setOrijinalLat(coordinate.getLat());
				bina.setOrijinalLng(coordinate.getLng());
				bina.setComplated(true);
				
			}catch(Exception e){
				e.printStackTrace();
				bina.setComplated(true);
				bina.setOrijinalLat("e");
				bina.setOrijinalLng("e");
				
			}
			//tempList.add(bina);
			binaService.merge(bina);
			//Thread.sleep(1000);
			
		}
		
		//binaService.merge(binaList);
		
		
	}


	public void insertIlce() throws Exception {
		Sehir sehir = sehirService.findById(sehirId);
		Ilce ilce = new Ilce();
		ilce.setName(getIlceName());
		ilce.setComplated(false);
		ilce.setSehir(sehir);
		ilce.setIlceIndex(getIlceIndex());
		ilceService.merge(ilce);
	}

	

//	public String getIlceName() throws Exception {
//		// TODO Auto-generated method stub
//		return ilceName;
//	}

	public String getEndpoint() throws Exception {
		// TODO Auto-generated method stub
		return endPoint;
	}

	public String getHost() throws Exception {
		// TODO Auto-generated method stub
		return host;
	}

	public String getOrigin() throws Exception {
		// TODO Auto-generated method stub
		return origin;
	}

	public String getReferrer() throws Exception {
		// TODO Auto-generated method stub
		return referrer;
	}

	public long getErrorCount() throws Exception{
		return binaService.getErrorCount(getIlceIndex());
	}
	
	public String getQuery(String query,String paramater) throws Exception{
		String result= query.replace("__QUERYPARAMETER__", URLEncoder.encode(paramater, "UTF-8"));
		return result;
	}

	public List<String> test() throws Exception{
		List<String> returnMessage= new ArrayList<String>();
		
		List<String> mahalleList = getMahalleList();
		returnMessage.add("ilce adý:"+getIlceName());
		returnMessage.add("mahalle sayýsý:"+getMahalleList().size());
		
		String mahalleName = mahalleList.get(0);
		List<BaseModel> sokakList = NetgisParseUtil.parseSokakResult(mahalleName, getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getSokakQuery(), mahalleName));
		returnMessage.add("mahalle adi:"+mahalleName+", sokak sayisi"+sokakList.size());
		
		BaseModel sokak = sokakList.get(3);
		List<BaseModel> binaList = NetgisParseUtil.parseBinaList(sokak.getValue(), getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getBinaQuery(), sokak.getValue()));
		returnMessage.add("sokak adi:"+sokak.getName()+", bina sayisi"+binaList.size());
		
		BaseModel bina = binaList.get(0);
		if(bina.getName().equals(";Control"))
			System.out.println("error");
		Coordinate coordinate = NetgisParseUtil.parseCoordinate(bina.getValue(), getEndpoint(), getReferrer(), getOrigin(), getHost(),getQuery(getCoordinateQuery(), bina.getValue()));
		System.out.println("bina numrasý:"+bina.getValue()+", koordinatlar:"+ coordinate.getLat()+ " "+coordinate.getLng());
		returnMessage.add("bina numrasý:"+bina.getValue()+", koordinatlar:"+ coordinate.getLat()+ " "+coordinate.getLng());
		//System.out.println("bitti");
		
		return returnMessage;
		
	}
	
	public long getComplatedMahalleCount() throws Exception{
		return mahalleService.complatedCount(getIlceIndex());
	}

	public long getUncomplatedMahalleCount() throws Exception{
		return mahalleService.unComplatedcount(getIlceIndex());
	}

	public long getComplatedSokakCount() throws Exception{
		return sokakService.complatedCount(getIlceIndex());
	}

	public long getUncomplatedSokakCount() throws Exception{
		return sokakService.unComplatedcount(getIlceIndex());
	}

	public long getComplatedBinaCount() throws Exception{
		return binaService.complatedCount(getIlceIndex());
	}

	public long getUncomplatedBinaCount() throws Exception{
		return binaService.unComplatedcount(getIlceIndex());
	}

	public long getComplatedCoordinateCount() throws Exception{
		return binaService.complatedCount(getIlceIndex());
	}

	public long getUncomplatedCoordinateCount() throws Exception{
		return binaService.unComplatedcount(getIlceIndex());
	}
	
	public long getTotalMahalleCount() throws Exception{
		return getMahalleList().size();
	}

	public boolean isIlceInserted() throws Exception{
		List<Ilce> list = ilceService.findByProperty("name", getIlceName());
		if(list==null || list.size()==0)
			return false;
		else
			return true;
	}

	public String getSokakQuery() {
		return sokakQuery;
	}

	public void setSokakQuery(String sokakQuery) {
		this.sokakQuery = sokakQuery;
	}

	public String getBinaQuery() {
		return BinaQuery;
	}

	public void setBinaQuery(String binaQuery) {
		BinaQuery = binaQuery;
	}

	public String getCoordinateQuery() {
		return CoordinateQuery;
	}

	public void setCoordinateQuery(String coordinateQuery) {
		CoordinateQuery = coordinateQuery;
	}

	public Long getIlceIndex() {
		return ilceIndex;
	}

	public void setIlceIndex(Long ilceIndex) {
		this.ilceIndex = ilceIndex;
	}
	
	}
	
	
		


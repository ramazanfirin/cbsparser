package org.slevin.prime.faces.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.context.FacesContext;

import org.slevin.dao.AtasehirParserDao;
import org.slevin.dao.BaseParserDao;
import org.slevin.dao.BeykozParserDao;
import org.slevin.dao.IlceDao;
import org.slevin.dao.cbs.istanbul.ArnavutkoyParserDao;
import org.slevin.dao.cbs.istanbul.BagcilarParserDao;
import org.slevin.dao.cbs.istanbul.BahcelievlerParserDao;
import org.slevin.dao.cbs.istanbul.BakirkoyParserDao;
import org.slevin.dao.cbs.istanbul.BasaksehirParserDao;
import org.slevin.dao.cbs.istanbul.BesiktasParserDao;
import org.slevin.dao.cbs.istanbul.BeylikduzuParserDao;
import org.slevin.dao.cbs.istanbul.CekmekoyParserDao;
import org.slevin.dao.cbs.istanbul.EsenlerParserDao;
import org.slevin.dao.cbs.istanbul.EsenyurtParserDao;
import org.slevin.dao.cbs.istanbul.EyupParserDao;
import org.slevin.dao.cbs.istanbul.GaziosmanpasaParserDao;
import org.slevin.dao.cbs.istanbul.KadikoyParserDao;
import org.slevin.dao.cbs.istanbul.KartalParserDao;
import org.slevin.dao.cbs.istanbul.KucukcekmeceParserDao;
import org.slevin.dao.cbs.istanbul.MaltepeParserDao;
import org.slevin.dao.cbs.istanbul.SancaktepeParserDao;
import org.slevin.dao.cbs.istanbul.SileParserDao;
import org.slevin.dao.cbs.istanbul.SilivriParserDao;
import org.slevin.dao.cbs.istanbul.SultanbeyliParserDao;
import org.slevin.dao.cbs.istanbul.SultangaziParserDao;
import org.slevin.dao.cbs.istanbul.TuzlaParserDao;
import org.slevin.dao.cbs.istanbul.UmraniyeParserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component(value="parserMB")
@ApplicationScoped
public class ParserMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	IlceDao ilceService;
	
	@Autowired
	BeykozParserDao beykozParserService;
	
	@Autowired
	AtasehirParserDao atasehirParserService;
	
	@Autowired
	CekmekoyParserDao cekmekoyParserService;
	
	@Autowired
	KartalParserDao kartalParserService;
	
	@Autowired
	MaltepeParserDao maltepeParserService;
	
	@Autowired
	KadikoyParserDao kadikoyParserService;
	
	@Autowired
	SancaktepeParserDao sancaktepeParserService;
	
	@Autowired
	SultanbeyliParserDao sultanbeyliParserService;
	
	@Autowired
	UmraniyeParserDao umraniyeParserService;
	
	@Autowired
	TuzlaParserDao tuzlaParserService;
	
	@Autowired
	BagcilarParserDao bagcilarParserService;
	
	@Autowired
	ArnavutkoyParserDao arnavutkoyParserService;
	
	@Autowired
	BasaksehirParserDao basaksehirParserService;
	
	@Autowired(required=true)
	BakirkoyParserDao bakirkoyParserService;
	
	@Autowired(required=true)
	BeylikduzuParserDao beylikduzuParserService;
	
	@Autowired(required=true)
	EsenlerParserDao esenlerParserService;
	
	@Autowired(required=true)
	BahcelievlerParserDao bahcelievlerParserService;
	
	
	@Autowired(required=true)
	EsenyurtParserDao esenyurtParserService;
	
	@Autowired(required=true)
	EyupParserDao eyupParserService;
	
	@Autowired(required=true)
	GaziosmanpasaParserDao gaziosmanpasaParserService;
	
	@Autowired(required=true)
	BesiktasParserDao besiktasParserService;
	
	@Autowired(required=true)
	KucukcekmeceParserDao kucukcekmeceParserService;	
	
	@Autowired(required=true)
	SilivriParserDao silivriParserService;
	
	@Autowired(required=true)
	SultangaziParserDao sultangaziParserService;
	
	@Autowired(required=true)
	SileParserDao sileParserService;
	
	long count;
	String message;
	String process;
	
	List<BaseParserDao> serviceList=new ArrayList<BaseParserDao>();
	BaseParserDao selectedService;

	public BaseParserDao getSelectedService() {
		return selectedService;
	}


	public void setSelectedService(BaseParserDao selectedService) {
		this.selectedService = selectedService;
	}

	public void prepareMessage() throws Exception{
		if(selectedService == null){
			message="";
		}else{
			message = selectedService.getIlceName()+" "+ process+ " "+ count+ new Date();
		}
	}

	@PostConstruct
	void init(){
//		serviceList.add(atasehirParserService);
//		serviceList.add(beykozParserService);
//		serviceList.add(cekmekoyParserService);
//		serviceList.add(kartalParserService);
//		serviceList.add(maltepeParserService);
//		serviceList.add(kadikoyParserService);
//		serviceList.add(sancaktepeParserService);
		serviceList.add(sultanbeyliParserService);
//		serviceList.add(umraniyeParserService);
//		serviceList.add(tuzlaParserService);
//		serviceList.add(bagcilarParserService);
//		serviceList.add(arnavutkoyParserService);
//		serviceList.add(basaksehirParserService);
//		serviceList.add(bakirkoyParserService);
//		serviceList.add(beylikduzuParserService);
//		serviceList.add(esenlerParserService);
//		serviceList.add(bahcelievlerParserService);
		
//		serviceList.add(esenyurtParserService);
//		serviceList.add(eyupParserService);
//		serviceList.add(gaziosmanpasaParserService);
//		serviceList.add(besiktasParserService);
//		
		serviceList.add(kucukcekmeceParserService);
		serviceList.add(silivriParserService);
		serviceList.add(sultangaziParserService);
		serviceList.add(sileParserService);
		
		
	}
	
	public void test() throws Exception{
		List<String> list=selectedService.test();
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			addMessage(string);
		}
	}
	
	public void insertIlce() throws Exception{
		try{
		if(!selectedService.isIlceInserted()){
			selectedService.insertIlce();
			addMessage("Baþarýlý");
		}else
			addMessage("Gerek yok");
		}catch(Exception e){
			e.printStackTrace();
			addMessage("hata: "+e.getMessage());
			finishPocess();
		}
		finishPocess();
	}
	
	public void insertMahalle() throws Exception{
		try{
		if(selectedService.getComplatedMahalleCount()!=selectedService.getTotalMahalleCount()){
			selectedService.insertMahalle();
			addMessage("Baþarýlý");
		}else
			addMessage("Gerek yok");
		}catch(Exception e){
			e.printStackTrace();
			addMessage("hata: "+e.getMessage());
			finishPocess();
		}
		finishPocess();
	}
	
	public void insertSokak() throws Exception{
		try{	
			selectedService.insertSokak();
			addMessage("Baþarýlý");
		}catch(Exception e){
			e.printStackTrace();
			addMessage("hata: "+e.getMessage());
			finishPocess();
		}
		finishPocess();
	}
	
	public void insertBina() throws Exception{
		process = "insert bina";
		try{
			for (int i = 0; i < 50; i++) {
				selectedService.insertBina();
				count = i;
			}
			
			addMessage("Baþarýlý");
		}catch(Exception e){
			e.printStackTrace();
			addMessage("hata: "+e.getMessage());
			finishPocess();
		}
		finishPocess();
}
	
	public void insertCoordinate() throws Exception{
		try{
			//count =0;
			process = "insert coordinate";
			for (int i = 0; i < 100; i++) {
				selectedService.insertCoordinate();
				//addMessage("Baþarýlý."+" count="+i);
				count=i;
		
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			addMessage("hata: "+e.getMessage());
			finishPocess();
		}
		finishPocess();
		
		//RequestContext.getCurrentInstance().equals("poll.stop(");
}
	public void finishPocess(){
		addMessage("bitti "+ process + new Date());
		process = "";
		count = 0;
		selectedService = null;
	}
	
	public void addMessage(String message){
		 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Islem Tamamlandý"+message));
	}


	public List<BaseParserDao> getServiceList() {
		return serviceList;
	}


	public void setServiceList(List<BaseParserDao> serviceList) {
		this.serviceList = serviceList;
	}


	public long getCount() {
		return count;
	}


	public void setCount(long count) {
		this.count = count;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getProcess() {
		return process;
	}


	public void setProcess(String process) {
		this.process = process;
	}
	
	
	
	
	
	
	
	
	
}

package org.slevin.prime.faces.bean;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.slevin.dao.BaseParserDao;

public class ServiceDTO {

	BaseParserDao baseParserService;
	
	String ilceComplated="";
	
	public void prepareData(){
		//baseParserService.
	}
	
	public void insertIlce() {
		try {
			baseParserService.insertIlce();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void insertMahalle(){
		try {
			baseParserService.insertMahalle();
			addMessage("success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			addMessage("fail");
		}
	}
public void insertSokak(){
	try {
		baseParserService.insertSokak();
		addMessage("success");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		addMessage("fail");
	}
	}
public void insertBina() {
	try {
		baseParserService.insertBina();
		addMessage("success");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		addMessage("fail");
	}
}
public void insertCoordinate() {
	try {
		baseParserService.insertCoordinate();
		addMessage("success");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		addMessage("fail");
	}
}

public void addMessage(String message){
	 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Islem Tamamlandý"+message));
}
	
	
	public String getIlceName() throws Exception{
		return baseParserService.getIlceName();
	}
	
//	public Long getComplatedMahalleCount() throws Exception{
//		return baseParserService.complatedMahalleCount();
//	}
//	
//	public Long getUncomplatedMahalleCount() throws Exception{
//		return baseParserService.unComplatedMahalleCount();
//	}
//
//	public Long getTotalMahalleCount() throws Exception{
//		return baseParserService.totalMahalleCount();
//	}
//	public Long getComplatedSokakCount() throws Exception{
//		return baseParserService.complatedSokakCount();
//	}
//	
//	public Long getUncomplatedSokakCount() throws Exception{
//		return baseParserService.unComplatedSokakCount();
//	}
//	
//	public Long getComplatedBinaCount() throws Exception{
//		return baseParserService.complatedBinaCount();
//	}
//	
//	public Long getUncomplatedBinaCount() throws Exception{
//		return baseParserService.unComplatedBinaCount();
//	}
//	
//	public Long getComplatedCoordinateCount() throws Exception{
//		return baseParserService.complatedBinaCount();
//	}
//	
//	public Long getUncomplateCoordinateCount() throws Exception{
//		return baseParserService.unComplatedBinaCount();
//	}
//	
//	
//	
//	public BaseParserDao getBaseParserService() {
//		return baseParserService;
//	}
//
//	public void setBaseParserService(BaseParserDao baseParserService) {
//		this.baseParserService = baseParserService;
//	}
//
//	public String getIlceComplated() {
//		return ilceComplated;
//	}
//
//	public void setIlceComplated(String ilceComplated) {
//		this.ilceComplated = ilceComplated;
//	}
}

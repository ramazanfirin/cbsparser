package cbs.istanbul.parser.atasehir;

import java.util.ArrayList;
import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.impl.ParserImlp;
import cbs.istanbul.parser.netgis.ParserBinaNetgis;
import cbs.istanbul.parser.netgis.ParserCoordinateNetgis;
import cbs.istanbul.parser.netgis.ParserSokakNetgis;

public class ParserImplAtasehir extends ParserImlp{

	static final String endPoint = "http://webgis.atasehir.bel.tr/keos/Map5.aspx?workspacename=REHBER6_EXPORT";
	static final String host = "webgis.atasehir.bel.tr";
	static final String origin = "http://webgis.atasehir.bel.tr";
	static final String referrer = "http://webgis.atasehir.bel.tr/keos/?workspacename=REHBER6_EXPORT";
	
	public List<BaseModel> getMahalleList() {
		List<BaseModel> list = new ArrayList<BaseModel>();
		list.add(new BaseModel("Aþýk Veysel",""));
		list.add(new BaseModel("Atatürk",""));
		list.add(new BaseModel("Barbaros",""));
		list.add(new BaseModel("Esatpaþa",""));
		list.add(new BaseModel("Ferhatpaþa",""));
		list.add(new BaseModel("Fetih",""));
		list.add(new BaseModel("Ýçerenköy",""));
		list.add(new BaseModel("Ýnönü",""));
		list.add(new BaseModel("Kayýþdaðý",""));
		list.add(new BaseModel("Küçükbakkalköy",""));
		list.add(new BaseModel("Mevlana",""));
		list.add(new BaseModel("Mimar Sinan",""));
		list.add(new BaseModel("Mustafa Kemal",""));
		list.add(new BaseModel("Örnek",""));
		list.add(new BaseModel("Yeni Çamlýca",""));
		list.add(new BaseModel("Yeni Sahra",""));
		list.add(new BaseModel("Yeniþehir",""));
		return list;
	}


	public void prepareParsers() {
		parserSokak = new ParserSokakNetgis(endPoint, host, origin, referrer);
		parserBina = new ParserBinaNetgis(endPoint, host, origin, referrer);
		parserCoordinate = new ParserCoordinateNetgis(endPoint, host, origin, referrer);
	}


	public void insertMahalle() throws Exception {
		// TODO Auto-generated method stub
		
	}
}

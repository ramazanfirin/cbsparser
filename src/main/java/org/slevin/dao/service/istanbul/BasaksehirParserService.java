package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BasaksehirParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class BasaksehirParserService extends BaseParserService implements BasaksehirParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.basaksehir.bel.tr/keos/Map5.aspx";
		host = "webgis.basaksehir.bel.tr";
		origin = "http://webgis.basaksehir.bel.tr";
		referrer = "http://webgis.basaksehir.bel.tr/keos/";	
		ilceName = "Baþakþehir";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6_GENEL_UYDUKarolar%C4%B1%2CUydu_2014%2CUydu_karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk%2Bf3CT22VlZDHi0wuXPHHcLKZBJM%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Ftileimages_REHBER6%2F%3B%3BF%3AOrtofoto_2013%3D0%2CUydu_karo%3D0%2CREHBER6_GENEL_UYDUKarolar%C4%B1%3DFFFF%2CUydu_2014%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AREHBER6_GENEL_UYDUKarolar%C4%B1%3D0%2CUydu_2014%3D0%2CUydu_karo%3D0%2COrtofoto_2013%3D0%2Ckentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%2COrtofoto_2013%3D0%2CUydu_karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6_GENEL_UYDUKarolar%C4%B1%2CUydu_2014%2CUydu_karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk%2Bf3CT22VlZDHi0wuXPHHcLKZBJM%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Ftileimages_REHBER6%2F%3B%3BF%3AOrtofoto_2013%3D0%2CUydu_karo%3D0%2CREHBER6_GENEL_UYDUKarolar%C4%B1%3DFFFF%2CUydu_2014%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AREHBER6_GENEL_UYDUKarolar%C4%B1%3D0%2CUydu_2014%3D0%2CUydu_karo%3D0%2COrtofoto_2013%3D0%2Ckentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%2COrtofoto_2013%3D0%2CUydu_karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6_GENEL_UYDUKarolar%C4%B1%2CUydu_2014%2CUydu_karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk%2Bf3CT22VlZDHi0wuXPHHcLKZBJM%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Ftileimages_REHBER6%2F%3B%3BF%3AOrtofoto_2013%3D0%2CUydu_karo%3D0%2CREHBER6_GENEL_UYDUKarolar%C4%B1%3DFFFF%2CUydu_2014%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AREHBER6_GENEL_UYDUKarolar%C4%B1%3D0%2CUydu_2014%3D0%2CUydu_karo%3D0%2COrtofoto_2013%3D0%2Ckentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ad3e5f3f512c146e8b9d239b594f141bf%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.basaksehir.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akentrehberi_parklar%3DDBFE%2Ckentrehberi_fenisisleri_biten%3D0%2COrtofoto_2013%3D0%2CUydu_karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";		
		
		ilceIndex = new Long(13);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ALTINÞEHÝR");
		list.add("BAHÇEÞEHÝR 1. KISIM");
		list.add("BAHÇEÞEHÝR 2. KISIM");
		list.add("BAÞAK");
		list.add("BAÞAKÞEHÝR");
		list.add("GÜVERCÝNTEPE");
		list.add("KAYABAÞI");
		list.add("ÞAHÝNTEPE");
		list.add("ÞAMLAR");
		list.add("ZÝYA GÖKALP");
		
		return list;
	}

	public String getIlceName() throws Exception {
		// TODO Auto-generated method stub
		return ilceName;
	}

//	public String getSokakQuery() throws Exception {
//		// TODO Auto-generated method stub
//		return sokakQuery;
//	}
//
//	public String getBinaQuery() throws Exception {
//		// TODO Auto-generated method stub
//		return BinaQuery;
//	}
//
//	public String getCoordinateQuery() throws Exception {
//		// TODO Auto-generated method stub
//		return CoordinateQuery;
//	}

	

	

}

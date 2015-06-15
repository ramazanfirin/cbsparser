package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.ArnavutkoyParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class ArnavutkoyParserService extends BaseParserService implements ArnavutkoyParserDao{


						
	
	public void prepare() {
		endPoint = "http://belnet.arnavutkoy.bel.tr/keos/Map5.aspx";
		host = "belnet.arnavutkoy.bel.tr";
		origin = "http://belnet.arnavutkoy.bel.tr";
		referrer = "http://belnet.arnavutkoy.bel.tr/keos/";	
		ilceName = "Arnavutköy";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AOrtofoto_2010_Karo%2COrtofoto_2009_Karo%2CGenelUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkedIJEvpeC9wSiz3UuHwimTLcHZk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2009_Karo%3D0%2COrtofoto_2010_Karo%3DFFFF%2CGenelUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2010_Karo%3D0%2COrtofoto_2009_Karo%3D0%2CGenelUydu%3D0%2C360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3A360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%2COrtofoto_2009_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_v2%2CGenelUydu_v1%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZBvYmQf1xNkfOFBmp%2FjdtbB96udw&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2FNetgisTile_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3DFFFF%2CGenelUydu_v1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3D0%2CGenelUydu_v1%3D0%2COrtofoto_2013%3D0%2CKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AOrtofoto_2010_Karo%2COrtofoto_2009_Karo%2CGenelUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkedIJEvpeC9wSiz3UuHwimTLcHZk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2009_Karo%3D0%2COrtofoto_2010_Karo%3DFFFF%2CGenelUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2010_Karo%3D0%2COrtofoto_2009_Karo%3D0%2CGenelUydu%3D0%2C360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3A360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%2COrtofoto_2009_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_v2%2CGenelUydu_v1%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZBvYmQf1xNkfOFBmp%2FjdtbB96udw&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2FNetgisTile_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3DFFFF%2CGenelUydu_v1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3D0%2CGenelUydu_v1%3D0%2COrtofoto_2013%3D0%2CKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AOrtofoto_2010_Karo%2COrtofoto_2009_Karo%2CGenelUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkedIJEvpeC9wSiz3UuHwimTLcHZk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2009_Karo%3D0%2COrtofoto_2010_Karo%3DFFFF%2CGenelUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2010_Karo%3D0%2COrtofoto_2009_Karo%3D0%2CGenelUydu%3D0%2C360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ae03b2bfe5fbe441099eb916079b5f4d4%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.arnavutkoy.bel.tr%2Fnetgis5%2F%3B%3BF%3A360%3D0%2Ckentrehberi_fenisimalat_biten%3D0%2COrtofoto_2009_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";		
		
		ilceIndex = new Long(12);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ADNAN MENDERES");
		list.add("ANADOLU");
		list.add("ARNAVUTKÖY MERKEZ");
		list.add("ATATÜRK");
		list.add("BAHÞAYIÞ");
		list.add("BAKLALI");
		list.add("BALABAN");
		list.add("BOÐAZKÖY ÝSTÝKLAL");
		list.add("BOLLUCA");
		list.add("BOYALIK");
		list.add("ÇÝLÝNGÝR");
		list.add("DELÝKLÝKAYA");
		list.add("DURSUNKÖY");
		list.add("DURUSU");
		list.add("FATÝH");
		list.add("HACIMAÞLI");
		list.add("HADIMKÖY");
		list.add("HARAÇÇI");
		list.add("HASTANE");
		list.add("HÝCRET");
		list.add("ÝMRAHOR");
		list.add("ÝSLAMBEY");
		list.add("KARABURUN");
		list.add("KARLIBAYIR");
		list.add("M.FEVZÝ ÇAKMAK");
		list.add("MAVÝGÖL");
		list.add("MEHMET AKÝF ERSOY");
		list.add("MUSTAFA KEMAL PAÞA");
		list.add("NAKKAÞ");
		list.add("NENEHATUN");
		list.add("ÖMERLÝ");
		list.add("SAZLIBOSNA");
		list.add("TAÞOLUK");
		list.add("TAYAKADIN");
		list.add("TERKOS");
		list.add("YASSIÖREN");
		list.add("YAVUZ SELÝM");
		list.add("YENÝKÖY");
		list.add("YEÞÝLBAYIR");
		list.add("YUNUS EMRE");

		
		
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

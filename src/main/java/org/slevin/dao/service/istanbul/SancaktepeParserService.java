package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.SancaktepeParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class SancaktepeParserService extends BaseParserService implements SancaktepeParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.sancaktepe.bel.tr/keos/Map5.aspx";
		host = "webgis.sancaktepe.bel.tr";
		origin = "http://sancaktepe.kadikoy.bel.tr";
		referrer = "http://sancaktepe.kadikoy.bel.tr/keos/";	
		ilceName = "Sancaktepe";
		sokakQuery ="OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkh%2FbOJvEvL1iWRaPkH1LoxDT64ClGAmf35c37ab%2FwPgQ%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";	
		BinaQuery =	"OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkh%2FbOJvEvL1iWRaPkH1LoxDT64ClGAmf35c37ab%2FwPgQ%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkh%2FbOJvEvL1iWRaPkH1LoxDT64ClGAmf35c37ab%2FwPgQ%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A427a2be50f83448c9841fffb1a9c9054%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sancaktepe.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_poi%3DFFFFFFFFFB%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(7);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ABDURRAHMANGAZÝ");
		list.add("AKPINAR");
		list.add("ATATÜRK");
		list.add("EMEK");
		list.add("EYÜP SULTAN");
		list.add("FATÝH");
		list.add("HÝLAL");
		list.add("ÝNÖNÜ");
		list.add("KEMAL TÜRKLER");
		list.add("KUZUDERE DEVLET ORMANI");
		list.add("MECLÝS");
		list.add("MERVE");
		list.add("MEVLANA");
		list.add("OSMANGAZÝ");
		list.add("PASAKÖY");
		list.add("SAFA");
		list.add("SARIGAZÝ");
		list.add("VEYSEL KARANÝ");
		list.add("YENÝDOÐAN");
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

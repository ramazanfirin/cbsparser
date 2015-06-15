package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BakirkoyParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class BakirkoyParserService extends BaseParserService implements BakirkoyParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.bakirkoy.bel.tr/keos/Map5.aspx";
		host = "keos.bakirkoy.bel.tr";
		origin = "http://keos.bakirkoy.bel.tr";
		referrer = "http://keos.bakirkoy.bel.tr/keos/";	
		ilceName = "Bakýrkoy";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_Alt%2CGenelUydu_Karo_Ust%2COrtofoto_karo_2013%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkidQrcG5owyjEKBmXwro7r7lTajQ%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu_Karo_Alt%3DFFFF%2CGenelUydu_Karo_Ust%3DFFFF%2COrtofoto_karo_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_Alt%3D0%2CGenelUydu_Karo_Ust%3D0%2COrtofoto_karo_2013%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_Alt%2CGenelUydu_Karo_Ust%2COrtofoto_karo_2013%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkidQrcG5owyjEKBmXwro7r7lTajQ%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu_Karo_Alt%3DFFFF%2CGenelUydu_Karo_Ust%3DFFFF%2COrtofoto_karo_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_Alt%3D0%2CGenelUydu_Karo_Ust%3D0%2COrtofoto_karo_2013%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_Alt%2CGenelUydu_Karo_Ust%2COrtofoto_karo_2013%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkidQrcG5owyjEKBmXwro7r7lTajQ%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu_Karo_Alt%3DFFFF%2CGenelUydu_Karo_Ust%3DFFFF%2COrtofoto_karo_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_Alt%3D0%2CGenelUydu_Karo_Ust%3D0%2COrtofoto_karo_2013%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A098744d900d74d28936cd62d44009be1%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bakirkoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";		
		
		ilceIndex = new Long(14);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ATAKÖY 1.");
		list.add("ATAKÖY 2-5-6.");
		list.add("ATAKÖY 3-4-11.");
		list.add("ATAKÖY 7-8-9-10.");
		list.add("BASINKÖY");
		list.add("CEVÝZLÝK");
		list.add("KARTALTEPE");
		list.add("OSMANÝYE");
		list.add("SAKIZAÐACI");
		list.add("ÞENLÝKKÖY");
		list.add("YENÝMAHALLE");
		list.add("YEÞÝLKÖY");
		list.add("YEÞÝLYURT");
		list.add("ZEYTÝNLÝK");
		list.add("ZUHURATBABA");
		
			
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

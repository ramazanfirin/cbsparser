package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.EyupParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class EyupParserService extends BaseParserService implements EyupParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.eyup.bel.tr/keos/Map5.aspx";
		host = "keos.eyup.bel.tr";
		origin = "http://keos.eyup.bel.tr";
		referrer = "http://keos.eyup.bel.tr/keos/";	
		ilceName = "Ey�p";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2COrtofoto%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Ftileimages_EMLAK6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu%3DFFFF%2COrtofoto%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu%3D0%2COrtofoto%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2COrtofoto%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Ftileimages_EMLAK6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu%3DFFFF%2COrtofoto%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu%3D0%2COrtofoto%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2COrtofoto%2CPlan_1000%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Ftileimages_EMLAK6%2F%3B%3BF%3APlan_1000%3D0%2CGenelUydu%3DFFFF%2COrtofoto%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu%3D0%2COrtofoto%3D0%2CPlan_1000%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A2320%3B%3B_S%3Aa8a7cd7e40a5420a9e65970415cc54c7%3B%3B_WS%3AEMLAK6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.eyup.bel.tr%2Fnetgis5%2F%3B%3BF%3APlan_1000%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(19);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("A�A�LI");
		list.add("AKPINAR");
		list.add("AK�EMSETT�N");
		list.add("AL�BEYK�Y");
		list.add("��FTALAN");
		list.add("�IR�IR");
		list.add("DEFTERDAR");
		list.add("D��MEC�LER");
		list.add("EMN�YETTEPE");
		list.add("ESENTEPE");
		list.add("EY�P MERKEZ");
		list.add("G�KT�RK MERKEZ");
		list.add("G�ZELTEPE");
		list.add("�HSAN�YE");
		list.add("I�IKLAR");
		list.add("�SLAMBEY");
		list.add("KARADOLAP");
		list.add("M�MAR S�NAN");
		list.add("M�THATPA�A");
		list.add("N��ANCI");
		list.add("ODAYER�");
		list.add("P�R�N���");
		list.add("RAM� CUMA");
		list.add("RAM� YEN�");
		list.add("SAKARYA");
		list.add("S�LAHTARA�A");
		list.add("TOP�ULAR");
		list.add("YE��LPINAR");
		
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

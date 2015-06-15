package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.SileParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class SileParserService extends BaseParserService implements SileParserDao{


						
	
	public void prepare() {
		endPoint = "http://kentrehberi.sile.bel.tr/keos/Map5.aspx";
		host = "kentrehberi.sile.bel.tr";
		origin = "http://kentrehberi.sile.bel.tr";
		referrer = "http://kentrehberi.sile.bel.tr/keos/";	
		ilceName = "�ile";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(25);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("A�A�DERE");
		list.add("AHMETL�");
		list.add("AK�AKESE");
		list.add("ALACALI");
		list.add("AVCIKORU");
		list.add("BAL� BEY");
		list.add("BI�KIDERE");
		list.add("BOZGOCA");
		list.add("B�Y�KBUCAKLI");
		list.add("�ATAKLI");
		list.add("�AVU�");
		list.add("�AYIRBA�I");
		list.add("�ELEB�");
		list.add("�ENG�LL�");
		list.add("DARLIK");
		list.add("DE��RMEN �AYIRI");
		list.add("DO�ANCILI");
		list.add("ERENLER");
		list.add("ESENCEL�");
		list.add("GEREDEL�");
		list.add("G��E");
		list.add("G�KMA�LI");
		list.add("G�KSU");
		list.add("HACI KASIM");
		list.add("HACILLI");
		list.add("HASANLI");
		list.add("�MRENDERE");
		list.add("�MRENL�");
		list.add("�SAK�Y");
		list.add("KABAKOZ");
		list.add("KADIK�Y");
		list.add("KALEMK�Y");
		list.add("KARABEYL�");
		list.add("KARACAK�Y");
		list.add("KARAK�RAZ");
		list.add("KARAMANDERE");
		list.add("KERVANSARAY");
		list.add("KIZILCAK�Y");
		list.add("K�M�RL�K");
		list.add("KORUCUK�Y");
		list.add("KUMBABA");
		list.add("KURFALLI");
		list.add("KURNA");
		list.add("MERKEZ");
		list.add("ME�RUT�YET");
		list.add("ORU�O�LU");
		list.add("OSMANK�Y");
		list.add("OVACIK");
		list.add("SAH�LK�Y (DOMALI)");
		list.add("SATMAZLI");
		list.add("SOFULAR");
		list.add("SO�ULLU");
		list.add("SORTULLU");
		list.add("�UAY�PL�");
		list.add("TEKE");
		list.add("ULUPEL�T");
		list.add("�VEZL�");
		list.add("YAKA");
		list.add("YAYLALI");
		list.add("YAZIMANAYIR");
		list.add("YEN�K�Y");
		list.add("YE��LVAD�");
		
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

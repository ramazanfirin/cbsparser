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
		ilceName = "Þile";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkUJqE54tn7V90WwzB57k%2BLttsnuV3RnKlpuNuKf6NTJo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Ftileimages_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A025334df0d31475d888a411ee0a5db13%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkentrehberi.sile.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&OldSearch2%24cmb1=&OldSearch2%24cmb2=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(25);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("AÐAÇDERE");
		list.add("AHMETLÝ");
		list.add("AKÇAKESE");
		list.add("ALACALI");
		list.add("AVCIKORU");
		list.add("BALÝ BEY");
		list.add("BIÇKIDERE");
		list.add("BOZGOCA");
		list.add("BÜYÜKBUCAKLI");
		list.add("ÇATAKLI");
		list.add("ÇAVUÞ");
		list.add("ÇAYIRBAÞI");
		list.add("ÇELEBÝ");
		list.add("ÇENGÝLLÝ");
		list.add("DARLIK");
		list.add("DEÐÝRMEN ÇAYIRI");
		list.add("DOÐANCILI");
		list.add("ERENLER");
		list.add("ESENCELÝ");
		list.add("GEREDELÝ");
		list.add("GÖÇE");
		list.add("GÖKMAÞLI");
		list.add("GÖKSU");
		list.add("HACI KASIM");
		list.add("HACILLI");
		list.add("HASANLI");
		list.add("ÝMRENDERE");
		list.add("ÝMRENLÝ");
		list.add("ÝSAKÖY");
		list.add("KABAKOZ");
		list.add("KADIKÖY");
		list.add("KALEMKÖY");
		list.add("KARABEYLÝ");
		list.add("KARACAKÖY");
		list.add("KARAKÝRAZ");
		list.add("KARAMANDERE");
		list.add("KERVANSARAY");
		list.add("KIZILCAKÖY");
		list.add("KÖMÜRLÜK");
		list.add("KORUCUKÖY");
		list.add("KUMBABA");
		list.add("KURFALLI");
		list.add("KURNA");
		list.add("MERKEZ");
		list.add("MEÞRUTÝYET");
		list.add("ORUÇOÐLU");
		list.add("OSMANKÖY");
		list.add("OVACIK");
		list.add("SAHÝLKÖY (DOMALI)");
		list.add("SATMAZLI");
		list.add("SOFULAR");
		list.add("SOÐULLU");
		list.add("SORTULLU");
		list.add("ÞUAYÝPLÝ");
		list.add("TEKE");
		list.add("ULUPELÝT");
		list.add("ÜVEZLÝ");
		list.add("YAKA");
		list.add("YAYLALI");
		list.add("YAZIMANAYIR");
		list.add("YENÝKÖY");
		list.add("YEÞÝLVADÝ");
		
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

package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BesiktasParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class BesiktasParserService extends BaseParserService implements BesiktasParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.besiktas.bel.tr/keos/Map5.aspx";
		host = "keos.besiktas.bel.tr";
		origin = "http://keos.besiktas.bel.tr";
		referrer = "http://keos.besiktas.bel.tr/keos/";	
		ilceName = "Beþiktas";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkQzj0NJtYNE5B06%2BfcpZ7L3zTZadJw8bjRJqr9AYx4Mk%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrtofoto_2013%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkQzj0NJtYNE5B06%2BfcpZ7L3zTZadJw8bjRJqr9AYx4Mk%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrtofoto_2013%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A26ae681074e54f43b650c068cf778422%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkQzj0NJtYNE5B06%2BfcpZ7L3zTZadJw8bjRJqr9AYx4Mk%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A86f30884d4814291b4ae1a7f4499987f%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_TileImage_REHBER6%2F%3B%3BF%3AGenelUydu_Karo%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A86f30884d4814291b4ae1a7f4499987f%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo%3D0%2COrtofoto_2013%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Cyapi%3D0%2Cparsel%3D0%2Ckbs_plf%3D0%2Cgeoyol%3D0%2Cgeokapi%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A86f30884d4814291b4ae1a7f4499987f%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.besiktas.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Cyapi%3D0%2Cparsel%3D0%2Ckbs_plf%3D0%2Cgeoyol%3D0%2Cgeokapi%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(21);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("ABBASAÐA");
				list.add("AKAT");
				list.add("ARNAVUTKÖY");
				list.add("BALMUMCU");
				list.add("BEBEK");
				list.add("CIHANNUMA");
				list.add("DÝKÝLÝTAÞ");
				list.add("ETÝLER");
				list.add("GAYRETTEPE");
				list.add("KONAKLAR");
				list.add("KÜLTÜR");
				list.add("KURUÇESME");
				list.add("LEVAZIM");
				list.add("LEVENT");
				list.add("MECÝDÝYE");
				list.add("MURADÝYE");
				list.add("NÝSBETÝYE");
				list.add("ORTAKÖY");
				list.add("SÝNANPAÞA");
				list.add("TÜRKALÝ");
				list.add("ULUS");
				list.add("VÝÞNEZADE");
				list.add("YILDIZ");
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

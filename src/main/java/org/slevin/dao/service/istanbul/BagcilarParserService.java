package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BagcilarParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class BagcilarParserService extends BaseParserService implements BagcilarParserDao{


						
	
	public void prepare() {
		endPoint = "http://bbgis.bagcilar.bel.tr/keos/Map5.aspx";
		host = "bbgis.bagcilar.bel.tr";
		origin = "http://bbgis.bagcilar.bel.tr";
		referrer = "http://bbgis.bagcilar.bel.tr/keos/";	
		ilceName = "Baðcýlar";
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_v2%2CGenelUydu_v1%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZBvYmQf1xNkfOFBmp%2FjdtbB96udw&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2FNetgisTile_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3DFFFF%2CGenelUydu_v1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3D0%2CGenelUydu_v1%3D0%2COrtofoto_2013%3D0%2CKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_v2%2CGenelUydu_v1%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZBvYmQf1xNkfOFBmp%2FjdtbB96udw&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2FNetgisTile_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3DFFFF%2CGenelUydu_v1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3D0%2CGenelUydu_v1%3D0%2COrtofoto_2013%3D0%2CKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_v2%2CGenelUydu_v1%2COrtofoto_2013%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZBvYmQf1xNkfOFBmp%2FjdtbB96udw&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2FNetgisTile_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3DFFFF%2CGenelUydu_v1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AGenelUydu_v2%3D0%2CGenelUydu_v1%3D0%2COrtofoto_2013%3D0%2CKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Acb2e40791ddb45b590c2908475eefac8%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fbbgis.bagcilar.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3AKISAYOL%3D0%2CKENTREHBERI_YOL%3D0%2CKENTREHBERI_PARSEL%3D0%2CKOD_KULLANIM_AMACI_KR_TABLE%3D0%2CKOD_KULLANIM_AMACI_KR%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
				
		ilceIndex = new Long(11);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("100.YIL");
		list.add("BAÐLAR");
		list.add("BARBAROS");
		list.add("ÇINAR");
		list.add("DEMÝRKAPI");
		list.add("EVREN");
		list.add("FATÝH");
		list.add("FEVZÝÇAKMAK");
		list.add("GÖZTEPE");
		list.add("GÜNEÞLÝ");
		list.add("HÜRRÝYET");
		list.add("ÝNÖNÜ");
		list.add("KAZIMKARABEKÝR");
		list.add("KEMALPAÞA ");
		list.add("KÝRAZLI");
		list.add("MAHMUTBEY");
		list.add("MERKEZ");
		list.add("SANCAKTEPE");
		list.add("YAVUZSELÝM");
		list.add("YENÝGÜN");
		list.add("YENÝMAHALLE");
		list.add("YILDIZTEPE");
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

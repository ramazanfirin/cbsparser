package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.SultangaziParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class SultangaziParserService extends BaseParserService implements SultangaziParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.sultangazi.bel.tr/keos/Map5.aspx";
		host = "webgis.sultangazi.bel.tr";
		origin = "http://webgis.sultangazi.bel.tr";
		referrer = "http://webgis.sultangazi.bel.tr/keos/";	
		ilceName = "Sultangazi";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AYeniGenelUydu%2CUydu_Karo%2COrtoFoto_2013_Karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZJfPIIxDFHC%2F9sqVDYJwE04u7drd&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3AUydu_Karo%3D0%2CYeniGenelUydu%3DFFFF%2COrtoFoto_2013_Karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3AYeniGenelUydu%3D0%2CUydu_Karo%3D0%2COrtoFoto_2013_Karo%3D0%2Ckentrehberi_parkis%3DFD%2Ckentrehberi_fenis%3DFD%2Ckentrehberi_parklar%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_parkis%3DFD%2Ckentrehberi_fenis%3DFD%2Ckentrehberi_parklar%3D0%2CUydu_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AYeniGenelUydu%2CUydu_Karo%2COrtoFoto_2013_Karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZJfPIIxDFHC%2F9sqVDYJwE04u7drd&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3AUydu_Karo%3D0%2CYeniGenelUydu%3DFFFF%2COrtoFoto_2013_Karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3AYeniGenelUydu%3D0%2CUydu_Karo%3D0%2COrtoFoto_2013_Karo%3D0%2Ckentrehberi_parkis%3DFD%2Ckentrehberi_fenis%3DFD%2Ckentrehberi_parklar%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A05b8e2f17b02451fab5e86466d6d0c3c%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultangazi.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_parkis%3DFD%2Ckentrehberi_fenis%3DFD%2Ckentrehberi_parklar%3D0%2CUydu_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="";
		ilceIndex = new Long(24);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("50.YIL");
				list.add("75. YIL");
				list.add("ASKERÝ BÖLGE ESENLER");
				list.add("CEBECÝ");
				list.add("CUMHURÝYET");
				list.add("ESENTEPE");
				list.add("ESKÝ HABÝPLER");
				list.add("GAZÝ");
				list.add("HABÝPLER");
				list.add("ÝSMETPAÞA");
				list.add("MALKOÇOÐLU");
				list.add("SULTANÇÝFTLÝÐÝ");
				list.add("UÐUR MUMCU");
				list.add("YAYLA");
				list.add("YUNUS EMRE");
				list.add("ZÜBEYDE HANIM");
		
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

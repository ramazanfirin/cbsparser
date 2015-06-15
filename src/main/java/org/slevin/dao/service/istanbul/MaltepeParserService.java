package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.MaltepeParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class MaltepeParserService extends BaseParserService implements MaltepeParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.maltepe.bel.tr/keos/Map5.aspx";
		host = "webgis.maltepe.tr";
		origin = "http://webgis.maltepe.bel.tr";
		referrer = "http://webgis.maltepe.bel.tr/keos/";	
		ilceName = "Maltepe";
		sokakQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2CGenel_Uydu2%2CUydu_2014_karo%2COrtofoto_2011%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%2CUydufoto_Karo%3DFFFF%2CGenel_Uydu2%3DFFFF%2CUydu_2014_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AUydufoto_Karo%3D0%2CGenel_Uydu2%3D0%2CUydu_2014_karo%3D0%2COrtofoto_2011%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery  = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2CGenel_Uydu2%2CUydu_2014_karo%2COrtofoto_2011%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%2CUydufoto_Karo%3DFFFF%2CGenel_Uydu2%3DFFFF%2CUydu_2014_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AUydufoto_Karo%3D0%2CGenel_Uydu2%3D0%2CUydu_2014_karo%3D0%2COrtofoto_2011%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6_GENEL_UYDUKarolar%C4%B1%2CUydu_2014%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZCNvBc59kUZkvsnHUTOaHJxqoDwe&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab2dd0214fde4457fa45066c22a9e3665%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.kartal.bel.tr%2Fnetgis5_rehberexp%2F%3B%3BF%3AREHBER6_GENEL_UYDUKarolar%C4%B1%3DFFFF%2CUydu_2014%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ab2dd0214fde4457fa45066c22a9e3665%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.kartal.bel.tr%2Fnetgis5_rehberexp%2F%3B%3BF%3AREHBER6_GENEL_UYDUKarolar%C4%B1%3D0%2CUydu_2014%3D0%2CKENTREHBERI_FENISIMALAT%3D0%2CKENTREHBERI_FENIS%3DF5%2CKENTREHBERI_YAPI%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab2dd0214fde4457fa45066c22a9e3665%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fbelnet.kartal.bel.tr%2Fnetgis5_rehberexp%2F%3B%3BF%3AKENTREHBERI_FENISIMALAT%3D0%2CKENTREHBERI_FENIS%3DF5%2CKENTREHBERI_YAPI%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		CoordinateQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2CGenel_Uydu2%2CUydu_2014_karo%2COrtofoto_2011%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%2CUydufoto_Karo%3DFFFF%2CGenel_Uydu2%3DFFFF%2CUydu_2014_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AUydufoto_Karo%3D0%2CGenel_Uydu2%3D0%2CUydu_2014_karo%3D0%2COrtofoto_2011%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acc2111188cd54e51b054b7dfd09d5f5d%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.maltepe.bel.tr%2Fnetgis5%2F%3B%3BF%3AOrtofoto_2011%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3AKENTREHBERI_KAPI.Ba%C4%9Flant%C4%B11.KENTREHBERI_KAPI%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3AOBJECTID%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(5);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ALTAYÇEÞME");
		list.add("ALTINTEPE");
		list.add("AYDINEVLER");
		list.add("BAÐLARBAÞI");
		list.add("BAÞIBÜYÜK");
		list.add("BÜYÜKBAKKALKÖY");
		list.add("CEVÝZLÝ");
		list.add("ÇINAR");
		list.add("ESENKENT");
		list.add("FEYZULLAH");
		list.add("FINDIKLI");
		list.add("GÝRNE");
		list.add("GÜLENSU");
		list.add("GÜLSUYU");
		list.add("ÝDEALTEPE");
		list.add("KÜÇÜKYALI");
		list.add("YALI");
		list.add("ZÜMRÜTEVLER");

		
		
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

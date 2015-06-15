package org.slevin.dao.service.istanbul;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.CekmekoyParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class CekmekoyParserService extends BaseParserService implements CekmekoyParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.cekmekoy.bel.tr/keos/Map5.aspx";
		host = "webgis.cekmekoybel.tr";
		origin = "http://webgis.cekmekoy.bel.tr";
		referrer = "http://webgis.cekmekoy.bel.tr/keos/";	
		ilceName = "Çekmeköy";
		sokakQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2CUydufoto%2CUyduFoto2012%2COrtofoto%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZM5cfjM77XVUOVtBx4kFPnt0EY2r&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Frehber6_tileimages%2F%3B%3BF%3AOrtofoto%3D0%2CUydufoto%3D0%2CGenelUydu%3DFFFF%2CUyduFoto2012%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu%3D0%2CUydufoto%3D0%2CUyduFoto2012%3D0%2COrtofoto%3D0%2Ckentrehberi_poi%3DFFFFFFFFBF%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi%3DFFFFFFFFBF%2COrtofoto%3D0%2CUydufoto%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2CUydufoto%2CUyduFoto2012%2COrtofoto%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZM5cfjM77XVUOVtBx4kFPnt0EY2r&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Frehber6_tileimages%2F%3B%3BF%3AOrtofoto%3D0%2CUydufoto%3D0%2CGenelUydu%3DFFFF%2CUyduFoto2012%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu%3D0%2CUydufoto%3D0%2CUyduFoto2012%3D0%2COrtofoto%3D0%2Ckentrehberi_poi%3DFFFFFFFFBF%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi%3DFFFFFFFFBF%2COrtofoto%3D0%2CUydufoto%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu%2CUydufoto%2CUyduFoto2012%2COrtofoto%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZM5cfjM77XVUOVtBx4kFPnt0EY2r&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Frehber6_tileimages%2F%3B%3BF%3AOrtofoto%3D0%2CUydufoto%3D0%2CGenelUydu%3DFFFF%2CUyduFoto2012%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu%3D0%2CUydufoto%3D0%2CUyduFoto2012%3D0%2COrtofoto%3D0%2Ckentrehberi_poi%3DFFFFFFFFBF%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A738d6af166d34c46a7bcadee781b68c6%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.cekmekoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi%3DFFFFFFFFBF%2COrtofoto%3D0%2CUydufoto%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(3);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ALEMDAG");
		list.add("ALEMDAÐ ORMAN");
		list.add("ASKERI BÖLGE");
		list.add("ASKERI BÖLGE");
		list.add("AYDINLAR");
		list.add("ÇAMLIK");
		list.add("ÇATALMESE");
		list.add("CUMHURÝYET");
		list.add("EKÞÝOÐLU");
		list.add("GÜNGÖREN");
		list.add("HAMÝDÝYE");
		list.add("HÜSEYÝNLÝ");
		list.add("KÝRAZLIDERE");
		list.add("KOÇULLU");
		list.add("MEHMET AKÝF");
		list.add("MERKEZ");
		list.add("MÝMAR SÝNAN");
		list.add("NÝÞANTEPE");
		list.add("ÖMERLÝ");
		list.add("REÞADÝYE KÖYÜ");
		list.add("SIRAPINAR");
		list.add("SOÐUKPINAR");
		list.add("SULTANÇÝFTLÝÐÝ");
		list.add("TAÞDELEN");
		list.add("TAÞDELEN ORMANI");
		
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

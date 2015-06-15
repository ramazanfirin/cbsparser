package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BeylikduzuParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component	
@Transactional
public class BeylikduzuService extends BaseParserService implements BeylikduzuParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.beylikduzu.bel.tr/keos/Map5.aspx";
		host = "webgis.beylikduzu.bel.tr";
		origin = "http://webgis.beylikduzu.bel.tr";
		referrer = "http://webgis.beylikduzu.bel.tr/keos/";	
		ilceName = "Beylikdüzü";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AORTOFOTO6Karolar%C4%B1%2COrtofoto_2013%2CPlanKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZMuenMvY%2BOSMV%2F8GeVbKzC7f8j1%2F&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlanKaro%3D0%2CORTOFOTO6Karolar%C4%B1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AORTOFOTO6Karolar%C4%B1%3D0%2COrtofoto_2013%3D0%2CPlanKaro%3D0%2Cgeoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Ageoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2CPlanKaro%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AORTOFOTO6Karolar%C4%B1%2COrtofoto_2013%2CPlanKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZMuenMvY%2BOSMV%2F8GeVbKzC7f8j1%2F&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlanKaro%3D0%2CORTOFOTO6Karolar%C4%B1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AORTOFOTO6Karolar%C4%B1%3D0%2COrtofoto_2013%3D0%2CPlanKaro%3D0%2Cgeoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Ageoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2CPlanKaro%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AORTOFOTO6Karolar%C4%B1%2COrtofoto_2013%2CPlanKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZMuenMvY%2BOSMV%2F8GeVbKzC7f8j1%2F&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3APlanKaro%3D0%2CORTOFOTO6Karolar%C4%B1%3DFFFF%2COrtofoto_2013%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AORTOFOTO6Karolar%C4%B1%3D0%2COrtofoto_2013%3D0%2CPlanKaro%3D0%2Cgeoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Acf60a534430d42a994066764423c5ed9%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beylikduzu.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Ageoanaarter%3DFB%2Ckentrehberi_fenis%3DF2%2Cgeocop_konteyner%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2CPlanKaro%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";		
		ilceIndex = new Long(15);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("ADNAN KAHVECÝ");
		list.add("BARIÞ");
		list.add("BÜYÜKÞEHÝR");
		list.add("CUMHURÝYET");
		list.add("DEREAÐZI");
		list.add("KAVAKLI");
		list.add("MARMARA");
		list.add("SAHÝL");
		list.add("YAKUPLU");
		
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

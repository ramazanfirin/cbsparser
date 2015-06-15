package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.EsenlerParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component	
@Transactional
public class EsenlerService extends BaseParserService implements EsenlerParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.esenler.bel.tr/keos/Map5.aspx";
		host = "keos.esenler.bel.tr";
		origin = "http://keos.esenler.bel.tr";
		referrer = "http://keos.esenler.bel.tr/keos/";	
		ilceName = "Esenler";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUyduKaro%2CUyduKaro%2COfotoKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkC5wPFctFYUZSb7KtY6JKx8wsY9c%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3AGenelUyduKaro%3DFFFF%2CUyduKaro%3DFFFF%2COfotoKaro%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUyduKaro%3D0%2CUyduKaro%3D0%2COfotoKaro%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUyduKaro%2CUyduKaro%2COfotoKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkC5wPFctFYUZSb7KtY6JKx8wsY9c%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3AGenelUyduKaro%3DFFFF%2CUyduKaro%3DFFFF%2COfotoKaro%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUyduKaro%3D0%2CUyduKaro%3D0%2COfotoKaro%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUyduKaro%2CUyduKaro%2COfotoKaro%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkC5wPFctFYUZSb7KtY6JKx8wsY9c%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3AGenelUyduKaro%3DFFFF%2CUyduKaro%3DFFFF%2COfotoKaro%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUyduKaro%3D0%2CUyduKaro%3D0%2COfotoKaro%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3Acc367aee1aa34791b1fa92431fd12c2b%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.esenler.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		
		ilceIndex = new Long(16);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("BÝRLÝK");
		list.add("ÇÝFTE HAVUZLAR");
		list.add("DAVUTPAÞA");
		list.add("FATÝH");
		list.add("FEVZÝ ÇAKMAK");
		list.add("HAVAALANI");
		list.add("KAZIM KARABEKÝR");
		list.add("KEMER");
		list.add("MENDERES");
		list.add("MÝMAR SÝNAN");
		list.add("NAMIK KEMAL");
		list.add("NENE HATUN");
		list.add("ORUÇ REÝS");
		list.add("TUNA");
		list.add("TURGUT REÝS");
		list.add("YAVUZ SELÝM");
		
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

package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.KucukcekmeceParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class KucukcekmeceParserService extends BaseParserService implements KucukcekmeceParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.kucukcekmece.bel.tr/abis/Map5.aspx";
		host = "keos.kucukcekmece.bel.tr";
		origin = "http://keos.kucukcekmece.bel.tr";
		referrer = "http://keos.kucukcekmece.bel.tr/abis/";	
		ilceName = "Küçükçekmece";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A976.5615234375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6Karolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZASgcmx4XUrhLI5P9mGInYq2hSBS&__VIEWSTATEGENERATOR=BA90929B&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3D0%2Cgeoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3Ageoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A976.5615234375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6Karolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZASgcmx4XUrhLI5P9mGInYq2hSBS&__VIEWSTATEGENERATOR=BA90929B&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3D0%2Cgeoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3Ageoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CGenel_Uydu%2COrtofoto%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A06eeddcd84d54a99a517501ec0a4d039%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.gaziosmanpasa.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CGenel_Uydu%3DFFFF%2COrtofoto%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A06eeddcd84d54a99a517501ec0a4d039%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.gaziosmanpasa.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu2%3D0%2CGenel_Uydu%3D0%2COrtofoto%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A06eeddcd84d54a99a517501ec0a4d039%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.gaziosmanpasa.bel.tr%2Fnetgis5%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A976.5615234375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6Karolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZASgcmx4XUrhLI5P9mGInYq2hSBS&__VIEWSTATEGENERATOR=BA90929B&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3D0%2Cgeoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3Ageoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(22);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("ATAKENT");
				list.add("ATATÜRK");
				list.add("BEÞYOL");
				list.add("CENNET");
				list.add("CUMHURÝYET");
				list.add("FATÝH");
				list.add("FEVZÝÇAKMAK");
				list.add("GÜLTEPE");
				list.add("HALKALI MERKEZ");
				list.add("ÝNÖNÜ");
				list.add("ÝSTASYON");
				list.add("KANARYA");
				list.add("KARTALTEPE");
				list.add("KEMALPAÞA");
				list.add("MEHMET");
				list.add("SÖÐÜTLÜÇEÞME");
				list.add("SULTANMURAT");
				list.add("TEVFÝKBEY");
				list.add("YARIMBURGAZ");
				list.add("YENÝ");
				list.add("YEÞÝLOVA");
		
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

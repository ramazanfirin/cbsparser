package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.SilivriParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class SilivriParserService extends BaseParserService implements SilivriParserDao{


						
	
	public void prepare() {
		endPoint = "http://360.silivri.bel.tr/keos/Map5.aspx";
		host = "360.silivri.bel.tr";
		origin = "http://360.silivri.bel.tr";
		referrer = "http://360.silivri.bel.tr/keos/";	
		ilceName = "Silivri";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2COrtofoto_Karo%2CPlan_Tile%2CAfet_Tile%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZCEMf6KNT%2B4LUJywTtGupJNxb3HS&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AAfet_Tile%3D0%2CUydufoto_Karo%3DFFFF%2COrtofoto_Karo%3DFFFF%2CPlan_Tile%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AUydufoto_Karo%3D0%2COrtofoto_Karo%3D0%2CPlan_Tile%3D0%2CAfet_Tile%3D0%2Ckentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%2CAfet_Tile%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2COrtofoto_Karo%2CPlan_Tile%2CAfet_Tile%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZCEMf6KNT%2B4LUJywTtGupJNxb3HS&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AAfet_Tile%3D0%2CUydufoto_Karo%3DFFFF%2COrtofoto_Karo%3DFFFF%2CPlan_Tile%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AUydufoto_Karo%3D0%2COrtofoto_Karo%3D0%2CPlan_Tile%3D0%2CAfet_Tile%3D0%2Ckentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%2CAfet_Tile%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A976.5615234375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AREHBER6Karolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZASgcmx4XUrhLI5P9mGInYq2hSBS&__VIEWSTATEGENERATOR=BA90929B&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3AREHBER6Karolar%C4%B1%3D0%2Cgeoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Ab93019fcbf394f20a65e8a806538ad31%3B%3B_WS%3AAFETHRT6%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.kucukcekmece.bel.tr%2Fnetgis5%2F%3B%3BF%3Ageoafet_yol%3D0%2Ckentrehberi_afet_point%3D0%2Ckentrehberi_afet_hastane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydufoto_Karo%2COrtofoto_Karo%2CPlan_Tile%2CAfet_Tile%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZCEMf6KNT%2B4LUJywTtGupJNxb3HS&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AAfet_Tile%3D0%2CUydufoto_Karo%3DFFFF%2COrtofoto_Karo%3DFFFF%2CPlan_Tile%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AUydufoto_Karo%3D0%2COrtofoto_Karo%3D0%2CPlan_Tile%3D0%2CAfet_Tile%3D0%2Ckentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5253%3B%3B_S%3A08e87ef257fa4b978440711e567b09e0%3B%3B_WS%3AREHBER6_TILE%3B%3B_Url%3Ahttp%3A%2F%2F360.silivri.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_geocevre1%3D0%2Ckentrehberi_fenisis%3DE6%2Cgeoyol_tabela_grafik%3D0%2Cgeofenis_yol_yapim1%3D0%2Ckentrehberi_fenisimalat%3D0%2CAfet_Tile%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		
		ilceIndex = new Long(23);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("AKÖREN");
				list.add("ALÝBEY");
				list.add("ALÝPAÞA");
				list.add("BALABAN");
				list.add("BEKÝRLÝ");
				list.add("BEYCÝLER");
				list.add("BÜYÜK KILIÇLI");
				list.add("BÜYÜK SÝNEKLÝ");
				list.add("BÜYÜKÇAVUÞLU");
				list.add("ÇAYIRDERE");
				list.add("ÇELTÝK");
				list.add("CUMHURÝYET");
				list.add("DANAMANDIRA");
				list.add("FATÝH");
				list.add("FENER");
				list.add("FEVZÝPAÞA");
				list.add("GAZÝTEPE");
				list.add("GÜMÜÞYAKA");
				list.add("HÜRRÝYET");
				list.add("ÝSMETPAÞA");
				list.add("KADIKÖY");
				list.add("KAVAKLI");
				list.add("KÜÇÜK KILIÇLI");
				list.add("KÜÇÜK SÝNEKLÝ");
				list.add("KURFALLI");
				list.add("MÝMARSÝNAN");
				list.add("ORMAN ALANI");
				list.add("ORTAKÖY");
				list.add("PÝRÝ MEHMET PAÞA");
				list.add("SANCAKTEPE");
				list.add("SANCAKTEPE");
				list.add("SAYALAR");
				list.add("SELÝMPAÞA");
				list.add("SEMÝZKUMLAR");
				list.add("SEYMEN");
				list.add("YENÝ MAHALLE");
				list.add("YOLCATI");
		
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

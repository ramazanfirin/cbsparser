package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.EsenyurtParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class EsenyurtParserService extends BaseParserService implements EsenyurtParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.esenyurt.bel.tr/keos/Map5.aspx";
		host = "webgis.esenyurt.bel.tr";
		origin = "http://webgis.esenyurt.bel.tr";
		referrer = "http://webgis.esenyurt.bel.tr/keos/";	
		ilceName = "Esenyurt";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_ust%2CGenelUydu_alt%2CBELNETMAP6_TILEKarolar%C4%B1%2COrtofoto_Karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkGU2Z6%2B9rUQF0VkOav3K8KpUVPbhU%2FZMGtZ0CJRra1bA%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Frehber6_tileImages%2F%3B%3BF%3AOrtofoto_Karo%3D0%2CGenelUydu_ust%3DFFFF%2CGenelUydu_alt%3DFFFF%2CBELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu_ust%3D0%2CGenelUydu_alt%3D0%2CBELNETMAP6_TILEKarolar%C4%B1%3D0%2COrtofoto_Karo%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3Anobetci_eczane%3D0%2COrtofoto_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_ust%2CGenelUydu_alt%2CBELNETMAP6_TILEKarolar%C4%B1%2COrtofoto_Karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkGU2Z6%2B9rUQF0VkOav3K8KpUVPbhU%2FZMGtZ0CJRra1bA%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Frehber6_tileImages%2F%3B%3BF%3AOrtofoto_Karo%3D0%2CGenelUydu_ust%3DFFFF%2CGenelUydu_alt%3DFFFF%2CBELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu_ust%3D0%2CGenelUydu_alt%3D0%2CBELNETMAP6_TILEKarolar%C4%B1%3D0%2COrtofoto_Karo%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3Anobetci_eczane%3D0%2COrtofoto_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_ust%2CGenelUydu_alt%2CBELNETMAP6_TILEKarolar%C4%B1%2COrtofoto_Karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkGU2Z6%2B9rUQF0VkOav3K8KpUVPbhU%2FZMGtZ0CJRra1bA%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Frehber6_tileImages%2F%3B%3BF%3AOrtofoto_Karo%3D0%2CGenelUydu_ust%3DFFFF%2CGenelUydu_alt%3DFFFF%2CBELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3AGenelUydu_ust%3D0%2CGenelUydu_alt%3D0%2CBELNETMAP6_TILEKarolar%C4%B1%3D0%2COrtofoto_Karo%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A5254%3B%3B_S%3A6b380edc0c2443c6b997137729db6851%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.esenyurt.bel.tr%2Fnetgis5%2F%3B%3BF%3Anobetci_eczane%3D0%2COrtofoto_Karo%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";		
		
		ilceIndex = new Long(18);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("AKÇABURGAZ");
				list.add("AKEVLER");
				list.add("AKÞEMSEDDÝN");
				list.add("ARDIÇLI");
				list.add("AÞIK VEYSEL");
				list.add("ATATÜRK");
				list.add("BAÐLARÇEÞME");
				list.add("BALIKYOLU");
				list.add("BARBAROS HAYRETTÝN PAÞA");
				list.add("BATTALGAZÝ");
				list.add("CUMHURÝYET");
				list.add("ESENKENT ");
				list.add("EÞKÝNOZ");
				list.add("FATÝH");
				list.add("GÖKEVLER");
				list.add("GÜZELYURT");
				list.add("HÜRRÝYET");
				list.add("ÝNCÝRTEPE");
				list.add("ÝNÖNÜ");
				list.add("ÝSTÝKLAL");
				list.add("KAPADIK");
				list.add("KOZA");
				list.add("MEHMET AKÝF ERSOY");
				list.add("MEHTERÇEÞME");
				list.add("MEVLANA");
				list.add("NAMIK KEMAL");
				list.add("NECÝP FAZIL KISAKÜREK");
				list.add("ORHAN GAZÝ");
				list.add("ÖRNEK");
				list.add("OSMANGAZÝ");
				list.add("PINAR");
				list.add("PÝRÝ REÝS");
				list.add("SAADETDERE");
				list.add("ÞEHÝTLER");
				list.add("SELAHADDÝN EYYUBÝ");
				list.add("SÜLEYMANÝYE");
				list.add("SULTANÝYE");
				list.add("TALATPAÞA");
				list.add("TURGUT ÖZAL");
				list.add("YENÝKENT");
				list.add("YEÞÝLKENT");
				list.add("YUNUS EMRE");
				list.add("ZAFER");

		
		
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

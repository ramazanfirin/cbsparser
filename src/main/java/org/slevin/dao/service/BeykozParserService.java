package org.slevin.dao.service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.BeykozParserDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BeykozParserService extends BaseParserService implements BeykozParserDao{
    String ilceName = "Beykoz";
	String sehirName="�stanbul";
	Long sehirId=new Long(1);
	Long ilceIndex=new Long(2);
	
	static final String endPoint = "http://webgis.beykoz.bel.tr/keos/Map5.aspx";
	static final String host = "webgis.beykoz.bel.tr";
	static final String origin = "http://webgis.beykoz.bel.tr";
	static final String referrer = "http://webgis.beykoz.bel.tr/keos/";
	
	public String getIlceName() throws Exception {
		// TODO Auto-generated method stub
		return "Beykoz";
	}
	
	public Long getIlceIndex(){
		// TODO Auto-generated method stub
		return ilceIndex;
	}
	
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
	
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ACARLAR");
		list.add("AKBABA");
		list.add("AL�BAHADIR");
		list.add("ANADOLUFENER�");
		list.add("ANADOLUH�SARI");
		list.add("ANADOLUKAVA�I");
		list.add("BAKLACI");
		list.add("BOZHANE");
		list.add("�AMLIBAH�E");
		list.add("�ENGELDERE");
		list.add("��FTL�K");
		list.add("���DEM");
		list.add("�UBUKLU");
		list.add("CUMHUR�YET");
		list.add("DERESEK�");
		list.add("ELMALI");
		list.add("FAT�H");
		list.add("G�KSU");
		list.add("G�LL�");
		list.add("G�RELE");
		list.add("G�ZTEPE");
		list.add("G�M��SUYU");
		list.add("�NC�RK�Y");
		list.add("�SHAKLI");
		list.add("KANLICA");
		list.add("KAVACIK");
		list.add("KAYNARCA");
		list.add("MAHMUT�EVKETPA�A");
		list.add("MERKEZ");
		list.add("���MCE");
		list.add("�RNEKK�Y");
		list.add("ORTA�E�ME");
		list.add("PA�ABAH�E");
		list.add("PA�AMANDIRA");
		list.add("POLONEZK�Y");
		list.add("POYRAZK�Y");
		list.add("R�VA");
		list.add("R�ZGARLIBAH�E");
		list.add("SO�UKSU");
		list.add("TOKATK�Y");
		list.add("YALIK�Y");
		list.add("YAVUZSEL�M");
		list.add("YEN�MAHALLE");
		list.add("ZERZEVAT�I");
		return list;
	}

	public String getEndpoint() throws Exception {
		// TODO Auto-generated method stub
		return endPoint;
	}

	public String getHost() throws Exception {
		// TODO Auto-generated method stub
		return host;
	}

	public String getOrigin() throws Exception {
		// TODO Auto-generated method stub
		return origin;
	}

	public String getReferrer() throws Exception {
		// TODO Auto-generated method stub
		return referrer;
	}

	public String getSokakQuery(String sokak) throws Exception {
		String query = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Abc92a366d13b417cb2cd257d1a457955%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Abc92a366d13b417cb2cd257d1a457955%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Abc92a366d13b417cb2cd257d1a457955%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A"+URLEncoder.encode(sokak, "UTF-8")+"%3B";
		return query;
	}

	public String getBinaQuery(String sokak) throws Exception {
		String query = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab1a95cfca68c44bea26efde5fa29a665%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Ab1a95cfca68c44bea26efde5fa29a665%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab1a95cfca68c44bea26efde5fa29a665%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A"+ URLEncoder.encode(sokak, "UTF-8") + "%3B";
		return query;
	}

	public String getCoordinateQuery(String bina) throws Exception {
		String query = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3Aobjectid%3BSQLValue%3A"+URLEncoder.encode(bina, "UTF-8")+"%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		return query;
	}

	
		


}

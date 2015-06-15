package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.KadikoyParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class KadikoyParserService extends BaseParserService implements KadikoyParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.kadikoy.bel.tr/keos/Map5.aspx";
		host = "webgis.kadikoy.bel.tr";
		origin = "http://webgis.kadikoy.bel.tr";
		referrer = "http://webgis.kadikoy.bel.tr/keos/";	
		ilceName = "Kadýkoy";
		
		sokakQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydu_Genel_Dosya%2CUydu_Butun%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkqu8QzsSi3C1LH3LdS2JIgDBfGyk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgistile_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3DFFFF%2CUydu_Butun%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3D0%2CUydu_Butun%3D0%2Ckentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		
		BinaQuery =	"OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydu_Genel_Dosya%2CUydu_Butun%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkqu8QzsSi3C1LH3LdS2JIgDBfGyk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgistile_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3DFFFF%2CUydu_Butun%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3D0%2CUydu_Butun%3D0%2Ckentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUydu_Genel_Dosya%2CUydu_Butun%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkqu8QzsSi3C1LH3LdS2JIgDBfGyk%3D&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgistile_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3DFFFF%2CUydu_Butun%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AUydu_Genel_Dosya%3D0%2CUydu_Butun%3D0%2Ckentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6d136806f0284130911f18688a96c136%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.kadikoy.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_poi1%3D0%2Ckentrehberi_heykel%3D0%2Cgeopark_sinir%3D0%2Ckentrehberi_parsel%3D0%2Ckentrehberi_fenisimalat%3D0%2Ckentrehberi_yapi%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(6);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("19 MAYIS");
		list.add("ACIBADEM");
		list.add("BOSTANCI");
		list.add("CADDEBOSTAN");
		list.add("CAFERAÐA");
		list.add("DUMLUPINAR");
		list.add("EÐÝTÝM");
		list.add("ERENKÖY");
		list.add("FENERBAHÇE");
		list.add("FENERYOLU");
		list.add("FÝKÝRTEPE");
		list.add("GÖZTEPE");
		list.add("HASANPAÞA");
		list.add("KOÞUYOLU");
		list.add("KOZYATAÐI");
		list.add("MERDÝVENKÖY");
		list.add("OSMANAÐA");
		list.add("RASÝMPAÞA");
		list.add("SAHRAYI CEDÝT");
		list.add("SUADÝYE");
		list.add("ZÜHTÜPAÞA");
		
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

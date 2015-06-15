package org.slevin.dao.service;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.slevin.common.Ilce;
import org.slevin.common.Mahalle;
import org.slevin.common.Sehir;
import org.slevin.common.Sokak;
import org.slevin.dao.AtasehirParserDao;
import org.slevin.util.NetgisParseUtil;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cbs.istanbul.model.BaseModel;

@Component
@Transactional
public class AtasehirParserService extends BaseParserService implements AtasehirParserDao{
    String ilceName = "Ataþehir";
	String sehirName="Ýstanbul";
	Long sehirId=new Long(1);
	Long ilceIndex=new Long(1);
	
	static final String endPoint = "http://webgis.atasehir.bel.tr/keos/Map5.aspx?workspacename=REHBER6_EXPORT";
	static final String host = "webgis.atasehir.bel.tr";
	static final String origin = "http://webgis.atasehir.bel.tr";
	static final String referrer = "http://webgis.atasehir.bel.tr/keos/?workspacename=REHBER6_EXPORT";
	
	public void prepare() {
		// TODO Auto-generated method stub
		
	}

	
	public void insertIlce() throws Exception {
		Sehir sehir = sehirService.findById(sehirId);
		Ilce ilce = new Ilce();
		ilce.setName(ilceName);
		ilce.setComplated(false);
		ilce.setSehir(sehir);
		ilceService.merge(ilce);
	}

	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("Aþýk Veysel");
		list.add("Atatürk");
		list.add("Barbaros");
		list.add("Ferhatpaþa");
		list.add("Fetih");
		list.add("Ýçerenköy");
		list.add("Ýnönü");
		list.add("Kayýþdaðý");
		list.add("Küçükbakkalköy");
		list.add("Mevlana");
		list.add("Mimar Sinan");
		list.add("Mustafa Kemal");
		list.add("Örnek");
		list.add("Yeni Çamlýca");
		list.add("Yeni Sahra");
		list.add("Yeniþehir");
		return list;
	}

	public String getIlceName() throws Exception {
		// TODO Auto-generated method stub
		return ilceName;
	}

	
	public Long getIlceIndex() {
		// TODO Auto-generated method stub
		return ilceIndex;
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
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A"+URLEncoder.encode(sokak, "UTF-8")+"%3B";
		return query;
	}

	public String getBinaQuery(String sokak) throws Exception {
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A" +URLEncoder.encode(sokak, "UTF-8")+ "%3B";
		return query;
	}

	public String getCoordinateQuery(String bina) throws Exception {
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3AKentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A"+URLEncoder.encode(bina, "UTF-8")+"%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		return query;
	}

	

		


}

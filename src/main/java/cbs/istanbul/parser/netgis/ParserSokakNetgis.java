package cbs.istanbul.parser.netgis;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.interfaces.ParserSokak;

public class ParserSokakNetgis extends ParserBaseNetgis implements ParserSokak{
	
	public ParserSokakNetgis(String endPoint, String host, String origin,String referrer) {
		super(endPoint, host, origin, referrer);
		// TODO Auto-generated constructor stub
	}


	static String test = "sItems:3064. Sokak:6029;;3065. Sokak:3410;;3066. Sokak:3411;;A�ELYA Sokak:3334;;AHLAT Sokak:3774;;AK ZAMBAK Sokak:716;;AKAY Sokak:210502;;AKINCILAR Sokak:1735;;AKINLAR �IKMAZI Sokak:1767;;AKSOY Sokak:324;;AKT�RK Sokak:3506;;ALBAYRAKLI Sokak:3120;;ALINTER� Sokak:6582;;APAYDIN Sokak:192;;ARAYOL Belirtilmemi�:22150;;ARDI� Sokak:6414;;ATA�EH�R Bulvar:4715;;ATAT�RK Cadde:343;;AYKUTLAR Sokak:2490;;AYKUTLU Sokak:6553;;AYVANSARAY Sokak:3121;;AZ�ZLER Sokak:853;;BA�LANTI YOLU Belirtilmemi�:21092;;BAH�EC�K Sokak:3493;;BAH�EM Sokak:6981;;BARBAROS Cadde:2513;;BARBAROS HAYRETT�N PA�A Sokak:2145;;BA�ARAN Sokak:435;;BAYRAK Sokak:2747;;BAYRAM Sokak:6979;;BEGONYA Sokak:1351;;B�LAL �IKMAZI Sokak:1691;;B�R�C�K Sokak:3018;;B�RL�K Sokak:3929;;�AKIR Sokak:6579;;�ANKAYA Sokak:2284;;CEBEL� Sokak:1597;;�ELEB� Sokak:3538;;�EL�K Sokak:4710;;�E�MEC� Sokak:3416;;�E�MELER Sokak:2728;;���DEM Sokak:3332;;�ILDIR Sokak:3414;;��MEN Sokak:2713;;�IRAK Sokak:6554;;��ZG� Sokak:1736;;�OBANO�LU Sokak:6032;;D-100 Belirtilmemi�:821;;DARENDE Sokak:2845;;D�LEK A�ACI Sokak:6031;;DO�AN Sokak:6404;;DO�U Sokak:2844;;DURMAZ Sokak:4363;;EMN�YETL� Sokak:1731;;ERS�N Sokak:6406;;ERS�NMEZ Sokak:2489;;ERZURUMLU Sokak:463;;EVREN Cadde:464;;FESLE�EN Sokak:2390;;FEVZ� �AKMAK PA�A Cadde:1391;;GEL�N Sokak:7098;;GEL�NC�K Sokak:6532;;GEM�C�LER Sokak:3437;;G�KTA� Sokak:325;;G�L Sokak:3331;;G�LPINAR Sokak:3991;;G�VENL� Sokak:3581;;HAB�RE YAH�� Sokak:2743;;HALK Cadde:1074;;HALK YAN YOLU Cadde:6976;;HASG�L Sokak:3015;;H�LLS�DE C�TY CLUB �� YOLU Sokak:25844;;HUZUR Cadde:7479;;IHLAMUR Bulvar:4357;;�K�ZLER Sokak:6402;;�SK� �ANT�YE �� YOLU Sokak:26241;;�STANBUL Cadde:1729;;KALE Sokak:3586;;KARANF�L Sokak:2117;;KARDELEN Sokak:1595;;KAYACAN Sokak:3426;;KAZIM KARABEK�R Cadde:2741;;KELEBEK Cadde:3521;;KELK�T Sokak:422;;KENT Sokak:3990;;KIRMIZI ATLAS Sokak:2725;;KIZIL BEGONYA Sokak:3775;;KORDON Sokak:3505;;KORKMAZ Sokak:856;;K�SELER Sokak:6512;;KOZYATA�I K�PR�L� KAV�A�I Sokak:1593;;KUTLAY Sokak:3537;;LALE Sokak:6547;;MAC�T Sokak:322;;MEHMET AK�F ERSOY Sokak:1690;;MEL�S Sokak:6509;;MERDANE Sokak:1761;;MESUD�YE Sokak:857;;MET�NOL Sokak:5575;;METRO ALI�VER�� MERKEZ� OTOPARKI �� YOLU Sokak:20289;;M�MAR S�NAN Cadde:260;;M�MAR S�NAN YANYOL Cadde:1453;;MOR AMBER Sokak:1903;;MOR LEYLAK Sokak:3336;;MOR MENEK�E Sokak:1208;;MOR S�MB�L Sokak:3997;;MOR ZAMBAK Sokak:6889;;MURAT Sokak:3583;;NAZIM Sokak:1727;;NAZLIG�L Sokak:1701;;NES�MBEY Sokak:3122;;NES�ME HANIM Sokak:2711;;N�L�FER Sokak:3449;;NUSRETBEY Sokak:3418;;O-2 Belirtilmemi�:3254;;O-4 Belirtilmemi�:6603;;�NC� Sokak:4612;;ORDU Cadde:1247;;ORTABAHAR Sokak:5339;;�ZGED�K Sokak:1902;;PINARSU Sokak:1732;;SARI M�MOZA Sokak:6552;;SARKA� Sokak:1207;;�EBBOY Sokak:5424;;SELAN�K Cadde:1898;;�EN Sokak:194;;SEV�ND�K Sokak:6583;;SEZERC�K Sokak:3436;;S�TE �� YOL Sokak:26548;;S�YAH �NC� Sokak:3504;;S�NMEZ Sokak:3732;;S�NMEZLER Sokak:2488;;SUSUZ Sokak:5337;;S�T�� YOLU Cadde:6792;;TA�LIYOL Sokak:4863;;TEM Belirtilmemi�:5619;;TEMMUZ Sokak:6580;;T�MUR Sokak:3221;;TOKTA� Sokak:1700;;TR�O S�TES� �� YOLU Sokak:21950;;T�MER Sokak:2718;;U�UR Sokak:326;;UZMAN Sokak:6516;;UZUNLAR Sokak:421;;VEN�S Sokak:21861;;VER�L Sokak:855;;V��NE Sokak:1895;;YAMAN Sokak:319;;YAVUZ SEL�M Cadde:1776;;YAVUZLAR Cadde:4607;;YEN�SAHRA K�PR�L� KAV�A�I Sokak:3955;;YE��L BAH�E Sokak:3494;;YE��L��M Sokak:3483;;Y���T Sokak:295;;YILDIRIM BEYAZIT Cadde:977;;YILDIRIM Sokak:3503;;ZAFER Sokak:6405;;ZALO�LU Cadde:5173;;;Control:OldSearch1_cmb2;Provider:TestWebgisProvider;";
	

	public  List<BaseModel> parseResult(String mahalleName) throws Exception{
		List<BaseModel> resultList = new ArrayList<BaseModel>();
		String result= parseHTTPResult(mahalleName);
		
		String temp= result;
		temp = temp.replace("sItems:", "");
		temp = temp.replace(";;;Control:OldSearch1_cmb2;Provider:TestWebgisProvider;", "");
		
		String[] list1 = temp.split(";;");
		for (int i = 0; i < list1.length; i++) {
			String tempItem =list1[i];
			String[] list2 = tempItem.split(":");
			resultList.add(new BaseModel(list2[0], list2[1]));
		}
		return resultList;
	}
	


	@Override
	public String parseHTTPResult(String mahalleName) throws Exception {
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A"+URLEncoder.encode(mahalleName, "UTF-8")+"%3B";
		return NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
	}
	
	
	public static void main(String[] args) throws Exception {
		ParserSokakNetgis parser = new ParserSokakNetgis("","","","");
		List<BaseModel> list=parser.parseResult(test);
		System.out.println("bitti");
	}
} 

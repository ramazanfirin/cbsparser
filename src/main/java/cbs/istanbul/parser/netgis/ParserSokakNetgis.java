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


	static String test = "sItems:3064. Sokak:6029;;3065. Sokak:3410;;3066. Sokak:3411;;AÇELYA Sokak:3334;;AHLAT Sokak:3774;;AK ZAMBAK Sokak:716;;AKAY Sokak:210502;;AKINCILAR Sokak:1735;;AKINLAR ÇIKMAZI Sokak:1767;;AKSOY Sokak:324;;AKTÜRK Sokak:3506;;ALBAYRAKLI Sokak:3120;;ALINTERÝ Sokak:6582;;APAYDIN Sokak:192;;ARAYOL Belirtilmemiþ:22150;;ARDIÇ Sokak:6414;;ATAÞEHÝR Bulvar:4715;;ATATÜRK Cadde:343;;AYKUTLAR Sokak:2490;;AYKUTLU Sokak:6553;;AYVANSARAY Sokak:3121;;AZÝZLER Sokak:853;;BAÐLANTI YOLU Belirtilmemiþ:21092;;BAHÇECÝK Sokak:3493;;BAHÇEM Sokak:6981;;BARBAROS Cadde:2513;;BARBAROS HAYRETTÝN PAÞA Sokak:2145;;BAÞARAN Sokak:435;;BAYRAK Sokak:2747;;BAYRAM Sokak:6979;;BEGONYA Sokak:1351;;BÝLAL ÇIKMAZI Sokak:1691;;BÝRÝCÝK Sokak:3018;;BÝRLÝK Sokak:3929;;ÇAKIR Sokak:6579;;ÇANKAYA Sokak:2284;;CEBELÝ Sokak:1597;;ÇELEBÝ Sokak:3538;;ÇELÝK Sokak:4710;;ÇEÞMECÝ Sokak:3416;;ÇEÞMELER Sokak:2728;;ÇÝÐDEM Sokak:3332;;ÇILDIR Sokak:3414;;ÇÝMEN Sokak:2713;;ÇIRAK Sokak:6554;;ÇÝZGÝ Sokak:1736;;ÇOBANOÐLU Sokak:6032;;D-100 Belirtilmemiþ:821;;DARENDE Sokak:2845;;DÝLEK AÐACI Sokak:6031;;DOÐAN Sokak:6404;;DOÐU Sokak:2844;;DURMAZ Sokak:4363;;EMNÝYETLÝ Sokak:1731;;ERSÝN Sokak:6406;;ERSÖNMEZ Sokak:2489;;ERZURUMLU Sokak:463;;EVREN Cadde:464;;FESLEÐEN Sokak:2390;;FEVZÝ ÇAKMAK PAÞA Cadde:1391;;GELÝN Sokak:7098;;GELÝNCÝK Sokak:6532;;GEMÝCÝLER Sokak:3437;;GÖKTAÞ Sokak:325;;GÜL Sokak:3331;;GÜLPINAR Sokak:3991;;GÜVENLÝ Sokak:3581;;HABÝRE YAHÞÝ Sokak:2743;;HALK Cadde:1074;;HALK YAN YOLU Cadde:6976;;HASGÜL Sokak:3015;;HÝLLSÝDE CÝTY CLUB ÝÇ YOLU Sokak:25844;;HUZUR Cadde:7479;;IHLAMUR Bulvar:4357;;ÝKÝZLER Sokak:6402;;ÝSKÝ ÞANTÝYE ÝÇ YOLU Sokak:26241;;ÝSTANBUL Cadde:1729;;KALE Sokak:3586;;KARANFÝL Sokak:2117;;KARDELEN Sokak:1595;;KAYACAN Sokak:3426;;KAZIM KARABEKÝR Cadde:2741;;KELEBEK Cadde:3521;;KELKÝT Sokak:422;;KENT Sokak:3990;;KIRMIZI ATLAS Sokak:2725;;KIZIL BEGONYA Sokak:3775;;KORDON Sokak:3505;;KORKMAZ Sokak:856;;KÖSELER Sokak:6512;;KOZYATAÐI KÖPRÜLÜ KAVÞAÐI Sokak:1593;;KUTLAY Sokak:3537;;LALE Sokak:6547;;MACÝT Sokak:322;;MEHMET AKÝF ERSOY Sokak:1690;;MELÝS Sokak:6509;;MERDANE Sokak:1761;;MESUDÝYE Sokak:857;;METÝNOL Sokak:5575;;METRO ALIÞVERÝÞ MERKEZÝ OTOPARKI ÝÇ YOLU Sokak:20289;;MÝMAR SÝNAN Cadde:260;;MÝMAR SÝNAN YANYOL Cadde:1453;;MOR AMBER Sokak:1903;;MOR LEYLAK Sokak:3336;;MOR MENEKÞE Sokak:1208;;MOR SÜMBÜL Sokak:3997;;MOR ZAMBAK Sokak:6889;;MURAT Sokak:3583;;NAZIM Sokak:1727;;NAZLIGÜL Sokak:1701;;NESÝMBEY Sokak:3122;;NESÝME HANIM Sokak:2711;;NÝLÜFER Sokak:3449;;NUSRETBEY Sokak:3418;;O-2 Belirtilmemiþ:3254;;O-4 Belirtilmemiþ:6603;;ÖNCÜ Sokak:4612;;ORDU Cadde:1247;;ORTABAHAR Sokak:5339;;ÖZGEDÝK Sokak:1902;;PINARSU Sokak:1732;;SARI MÝMOZA Sokak:6552;;SARKAÇ Sokak:1207;;ÞEBBOY Sokak:5424;;SELANÝK Cadde:1898;;ÞEN Sokak:194;;SEVÝNDÝK Sokak:6583;;SEZERCÝK Sokak:3436;;SÝTE ÝÇ YOL Sokak:26548;;SÝYAH ÝNCÝ Sokak:3504;;SÖNMEZ Sokak:3732;;SÖNMEZLER Sokak:2488;;SUSUZ Sokak:5337;;SÜTÇÜ YOLU Cadde:6792;;TAÞLIYOL Sokak:4863;;TEM Belirtilmemiþ:5619;;TEMMUZ Sokak:6580;;TÝMUR Sokak:3221;;TOKTAÞ Sokak:1700;;TRÝO SÝTESÝ ÝÇ YOLU Sokak:21950;;TÜMER Sokak:2718;;UÐUR Sokak:326;;UZMAN Sokak:6516;;UZUNLAR Sokak:421;;VENÜS Sokak:21861;;VERÝL Sokak:855;;VÝÞNE Sokak:1895;;YAMAN Sokak:319;;YAVUZ SELÝM Cadde:1776;;YAVUZLAR Cadde:4607;;YENÝSAHRA KÖPRÜLÜ KAVÞAÐI Sokak:3955;;YEÞÝL BAHÇE Sokak:3494;;YEÞÝLÇÝM Sokak:3483;;YÝÐÝT Sokak:295;;YILDIRIM BEYAZIT Cadde:977;;YILDIRIM Sokak:3503;;ZAFER Sokak:6405;;ZALOÐLU Cadde:5173;;;Control:OldSearch1_cmb2;Provider:TestWebgisProvider;";
	

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

package org.slevin.util;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.util.StringUtils;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.Coordinate;
import cbs.istanbul.parser.netgis.NetGisUtil;

public class NetgisParseUtil {

	public static List<BaseModel> parseSokakResult(String mahalleName,String endPoint,String referrer,String origin,String host,String query) throws Exception{
		List<BaseModel> resultList = new ArrayList<BaseModel>();
		String result= parseSokakHTTPResult(mahalleName,endPoint, referrer, origin, host,query);
		
		String temp= result;
		temp = temp.replace("sItems:", "");
		temp = temp.replace(";;;Control:OldSearch1_cmb2;Provider:TestWebgisProvider;", "");
		
		String[] list1 = temp.split(";;");
		for (int i = 0; i < list1.length; i++) {
			String tempItem =list1[i];
			String[] list2 = tempItem.split(":");
			if("243".equals(list2[1]))
				System.out.println("dikkat");
			
			
			byte[] ptext = list2[0].getBytes();
			String d = new String(ptext,"ISO-8859-9");
			String e = new String(ptext,UTF_8);
			Charset.forName("UTF-8").encode(list2[0]);
			//ISO-8859-9
			//Locale l = StringUtils.
			
			resultList.add(new BaseModel(e, list2[1]));
		}
		return resultList;
	}
	
	public static String parseSokakHTTPResult(String mahalleName,String endPoint,String referrer,String origin,String host,String query) throws Exception {
		//String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A"+URLEncoder.encode(mahalleName, "UTF-8")+"%3B";
		return NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
	}
	
	public static List<BaseModel> parseBinaList(String sokakName,String endPoint,String referrer,String origin,String host,String query) throws Exception{
		List<BaseModel> resultList = new ArrayList<BaseModel>();
		String result= parseBinaHTTPResult(sokakName,endPoint,referrer,origin,host,query);
		System.out.println(result+" "+sokakName +" "+endPoint+ " "+ query);
		String temp= result;
		temp = temp.replace("sItems:", "");
		temp = temp.replace(";;;Control:OldSearch1_cmb3;Provider:TestWebgisProvider;", "");
		
		String[] list1 = temp.split(";;");
		for (int i = 0; i < list1.length; i++) {
			String tempItem =list1[i];
			String[] list2 = tempItem.split(":");
			resultList.add(new BaseModel(list2[0], list2[1]));
		}
		
		return resultList;
	}


	public static String parseBinaHTTPResult(String sokakName,String endPoint,String referrer,String origin,String host,String query) throws Exception{
		//String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A" +URLEncoder.encode(sokakName, "UTF-8")+ "%3B";
		return NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
	}
	
	
	
	public static String parseCoordinateHTTPResult(String binaNo,String endPoint,String referrer,String origin,String host,String query) throws Exception{
		//String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3AKentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A"+URLEncoder.encode(binaNo, "UTF-8")+"%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		//System.out.println("");
		String result= NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
		
		

		return result;
	}

	
	public static  Coordinate parseCoordinate(String bina,String endPoint,String referrer,String origin,String host,String query) throws Exception {
		String result =parseCoordinateHTTPResult(bina,endPoint,referrer,origin,host, query);
		String a[] =result.split("center=");
		String b[] = a[1].split("xmlns:fo=");
		String c= b[0].replace("\"", "");
		c= c.replace("\\", "");
		String[] d= c.split(",");
		Coordinate coordinate = new Coordinate();
		coordinate.setLat(d[0]);
		coordinate.setLng(d[1]);
		return coordinate;
	}
	
	public static void main(String[] args) throws Exception{
		 final String endPoint = "http://webgis.beykoz.bel.tr/keos/Map5.aspx";
		final String host = "webgis.beykoz.bel.tr";
		final String origin = "http://webgis.beykoz.bel.tr";
		final String referrer = "http://webgis.beykoz.bel.tr/keos/";
		String bina="58945";
		String mahalleName = "Aþýk Veysel";
		String query = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A4878354d8886406c9875bc78cf64f5a9%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3Aobjectid%3BSQLValue%3A"+URLEncoder.encode(bina, "UTF-8")+"%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		//query="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3Aobjectid%3BSQLValue%3A58945%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		//query="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu_Karo_10000%2CGenelUydu_Karo_1000%2COrtofoto_karo%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZDOB6GaVlRmBzZwdqtppDITPgCAh&__VIEWSTATEGENERATOR=D4B2A915&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3DFFFF%2CGenelUydu_Karo_1000%3DFFFF%2COrtofoto_karo%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu_Karo_10000%3D0%2CGenelUydu_Karo_1000%3D0%2COrtofoto_karo%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3A6f5880d7213f401f9c4ef34b5afa309b%3B%3B_WS%3AREHBER6_ISTKA%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.beykoz.bel.tr%2Fnetgis5_rehber6%2F%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3ANUMARATAJ%3BSQLColumn%3Aobjectid%3BSQLValue%3A58945%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		Coordinate a =parseCoordinate(mahalleName, endPoint, referrer, origin, host,query);
		System.out.println("bitti");
	}
}

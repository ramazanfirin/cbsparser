package cbs.istanbul.parser.netgis;

import java.net.URLEncoder;

import cbs.istanbul.model.Coordinate;
import cbs.istanbul.model.interfaces.ParserCoordinate;

public class ParserCoordinateNetgis extends ParserBaseNetgis implements ParserCoordinate{


	public ParserCoordinateNetgis(String endPoint, String host, String origin,
			String referrer) {
		super(endPoint, host, origin, referrer);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String parseHTTPResult(String binaNo) throws Exception{
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A6a888bb7f40549169da5eefb328c2f38%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3AKentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A"+URLEncoder.encode(binaNo, "UTF-8")+"%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		System.out.println("");
		String result= NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
		
		

		return result;
	}

	
	public Coordinate parseCoordinate(String bina) throws Exception {
		String result =parseHTTPResult(bina);
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

}

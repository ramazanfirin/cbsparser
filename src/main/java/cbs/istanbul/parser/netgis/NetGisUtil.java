package cbs.istanbul.parser.netgis;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.LaxRedirectStrategy;

public class NetGisUtil {

	public static String callHttp(String endPoint,String referrer,String origin,String host,String query) throws Exception{
		
//		Authenticator authenticator = new Authenticator() {
//
//	        public PasswordAuthentication getPasswordAuthentication() {
//	            return (new PasswordAuthentication("user",
//	                    "password".toCharArray()));
//	        }
//	    };
//	    
//	    Authenticator.setDefault(authenticator);
		
//		System.setProperty("http.proxyHost", "10.200.125.229");
//		System.setProperty("http.proxyPort", "80");
//		
//		System.setProperty("http.proxyUser", "ETR00529");
//		System.setProperty("http.proxyPassword", "Elifcan2");
		
		//HttpClient client = HttpClientBuilder.create().build();
		HttpClient client = HttpClientBuilder.create().setRedirectStrategy(new LaxRedirectStrategy()).build();
		HttpPost post = new HttpPost(endPoint);
	 
		// add header
		post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/38.0.2125.111 Safari/537.36");
		post.setHeader("Referer", referrer);
		post.setHeader("Proxy-Connection", "keep-alive");
		post.setHeader("Origin", origin);
		post.setHeader("Host",host);
		post.setHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
		post.setHeader("Accept","*/*");
		post.setHeader("Accept-Encoding","gzip,deflate");
		post.setHeader("Accept-Language","tr-TR,tr;q=0.8,en-US;q=0.6,en;q=0.4");
		//post.setHeader("Cookie","ASP.NET_SessionId=a4qbh355jw4uqemewgjhbq55; ");
		//post.setHeader("Cookie","__NetigmaAntiXsrfToken=ba4d5c16-3804-4f60-aefd-84e6cb6cdb68");
		
	post.setEntity(new StringEntity(query));
		HttpResponse response = client.execute(post);
		System.out.println("Response Code : "  + response.getStatusLine().getStatusCode());
		if(response.getStatusLine().getStatusCode()!=200)
			throw new Exception("status code error:"+response.getStatusLine().getStatusCode());
			
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
 
		StringBuffer result = new StringBuffer();
		String line = "";
		while ((line = rd.readLine()) != null) {
			result.append(line);
		}
//		String temp = URLDecoder.decode(result.toString(),"ISO-8859-9");
//		String aa = new String(result.toString().getBytes(),"UTF8");
		System.out.println(response.getStatusLine().getStatusCode()+":"+ result.toString());
		return result.toString();
	}
	
	public static void main(String[] args) {
	//	String a="s{\"MapId\":\"NCWebMap1\",\"FProvider\":\"TestWebgisProvider\",\"AjaxAttributes\":\"Command:GetWebgisInfoXml;Table:Kentrehberi_kapi.Baðlantý1.kentrehberi_kapi;Provider:TestWebgisProvider;Layout:KAPI;SQLColumn:objectid;SQLValue:189656;SQLOperator:Equal;GoTo:1;GoToAndRender:1;HighLight:1;","RenderTag-":"<?xml version=\"1.0\" encoding=\"utf-16\"?><table class=\"item\" layername=\"kentrehberi_kapi1\" fad=\"Kentrehberi_kapi.Baðlantý1.kentrehberi_kapi\" mapprovider=\"TestWebgisProvider\" cellspacing=\"0\" cellpadding=\"0\" keycolumn=\"objectid\" fid=\"189656\" bbox=\"4540888.9162150826,423668.67337431258,4540888.9162150826,423668.67337431258\" center=\"4540888.9162150826,423668.67337431258\" xmlns:fo=\"http://www.w3.org/1999/XSL/Format\"><tr class=\"rw0\"><td class=\"labeltd\"><div class=\"label\">Mahalle Adý </div></td><td class=\"datatd\"><div f=\"mahalle_adi\" class=\"data\" title=\"\">Mustafa Kemal</div></td></tr><tr class=\"rw1\"><td class=\"labeltd\"><div class=\"label\">Yol Adý </div></td><td class=\"datatd\"><div f=\"yol_adi\" class=\"data\" title=\"\">3064.Sokak</div></td></tr><tr class=\"rw0\"><td class=\"labeltd\"><div class=\"label\">Kapý No </div></td><td class=\"datatd\"><div f=\"kapi_no\" class=\"data\" title=\"\">11</div></td></tr><tr><td colspan=\"2\" class=\"link\" title=\"\"><input type=\"button\" onclick=\"WebgisInfoXmlHighLight2(true,\'NCWebgisXmlInfo1\',\'TestWebgisProvider\',\'kentrehberi_kapi.Baðlantý1.kentrehberi_kapi\', \'objectid=189656\', \'\');InsNCWebMap1.setWindow(4540888.9162150826,423668.67337431258,4540888.9162150826,423668.67337431258,0.50)\" value=\"Harita\" title=\"\"></input></td></tr></table>","RunScript-":"SetFindMarks(\'NCWebgisXmlInfo1\')"}";
	}
}

package cbs.istanbul.parser.netgis;

import java.io.UnsupportedEncodingException;



public abstract class ParserBaseNetgis{
	String endPoint;
	String host;
	String origin;
	String referrer;
	
	
	

	public ParserBaseNetgis(String endPoint, String host, String origin,
			String referrer) {
		super();
		this.endPoint = endPoint;
		this.host = host;
		this.origin = origin;
		this.referrer = referrer;
	}



	//public abstract List<BaseModel> parseResult(String mahalleName);
	public abstract String parseHTTPResult(String mahalleName) throws Exception;
	
	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getReferrer() {
		return referrer;
	}

	public void setReferrer(String referrer) {
		this.referrer = referrer;
	}

}

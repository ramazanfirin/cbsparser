package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.TuzlaParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class TuzlaParserService extends BaseParserService implements TuzlaParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.tuzla.bel.tr/keos/Map5.aspx";
		host = "webgis.tuzla.bel.tr";
		origin = "http://tuzla.kadikoy.bel.tr";
		referrer = "http://tuzla.kadikoy.bel.tr/keos/";	
		ilceName = "Tuzla";
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUyduFoto_Genel_v1%2CUyduFoto_Genel_v2%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkSIrWzzonPzSJnEDsJv3Qc2GIEu6EqjDdrtzuzrrl%2B4o%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3DFFFF%2CUyduFoto_Genel_v2%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3D0%2CUyduFoto_Genel_v2%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";				
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUyduFoto_Genel_v1%2CUyduFoto_Genel_v2%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkSIrWzzonPzSJnEDsJv3Qc2GIEu6EqjDdrtzuzrrl%2B4o%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3DFFFF%2CUyduFoto_Genel_v2%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3D0%2CUyduFoto_Genel_v2%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AUyduFoto_Genel_v1%2CUyduFoto_Genel_v2%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkSIrWzzonPzSJnEDsJv3Qc2GIEu6EqjDdrtzuzrrl%2B4o%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3DFFFF%2CUyduFoto_Genel_v2%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3AUyduFoto_Genel_v1%3D0%2CUyduFoto_Genel_v2%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aded645c13f5b44fdb3679129e1999a6d%3B%3B_WS%3AREHBER6%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.tuzla.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_yol%3D0%2Ckentrehberi_yapi_point%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";	
		ilceIndex = new Long(10);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("AKFIRAT ");
		list.add("ANADOLU");
		list.add("ASKERÝ BÖLGE");
		list.add("AYDINLI");
		list.add("AYDINTEPE");
		list.add("CAMÝ");
		list.add("EVLÝYA ÇELEBÝ");
		list.add("FATÝH");
		list.add("ÝÇMELER");
		list.add("ÝSTASYON");
		list.add("MESCÝT");
		list.add("MÝMAR SÝNAN");
		list.add("ORHANLI");
		list.add("ORTA ");
		list.add("POSTANE");
		list.add("ÞÝFA");
		list.add("TEPEOREN");
		list.add("YAYLA");

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

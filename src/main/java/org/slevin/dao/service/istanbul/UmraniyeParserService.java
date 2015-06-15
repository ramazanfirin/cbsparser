package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.UmraniyeParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class UmraniyeParserService extends BaseParserService implements UmraniyeParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.umraniye.bel.tr/keos/Map5.aspx";
		host = "webgis.umraniye.bel.tr";
		origin = "http://umraniye.kadikoy.bel.tr";
		referrer = "http://umraniye.kadikoy.bel.tr/keos/";	
		ilceName = "Ümraniye";
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CGenelUydu%2CUydufoto_20011_07%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRknPMRk%2BDVIcxJiaPK19UO9XnmyTau9JHFmeDQ4deMjbo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CGenelUydu%3DFFFF%2CUydufoto_20011_07%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3D0%2CGenelUydu%3D0%2CUydufoto_20011_07%3D0%2Ckentrehberi_poi1%3DFA%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_poi1%3DFA%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery =	"OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CGenelUydu%2CUydufoto_20011_07%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRknPMRk%2BDVIcxJiaPK19UO9XnmyTau9JHFmeDQ4deMjbo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CGenelUydu%3DFFFF%2CUydufoto_20011_07%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3D0%2CGenelUydu%3D0%2CUydufoto_20011_07%3D0%2Ckentrehberi_poi1%3DFA%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_poi1%3DFA%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CGenelUydu%2CUydufoto_20011_07%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRknPMRk%2BDVIcxJiaPK19UO9XnmyTau9JHFmeDQ4deMjbo%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CGenelUydu%3DFFFF%2CUydufoto_20011_07%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3AGenelUydu2%3D0%2CGenelUydu%3D0%2CUydufoto_20011_07%3D0%2Ckentrehberi_poi1%3DFA%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3Aa562f5062ce64024974e19d56b53950c%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.umraniye.bel.tr%2Fnetgis5_35%2F%3B%3BF%3Akentrehberi_poi1%3DFA%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
			
		ilceIndex = new Long(9);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ADEM YAVUZ");
		list.add("ALTINÞEHÝR");
		list.add("ARMAÐAN EVLER");
		list.add("AÞAÐI DUDULLU");
		list.add("ATAKENT");
		list.add("ATATÜRK");
		list.add("ÇAKMAK");
		list.add("ÇAMLIK");
		list.add("CEMÝL MERÝÇ");
		list.add("DUMLUPINAR");
		list.add("ELMALIKENT");
		list.add("ESENEVLER");
		list.add("ESENKENT");
		list.add("ESENÞEHÝR");
		list.add("FATÝH SULTAN MEHMET");
		list.add("HEKÝMBAÞI");
		list.add("HUZUR");
		list.add("IHLAMURKUYU");
		list.add("ÝNKILAP");
		list.add("ÝSTÝKLAL");
		list.add("KAZIM KARABEKÝR");
		list.add("MADENLER");
		list.add("MEHMET AKÝF");
		list.add("NAMIK KEMAL");
		list.add("NECÝP FAZIL");
		list.add("PARSELLER");
		list.add("SARAY");
		list.add("ÞERÝFALÝ");
		list.add("SÝTE");
		list.add("TANTAVÝ");
		list.add("TATLISU");
		list.add("TEPEÜSTÜ");
		list.add("TOPAÐACI");
		list.add("YAMAN EVLER");
		list.add("YUKARI DUDULLU");

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

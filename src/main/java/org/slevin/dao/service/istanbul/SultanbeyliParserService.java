package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.SultanbeyliParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class SultanbeyliParserService extends BaseParserService implements SultanbeyliParserDao{


						
	
	public void prepare() {
		endPoint = "http://webgis.sultanbeyli.bel.tr/keos/Map5.aspx??skuvqnynrpcvxlnh";
		host = "webgis.sultanbeyli.bel.tr";
		origin = "http://webgis.sultanbeyli.bel.tr";
		referrer = "http://webgis.sultanbeyli.bel.tr/keos/";	
		ilceName = "Sultanbeyli";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";
		BinaQuery =	"OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A156543.033928125%3BTileSize%3A256%3BRefPointString%3A-20037508.3427893%2C-20037508.3427893%3BRasterBackList%3ABingUyduFoto%C4%9Fraf%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwULLTIxNDM3NTkzNTZkZA%3D%3D&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2FtileImages_rehber6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3ABingUyduFoto%C4%9Fraf%C4%B1%3D0%2Ckod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A0%3B%3B_S%3Ab932db877315481fbb9b0ea3e7e923a5%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.sultanbeyli.bel.tr%2Fnetgis5_REHBER6%2F%3B%3BF%3Akod_kullanim_amaci_kr_table%3D0%2Ckod_kullanim_amaci_kr%3D0%2Ckentrehberi_yol%3D0%2Ckentrehberi_parsel%3D0%2Ckisayol%3D0%2Cnobetci_eczane%3D0%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&NE_ShowMarks=on&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.Ba%C4%9Flant%C4%B11.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";	
		ilceIndex = new Long(8);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("ABDURRAHMANGAZÝ");
		list.add("ADÝL");
		list.add("AHMET YESEVÝ");
		list.add("AKÞEMSETTÝN");
		list.add("BATTALGAZÝ");
		list.add("FATÝH");
		list.add("HAMÝDÝYE");
		list.add("HASANPAÞA");
		list.add("MECÝDÝYE");
		list.add("MEHMET AKÝF");
		list.add("MÝMAR SÝNAN");
		list.add("NECÝP FAZIL");
		list.add("ORHANGAZÝ");
		list.add("ÞALGAMLI DEVLET ORMANI");
		list.add("TEFERRÜÇTEPE DEVLET ORMANI");
		list.add("TURGUT REÝS");
		list.add("YAVUZ SELÝM");
	
		
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

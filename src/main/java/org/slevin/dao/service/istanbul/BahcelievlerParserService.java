package org.slevin.dao.service.istanbul;

import java.util.ArrayList;
import java.util.List;

import org.slevin.dao.cbs.istanbul.BahcelievlerParserDao;
import org.slevin.dao.service.BaseParserService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
@Component
@Transactional
public class BahcelievlerParserService extends BaseParserService implements BahcelievlerParserDao{


						
	
	public void prepare() {
		endPoint = "http://keos.bahcelievler.bel.tr/keos/Map5.aspx";
		host = "keos.bahcelievler.bel.tr";
		origin = "http://keos.bahcelievler.bel.tr";
		referrer = "http://keos.bahcelievler.bel.tr/keos/";	
		ilceName = "Bahçelievler";
		
		sokakQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3ABELNETMAP6_TILEKarolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkDOJqCzl2AQOLOvwAoqMyHLnkVIBhkESm5kZqCJEA0Ro%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF2%3BFind%3A__QUERYPARAMETER__%3B";	
		
		BinaQuery = "OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3ABELNETMAP6_TILEKarolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkDOJqCzl2AQOLOvwAoqMyHLnkVIBhkESm5kZqCJEA0Ro%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A__QUERYPARAMETER__%3B";
		
		CoordinateQuery ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3ABELNETMAP6_TILEKarolar%C4%B1%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRkDOJqCzl2AQOLOvwAoqMyHLnkVIBhkESm5kZqCJEA0Ro%3D&__VIEWSTATEGENERATOR=22CAA2D7&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3ABELNETMAP6_TILEKarolar%C4%B1%3D0%2Ckentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_TU%3A1%3B%3B_SRID%3A0%3B%3B_S%3Accd3eda7df5d4859b8c31aa58e642aea%3B%3B_WS%3AREHBER6_EXP%3B%3B_Url%3Ahttp%3A%2F%2Fkeos.bahcelievler.bel.tr%2Fnetgis5%2F%3B%3BF%3Akentrehberi_parkmob%3D0%2Ckentrehberi_parkis%3DF6%2Ckentrehberi_parkic%3D0%2Ckentrehberi_parklar%3D0%2Ckentrehberi_fenis%3DF2%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=NCWebgisXmlInfo1&__CALLBACKPARAM=Command%3AGetWebgisInfoXml%3BTable%3Akentrehberi_kapi.KEOS.kentrehberi_kapi%3BProvider%3ATestWebgisProvider%3BLayout%3AKAPI%3BSQLColumn%3Aobjectid%3BSQLValue%3A__QUERYPARAMETER__%3BSQLOperator%3AEqual%3BGoTo%3A1%3BGoToAndRender%3A1%3BHighLight%3A1%3B";
		ilceIndex = new Long(17);
	}
	
	public List<String> getMahalleList() throws Exception {
		List<String> list = new ArrayList<String>();
		list.add("BAHÇELÝEVLER");
		list.add("ÇOBANÇEÞME");
		list.add("CUMHURÝYET");
		list.add("FEVZÝ ÇAKMAK");
		list.add("HÜRRÝYET");
		list.add("KOCASÝNAN MERKEZ");
		list.add("ÞÝRÝNEVLER");
		list.add("SÝYAVUÞPAÞA");
		list.add("SOÐANLI");
		list.add("YENÝBOSNA MERKEZ");
		list.add("ZAFER");
		
		
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

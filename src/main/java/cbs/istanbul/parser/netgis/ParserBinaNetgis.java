package cbs.istanbul.parser.netgis;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.interfaces.ParserBina;

public class ParserBinaNetgis  extends ParserBaseNetgis implements ParserBina{
	public ParserBinaNetgis(String endPoint, String host, String origin,
			String referrer) {
		super(endPoint, host, origin, referrer);
		// TODO Auto-generated constructor stub
	}
	static String test  = "sItems:21:156739;;31:158373;;33:158379;;38:154795;;39:190456;;41:190457;;42:158160;;43:190492;;44:158161;;46:158162;;47:190472;;49:190474;;50:158189;;51:190477;;52:158528;;53:190481;;57:190570;;58:158548;;59:190572;;61:190622;;62:158828;;63:190626;;64:158829;;65:190633;;68:158831;;69:191404;;71:191387;;73:191389;;74:158895;;75:187054;;76:158898;;77:191391;;79:191377;;80:159005;;81:194816;;83:194124;;85:194126;;87:194128;;89:194818;;90:189904;;91:194145;;92:189907;;93:194821;;94:189908;;97:194828;;98:189770;;99:194831;;100:189772;;100A:189771;;101:194868;;101A:194867;;101B:194866;;102:195591;;102A:195598;;103:153670;;103A:153669;;104:195604;;104A:195588;;104B:195589;;104C:195590;;105:194832;;105A:194936;;105B:194869;;106:195603;;106A:195601;;106B:195587;;106C:195602;;107A:194870;;108:195600;;108A:195586;;108B:195599;;109:194834;;109A:194833;;110A:195585;;111:194835;;111A:194937;;112:195754;;112A:195737;;112B:195753;;113:194123;;113A:194122;;113B:194147;;114:194921;;114A:195535;;114B:194920;;115:194837;;115A:194836;;116:195534;;116A:195533;;117:194823;;117/1:153343;;117A:194822;;117B:194142;;117C:194141;;117D:194140;;118A:195532;;119/1:194143;;119A:194827;;119B:194930;;120A:195530;;120B:195531;;121:195029;;121/1:195189;;121/1A:195188;;121/1B:195187;;121A:195191;;121B:195186;;122:195761;;122A:195760;;122B:195759;;123:195185;;123A:195194;;123B:195190;;124A:195758;;125:195028;;125A:195193;;125B:195192;;126:195757;;126A:193970;;127:195330;;127A:195329;;127B:195338;;128:195756;;128A:193966;;128B:193967;;129:195298;;129/1:195301;;129A:195297;;129B:195296;;129C:195295;;130A:193965;;130B:195755;;131:195328;;131/1:152969;;131A:195326;;131B:195327;;131C:195294;;131D:195339;;132:195510;;132A:193969;;133:195293;;133/1:195302;;133/2:195314;;133A:195340;;133B:195325;;133C:195324;;133D:195331;;134:195773;;134A:193968;;135:195292;;135A:195291;;135B:195323;;135C:195322;;135D:195315;;136:195772;;136A:195771;;137:195321;;137A:195319;;137B:195318;;137C:195320;;137D:195317;;138:195770;;138/1:194901;;138A:195767;;138B:195768;;138C:195769;;139:195290;;139A:195316;;139B:195332;;140:195765;;140/1:194902;;140/2:195766;;140A:195762;;140B:195764;;140C:195763;;142:193964;;142/1:154808;;142/2:197241;;142A:193962;;142B:193974;;142C:193963;;142D:193971;;142E:193972;;142F:193973;;143:195370;;143A:195395;;143B:195409;;144A:197238;;145:195369;;145A:195392;;145B:195394;;145C:195391;;146:196336;;146A:197259;;147:195360;;148:195084;;148A:196337;;148B:196338;;148C:195083;;149:195659;;149A:195654;;149B:195701;;149C:195702;;150:195090;;150A:195089;;151:195642;;151A:194875;;151B:195704;;151C:195703;;151D:194874;;152:195088;;152A:195091;;153:195706;;153/1:194878;;153/1A:195705;;153/1B:194873;;154:195092;;154A:195093;;154B:195094;;155:195643;;155/1:194877;;156A:195098;;156B:195099;;157:195645;;157A:195658;;157B:194883;;157C:194884;;157D:194885;;158A:197420;;158B:197421;;159:195653;;159A:195707;;159B:194872;;159C:195708;;160:197425;;160A:197423;;160B:197424;;161:195657;;161A:195652;;162:197429;;162A:197426;;162B:197427;;162C:197428;;163:194882;;164:197433;;164A:197413;;164B:197434;;164C:197414;;164D:197435;;165:195646;;165/1:194899;;166:197438;;166A:197437;;166B:197436;;167:195651;;167A:194876;;167B:194871;;167C:195709;;168:197449;;168A:197446;;168B:197447;;168C:197405;;168D:197450;;169:194897;;170:197453;;170A:197452;;170B:197454;;170C:197451;;171:194898;;171A:194900;;172:197468;;172A:197465;;172B:197464;;172C:197467;;174:197471;;174A:197469;;174B:197470;;176:197475;;176A:197474;;176B:197477;;176C:197476;;178:197483;;178A:197480;;178B:197481;;178C:197482;;180A:197484;;182A:197441;;182B:197445;;184:197490;;184A:197489;;188:157374;;190-192:154468;;194:250193;;194A:250693;;196:197341;;198:197346;;198A:197345;;198B:197347;;200A:197351;;200B:197349;;202A:197562;;204:197358;;204A:197359;;204B:197360;;21/1:156738;;21/1A:156737;;21A:156740;;21B:156741;;21C:156742;;23A:157062;;23B:157061;;23C:157060;;23D:153207;;25A:156922;;25B:156921;;27A:156920;;27B:156919;;29A:158372;;29B:158371;;29C:158370;;29D:158369;;3/1:190621;;31A:158375;;31B:158374;;33A:158381;;33B:158380;;33C:158382;;33D:158383;;35A:158518;;35B:158517;;37A:190493;;37B:190494;;39A:190495;;39B:190496;;40A:152948;;40B:158030;;41A:190501;;42A:158158;;42B:158159;;43A:190458;;45A:190497;;45B:190499;;47A:190471;;47B:190473;;48A:158163;;48B:158164;;49A:190476;;49B:190475;;50A:158190;;50B:158188;;51A:190478;;51B:190479;;51C:190480;;52A:158529;;52B:158530;;53A:190482;;53B:190483;;54A:158533;;54B:158534;;57/1:190571;;58A:158549;;58B:158550;;60A:158552;;61A:190623;;61B:190624;;61C:190625;;62A:158849;;63A:190627;;64A:158850;;64B:153330;;65A:190632;;66A:158830;;66B:158851;;67A:191384;;67B:191385;;68A:158854;;68B:158855;;68C:158852;;68D:158853;;69A:191386;;70A:158832;;70B:158856;;71A:191401;;71B:191400;;72A:158890;;72B:158889;;73A:191388;;73B:191405;;74A:158891;;74B:158892;;74C:158894;;74D:158893;;75A:187053;;75B:187055;;76A:158897;;76B:158896;;77A:191390;;78A:153398;;78B:159002;;79/1:154952;;80A:159003;;80B:159004;;82A:159006;;82B:158995;;82C:158996;;83A:194817;;83B:194933;;84A:159111;;85A:194125;;85B:194149;;86A:159123;;86B:159122;;87A:194934;;87B:194127;;88A:189902;;88B:189901;;89/1:194129;;89A:194130;;90A:189903;;91A:194819;;91B:194820;;91C:194144;;92A:189906;;92B:189905;;93A:194863;;95A:194864;;95B:194865;;96A:187050;;97A:194793;;97B:194156;;97C:194829;;98A:517819;;98B:189774;;99A:194935;;99B:194830;;;Control:OldSearch1_cmb3;Provider:TestWebgisProvider;";
	

	public List<BaseModel> parseBinaList(String sokakName) throws Exception{
		List<BaseModel> resultList = new ArrayList<BaseModel>();
		String result= parseHTTPResult(sokakName);
		
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

	@Override
	public String parseHTTPResult(String sokakName) throws Exception{
		String query ="OptimizeData=PixelSpanMax%3A15624.984375%3BTileSize%3A256%3BRefPointString%3A-180%2C-90%3BRasterBackList%3AGenelUydu2%2CUydu%3B&__EVENTTARGET=&__EVENTARGUMENT=&__VIEWSTATE=%2FwEPDwUKLTEwNTQ0NzkxMGRk&NCWebMap1%24MapCState=___PRV_____DynBack%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3DFFFF%2CUydu%3DFFFF%3B%3B%3B___PRV____TestWebgisProvider%3A_I%3Aimage%2Fpng%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3AGenelUydu2%3D0%2CUydu%3D0%2Ckentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&NCWebMap3%24MapCState=___PRV_____mini%3A_I%3Aimage%2Fjpeg%3B%3B_SRID%3A2320%3B%3B_S%3A010f312cf2ee470b922f5d355d46f275%3B%3B_WS%3AREHBER6_EXPORT%3B%3B_Url%3Ahttp%3A%2F%2Fwebgis.atasehir.bel.tr%2Fnetgis5_rehber6%2F%3B%3BF%3Akentrehberi_parkis%3DF1%2Ckentrehberi_fenis%3DF1%3B%3B%3B&v_txtGenelAra1=&txtGenelAra1=&OldSearch1%24cmb1=&OldSearch1%24cmb2=Se%C3%A7iniz&OldSearch1%24cmb3=Se%C3%A7iniz&__CALLBACKID=OldSearch1&__CALLBACKPARAM=Command%3AF3%3BFind%3A" +URLEncoder.encode(sokakName, "UTF-8")+ "%3B";
		return NetGisUtil.callHttp(endPoint, referrer, origin, host, query);
	}
	public static void main(String[] args) throws Exception{
		ParserBinaNetgis binaNetgis  =new ParserBinaNetgis("","","","");
		List<BaseModel> list=binaNetgis.parseBinaList("");
		System.out.println("bitti");
	}

	
	

}

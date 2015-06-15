package org.slevin.tests;

import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slevin.dao.AtasehirParserDao;
import org.slevin.dao.BaseParserDao;
import org.slevin.dao.BeykozParserDao;
import org.slevin.dao.SokakDao;
import org.slevin.dao.cbs.istanbul.ArnavutkoyParserDao;
import org.slevin.dao.cbs.istanbul.BagcilarParserDao;
import org.slevin.dao.cbs.istanbul.BahcelievlerParserDao;
import org.slevin.dao.cbs.istanbul.BakirkoyParserDao;
import org.slevin.dao.cbs.istanbul.BasaksehirParserDao;
import org.slevin.dao.cbs.istanbul.BesiktasParserDao;
import org.slevin.dao.cbs.istanbul.BeylikduzuParserDao;
import org.slevin.dao.cbs.istanbul.CekmekoyParserDao;
import org.slevin.dao.cbs.istanbul.EsenlerParserDao;
import org.slevin.dao.cbs.istanbul.EsenyurtParserDao;
import org.slevin.dao.cbs.istanbul.EyupParserDao;
import org.slevin.dao.cbs.istanbul.GaziosmanpasaParserDao;
import org.slevin.dao.cbs.istanbul.KadikoyParserDao;
import org.slevin.dao.cbs.istanbul.KartalParserDao;
import org.slevin.dao.cbs.istanbul.KucukcekmeceParserDao;
import org.slevin.dao.cbs.istanbul.MaltepeParserDao;
import org.slevin.dao.cbs.istanbul.SancaktepeParserDao;
import org.slevin.dao.cbs.istanbul.SileParserDao;
import org.slevin.dao.cbs.istanbul.SilivriParserDao;
import org.slevin.dao.cbs.istanbul.SultanbeyliParserDao;
import org.slevin.dao.cbs.istanbul.SultangaziParserDao;
import org.slevin.dao.cbs.istanbul.TuzlaParserDao;
import org.slevin.dao.cbs.istanbul.UmraniyeParserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;




@ContextConfiguration("/org/slevin/tests/persistenceTests-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class InsertTests {

	@PersistenceContext
	private EntityManager entityManager;



	

	
	@Autowired(required=true)
	AtasehirParserDao atasehirParserService;
	
	@Autowired(required=true)
	SokakDao sokakService;
	
	@Autowired(required=true)
	BeykozParserDao beykozParserService;
	
	@Autowired(required=true)
	CekmekoyParserDao cekmekoyParserService;
	
	@Autowired(required=true)
	KartalParserDao kartalParserService;
	
	@Autowired(required=true)
	MaltepeParserDao maltepeParserService;

	@Autowired(required=true)
	KadikoyParserDao kadikoyParserService;

	@Autowired(required=true)
	SancaktepeParserDao sancaktepeParserService;
	
	@Autowired(required=true)
	SultanbeyliParserDao sultanbeyliParserService;
	
	@Autowired(required=true)
	UmraniyeParserDao umraniyeParserService;
	
	@Autowired(required=true)
	TuzlaParserDao tuzlaParserService;
	
	@Autowired(required=true)
	BagcilarParserDao bagcilarParserService;

	@Autowired(required=true)
	ArnavutkoyParserDao arnavutkoyParserService;
	
	@Autowired(required=true)
	BasaksehirParserDao basaksehirParserService;
	
	@Autowired(required=true)
	BakirkoyParserDao bakirkoyParserService;
	
	@Autowired(required=true)
	BeylikduzuParserDao beylikduzuParserService;
	
	@Autowired(required=true)
	EsenlerParserDao esenlerParserService;
	
	@Autowired(required=true)
	BahcelievlerParserDao bahcelievlerParserService;
	
	
	@Autowired(required=true)
	EsenyurtParserDao esenyurtParserService;
	
	@Autowired(required=true)
	EyupParserDao eyupParserService;
	
	@Autowired(required=true)
	GaziosmanpasaParserDao gaziosmanpasaService;
	
	@Autowired(required=true)
	BesiktasParserDao besiktasService;
	
	@Autowired(required=true)
	KucukcekmeceParserDao kucukcekmeceParserService;	
	
	@Autowired(required=true)
	SilivriParserDao silivriParserService;
	
	@Autowired(required=true)
	SultangaziParserDao sultangaziParserService;
	
	@Autowired(required=true)
	SileParserDao sileParserService;
	
	BaseParserDao parserService;
	
	@PostConstruct
	void init(){
		parserService = sultanbeyliParserService;
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void insertParserData() throws Exception {
		writeTestData(parserService.test());
//		cekmekoyParserService.getComplatedBinaCount();
//		parserService.getComplatedCoordinateCount();
//		cekmekoyParserService.getComplatedMahalleCount();
//		cekmekoyParserService.getComplatedSokakCount();
//		
//		cekmekoyParserService.getUncomplatedBinaCount();
//		cekmekoyParserService.getUncomplatedCoordinateCount();
//		cekmekoyParserService.getUncomplatedMahalleCount();
//		cekmekoyParserService.getUncomplatedSokakCount();
		//cekmekoyParserService.getIlceName();
		
		//cekmekoyParserService.insertIlce();
		//cekmekoyParserService.insertMahalle();
		//cekmekoyParserService.insertSokak();
	//	parserService.insertBina();
//		for (int i = 0; i <500; i++) {
//			parserService.insertCoordinate();
//			Thread.sleep(20000);
//			System.out.println(i +" yapiliyor");
//		}
		
		parserService.insertCoordinate();
	}
	
	public void writeTestData(List<String> list){
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
	


	
}

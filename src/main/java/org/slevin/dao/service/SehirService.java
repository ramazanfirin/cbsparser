package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Sehir;
import org.slevin.dao.SehirDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class SehirService extends EntityService<Sehir> implements SehirDao {

	public List<Sehir> findUncomplatedList(Long ilceIndex) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public long complatedCount(Long ilceIndex) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	public long unComplatedcount(Long ilceIndex) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
}


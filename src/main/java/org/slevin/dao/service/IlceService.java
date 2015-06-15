package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Ilce;
import org.slevin.dao.IlceDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class IlceService extends EntityService<Ilce> implements IlceDao {

	public List<Ilce> findUncomplatedList(Long ilceIndex) throws Exception {
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


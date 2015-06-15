package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Item;
import org.slevin.dao.ItemsDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class ItemService extends EntityService<Item> implements ItemsDao {

	public List<Item> findUncomplatedList(Long ilceIndex) throws Exception {
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


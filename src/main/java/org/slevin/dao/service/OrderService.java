package org.slevin.dao.service;

import java.util.List;

import org.slevin.common.Order;
import org.slevin.dao.OrdersDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class OrderService extends EntityService<Order> implements OrdersDao {

	public List<Order> findUncomplatedList(Long ilceIndex) throws Exception {
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

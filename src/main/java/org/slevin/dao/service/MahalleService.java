package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Mahalle;
import org.slevin.dao.MahalleDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class MahalleService extends EntityService<Mahalle> implements MahalleDao {

	public long complatedCount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=1 and t.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	public long unComplatedcount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	
	public List<Mahalle> findUncomplatedList(Long ilceIndex) throws Exception {
		return  (List<Mahalle>)getEntityManager().createQuery("Select t from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.ilce.ilceIndex="+ilceIndex).getResultList();
	}
}


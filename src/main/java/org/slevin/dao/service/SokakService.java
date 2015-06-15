package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Mahalle;
import org.slevin.common.Sokak;
import org.slevin.dao.SokakDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class SokakService extends EntityService<Sokak> implements SokakDao {

	public long complatedCount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=1 and t.mahalle.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	public long unComplatedcount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.mahalle.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	
	public List<Sokak> findUncomplatedList(Long ilceIndex) throws Exception {
		return  (List<Sokak>)getEntityManager().createQuery("Select t from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.mahalle.ilce.ilceIndex="+ilceIndex).setMaxResults(100).getResultList();
	}
}


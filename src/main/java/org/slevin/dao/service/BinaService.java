package org.slevin.dao.service;


import java.util.List;

import org.slevin.common.Bina;
import org.slevin.common.Sokak;
import org.slevin.dao.BinaDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class BinaService extends EntityService<Bina> implements BinaDao {
	
	public long complatedCount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=1 and t.sokak.mahalle.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	public long unComplatedcount(Long ilceIndex) throws Exception {
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.sokak.mahalle.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	
	public List<Bina> findUncomplatedList(Long ilceIndex) throws Exception {
		return  (List<Bina>)getEntityManager().createQuery("Select t from " + getEntityClass().getSimpleName() + " t where t.complated=0 and t.sokak.mahalle.ilce.ilceIndex="+ilceIndex).setMaxResults(1000).getResultList();
	}
	public long getErrorCount(Long ilceIndex) throws Exception{
		return (Long) getEntityManager().createQuery("Select count(t) from " + getEntityClass().getSimpleName() + " t where t.complated=1 and t.orijinalLat='e' and t.sokak.mahalle.ilce.ilceIndex="+ilceIndex).getSingleResult();
	}
	
	
}


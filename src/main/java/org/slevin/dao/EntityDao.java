package org.slevin.dao;

import java.util.List;


public interface EntityDao<E> {
	
	void persist(E e) throws Exception;
	
	void merge(E e) throws Exception;
	
	void remove(Object id) throws Exception;
	
	E findById(Object id) throws Exception;
	
	List<E> findAll() throws Exception;
	
	List<E> findByProperty(String prop, Object val) throws Exception;
	
	List<E> findInRange(int firstResult, int maxResults) throws Exception;
	
	long count() throws Exception;
	
	E findByPropertySingleResult(String prop, Object val) throws Exception;
	
	List<E> findUncomplatedList() throws Exception;
	
	List<E> findUncomplatedList(Long ilceIndex) throws Exception;
	
	void merge(List<E> list) throws Exception;
	
	long complatedCount(Long ilceIndex) throws Exception;
	
	long unComplatedcount(Long ilceIndex) throws Exception;
}

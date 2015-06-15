package org.slevin.dao;

import org.slevin.common.Bina;


public interface BinaDao extends EntityDao<Bina> {
	public long getErrorCount(Long ilceIndex) throws Exception;
}

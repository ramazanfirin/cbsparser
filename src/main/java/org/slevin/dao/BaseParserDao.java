package org.slevin.dao;

import java.util.List;

public interface BaseParserDao {
	List<String> getMahalleList() throws Exception;
	void insertMahalle() throws Exception;
	void insertSokak() throws Exception;
	void insertBina() throws Exception;
	void insertCoordinate() throws Exception;
	void insertIlce() throws Exception;
	String getIlceName() throws Exception;
	Long getIlceIndex() throws Exception;
	String getEndpoint() throws Exception;
	String getHost() throws Exception;
	String getOrigin() throws Exception;
	String getReferrer() throws Exception;
//	String getSokakQuery() throws Exception; 
//	String getBinaQuery() throws Exception;
//	String getCoordinateQuery() throws Exception;
	void prepare();
	
	long getComplatedMahalleCount() throws Exception;
	long getUncomplatedMahalleCount() throws Exception;
	long getComplatedSokakCount() throws Exception;
	long getUncomplatedSokakCount() throws Exception;
	long getComplatedBinaCount() throws Exception;
	long getUncomplatedBinaCount() throws Exception;
	long getComplatedCoordinateCount() throws Exception;
	long getUncomplatedCoordinateCount() throws Exception;
	long getTotalMahalleCount() throws Exception;
	long getErrorCount() throws Exception;
	
	boolean isIlceInserted() throws Exception;
	List<String> test() throws Exception;
}
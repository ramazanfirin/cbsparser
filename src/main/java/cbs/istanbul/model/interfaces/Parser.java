package cbs.istanbul.model.interfaces;

import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.Coordinate;


public interface Parser {

	public List<BaseModel> getMahalleList();
	public List<BaseModel> getSokakList(String mahalle) throws Exception;
	public List<BaseModel> getBinaList(String sokak) throws Exception;
	public Coordinate getCoordinate(String bina) throws Exception;
	public void prepareParsers();
	public void insertMahalle() throws Exception;
}

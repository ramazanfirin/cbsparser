package cbs.istanbul.model.interfaces;

import java.util.List;

import cbs.istanbul.model.BaseModel;

public interface ParserSokak {
	public List<BaseModel> parseResult(String mahalle) throws Exception;
	//public String getSokakList(String mahalleName);

}
package cbs.istanbul.model.impl;

import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.Coordinate;
import cbs.istanbul.model.interfaces.Parser;
import cbs.istanbul.model.interfaces.ParserBina;
import cbs.istanbul.model.interfaces.ParserCoordinate;
import cbs.istanbul.model.interfaces.ParserSokak;

public abstract class ParserBaseImpl implements Parser{

	protected ParserSokak parserSokak;
	protected ParserBina parserBina;
	protected ParserCoordinate parserCoordinate;
	
	
	
	public ParserBaseImpl() {
		super();
		prepareParsers();
	}


	public List<BaseModel> getSokakList(String mahalle) throws Exception {
		// TODO Auto-generated method stub
		return parserSokak.parseResult(mahalle);
	}

	
	public List<BaseModel> getBinaList(String sokak) throws Exception{
		// TODO Auto-generated method stub
		return parserBina.parseBinaList(sokak);
	} 


	public Coordinate getCoordinate(String bina) throws Exception {
		return parserCoordinate.parseCoordinate(bina);
	}





	public ParserSokak getParserSokak() {
		return parserSokak;
	}



	public void setParserSokak(ParserSokak parserSokak) {
		this.parserSokak = parserSokak;
	}



	public ParserBina getParserBina() {
		return parserBina;
	}



	public void setParserBina(ParserBina parserBina) {
		this.parserBina = parserBina;
	}



	public ParserCoordinate getParserCoordinate() {
		return parserCoordinate;
	}



	public void setParserCoordinate(ParserCoordinate parserCoordinate) {
		this.parserCoordinate = parserCoordinate;
	}

}

package cbs.istanbul.model.interfaces;

import java.util.List;

import cbs.istanbul.model.BaseModel;

public interface ParserBina {
	public List<BaseModel> parseBinaList(String result) throws Exception;
}

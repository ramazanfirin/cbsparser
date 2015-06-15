package cbs.istanbul.model.impl;

import java.util.Iterator;
import java.util.List;

import cbs.istanbul.model.BaseModel;
import cbs.istanbul.model.Coordinate;

public abstract class ParserImlp extends ParserBaseImpl{
	
	@SuppressWarnings(value = { "rawtypes" })
	public void parse() throws Exception{
		List<BaseModel> mahalleList =getMahalleList();
		for (Iterator iterator = mahalleList.iterator(); iterator.hasNext();) {
			BaseModel mahalle = (BaseModel) iterator.next();
			List<BaseModel> sokakList = getSokakList(mahalle.getName());
			for (Iterator iterator2 = sokakList.iterator(); iterator2.hasNext();) {
				BaseModel sokak = (BaseModel) iterator2.next();
				List<BaseModel> binaList = getBinaList(sokak.getValue());
				for (Iterator iterator3 = binaList.iterator(); iterator3.hasNext();) {
					BaseModel bina = (BaseModel) iterator3.next();
					Coordinate coordinate = getCoordinate(bina.getValue());
					//System.out.println(mahalle.getName()+" "+sokak.getName()+" "+bina.getName()+" "+coordinate.getLat()+" "+coordinate.getLng());
				}
			}
			
		}
	}
	
	
	
	
	

}

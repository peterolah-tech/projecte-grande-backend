package com.codecool.projectegrandebackend.model.generated;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Recipes{

	@JsonProperty("number")
	private int number;

	@JsonProperty("totalResults")
	private int totalResults;

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("results")
	private List<ResultsItem> results;

	public void setNumber(int number){
		this.number = number;
	}

	public int getNumber(){
		return number;
	}

	public void setTotalResults(int totalResults){
		this.totalResults = totalResults;
	}

	public int getTotalResults(){
		return totalResults;
	}

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setResults(List<ResultsItem> results){
		this.results = results;
	}

	public List<ResultsItem> getResults(){
		return results;
	}

	@Override
 	public String toString(){
		return 
			"Recipes{" + 
			"number = '" + number + '\'' + 
			",totalResults = '" + totalResults + '\'' + 
			",offset = '" + offset + '\'' + 
			",results = '" + results + '\'' + 
			"}";
		}
}
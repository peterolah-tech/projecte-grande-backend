package com.codecool.projectegrandebackend.model.generated.recipes;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("sustainable")
	private boolean sustainable;

	@JsonProperty("analyzedInstructions")
	private List<AnalyzedInstructionsItem> analyzedInstructions;

	@JsonProperty("glutenFree")
	private boolean glutenFree;

	@JsonProperty("veryPopular")
	private boolean veryPopular;

	@JsonProperty("healthScore")
	private double healthScore;

	@JsonProperty("title")
	private String title;

	@JsonProperty("diets")
	private List<String> diets;

	@JsonProperty("aggregateLikes")
	private int aggregateLikes;

	@JsonProperty("creditsText")
	private String creditsText;

	@JsonProperty("readyInMinutes")
	private int readyInMinutes;

	@JsonProperty("sourceUrl")
	private String sourceUrl;

	@JsonProperty("dairyFree")
	private boolean dairyFree;

	@JsonProperty("servings")
	private int servings;

	@JsonProperty("vegetarian")
	private boolean vegetarian;

	@JsonProperty("id")
	private int id;

	@JsonProperty("imageType")
	private String imageType;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("image")
	private String image;

	@JsonProperty("veryHealthy")
	private boolean veryHealthy;

	@JsonProperty("vegan")
	private boolean vegan;

	@JsonProperty("cheap")
	private boolean cheap;

	@JsonProperty("dishTypes")
	private List<String> dishTypes;

	@JsonProperty("gaps")
	private String gaps;

	@JsonProperty("cuisines")
	private List<String> cuisines;

	@JsonProperty("lowFodmap")
	private boolean lowFodmap;

	@JsonProperty("license")
	private String license;

	@JsonProperty("weightWatcherSmartPoints")
	private int weightWatcherSmartPoints;

	@JsonProperty("occasions")
	private List<Object> occasions;

	@JsonProperty("spoonacularScore")
	private double spoonacularScore;

	@JsonProperty("pricePerServing")
	private double pricePerServing;

	@JsonProperty("sourceName")
	private String sourceName;

	@JsonProperty("spoonacularSourceUrl")
	private String spoonacularSourceUrl;

	public void setSustainable(boolean sustainable){
		this.sustainable = sustainable;
	}

	public boolean isSustainable(){
		return sustainable;
	}

	public void setAnalyzedInstructions(List<AnalyzedInstructionsItem> analyzedInstructions){
		this.analyzedInstructions = analyzedInstructions;
	}

	public List<AnalyzedInstructionsItem> getAnalyzedInstructions(){
		return analyzedInstructions;
	}

	public void setGlutenFree(boolean glutenFree){
		this.glutenFree = glutenFree;
	}

	public boolean isGlutenFree(){
		return glutenFree;
	}

	public void setVeryPopular(boolean veryPopular){
		this.veryPopular = veryPopular;
	}

	public boolean isVeryPopular(){
		return veryPopular;
	}

	public void setHealthScore(double healthScore){
		this.healthScore = healthScore;
	}

	public double getHealthScore(){
		return healthScore;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setDiets(List<String> diets){
		this.diets = diets;
	}

	public List<String> getDiets(){
		return diets;
	}

	public void setAggregateLikes(int aggregateLikes){
		this.aggregateLikes = aggregateLikes;
	}

	public int getAggregateLikes(){
		return aggregateLikes;
	}

	public void setCreditsText(String creditsText){
		this.creditsText = creditsText;
	}

	public String getCreditsText(){
		return creditsText;
	}

	public void setReadyInMinutes(int readyInMinutes){
		this.readyInMinutes = readyInMinutes;
	}

	public int getReadyInMinutes(){
		return readyInMinutes;
	}

	public void setSourceUrl(String sourceUrl){
		this.sourceUrl = sourceUrl;
	}

	public String getSourceUrl(){
		return sourceUrl;
	}

	public void setDairyFree(boolean dairyFree){
		this.dairyFree = dairyFree;
	}

	public boolean isDairyFree(){
		return dairyFree;
	}

	public void setServings(int servings){
		this.servings = servings;
	}

	public int getServings(){
		return servings;
	}

	public void setVegetarian(boolean vegetarian){
		this.vegetarian = vegetarian;
	}

	public boolean isVegetarian(){
		return vegetarian;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setImageType(String imageType){
		this.imageType = imageType;
	}

	public String getImageType(){
		return imageType;
	}

	public void setSummary(String summary){
		this.summary = summary;
	}

	public String getSummary(){
		return summary;
	}

	public void setImage(String image){
		this.image = image;
	}

	public String getImage(){
		return image;
	}

	public void setVeryHealthy(boolean veryHealthy){
		this.veryHealthy = veryHealthy;
	}

	public boolean isVeryHealthy(){
		return veryHealthy;
	}

	public void setVegan(boolean vegan){
		this.vegan = vegan;
	}

	public boolean isVegan(){
		return vegan;
	}

	public void setCheap(boolean cheap){
		this.cheap = cheap;
	}

	public boolean isCheap(){
		return cheap;
	}

	public void setDishTypes(List<String> dishTypes){
		this.dishTypes = dishTypes;
	}

	public List<String> getDishTypes(){
		return dishTypes;
	}

	public void setGaps(String gaps){
		this.gaps = gaps;
	}

	public String getGaps(){
		return gaps;
	}

	public void setCuisines(List<String> cuisines){
		this.cuisines = cuisines;
	}

	public List<String> getCuisines(){
		return cuisines;
	}

	public void setLowFodmap(boolean lowFodmap){
		this.lowFodmap = lowFodmap;
	}

	public boolean isLowFodmap(){
		return lowFodmap;
	}

	public void setLicense(String license){
		this.license = license;
	}

	public String getLicense(){
		return license;
	}

	public void setWeightWatcherSmartPoints(int weightWatcherSmartPoints){
		this.weightWatcherSmartPoints = weightWatcherSmartPoints;
	}

	public int getWeightWatcherSmartPoints(){
		return weightWatcherSmartPoints;
	}

	public void setOccasions(List<Object> occasions){
		this.occasions = occasions;
	}

	public List<Object> getOccasions(){
		return occasions;
	}

	public void setSpoonacularScore(double spoonacularScore){
		this.spoonacularScore = spoonacularScore;
	}

	public double getSpoonacularScore(){
		return spoonacularScore;
	}

	public void setPricePerServing(double pricePerServing){
		this.pricePerServing = pricePerServing;
	}

	public double getPricePerServing(){
		return pricePerServing;
	}

	public void setSourceName(String sourceName){
		this.sourceName = sourceName;
	}

	public String getSourceName(){
		return sourceName;
	}

	public void setSpoonacularSourceUrl(String spoonacularSourceUrl){
		this.spoonacularSourceUrl = spoonacularSourceUrl;
	}

	public String getSpoonacularSourceUrl(){
		return spoonacularSourceUrl;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"sustainable = '" + sustainable + '\'' + 
			",analyzedInstructions = '" + analyzedInstructions + '\'' + 
			",glutenFree = '" + glutenFree + '\'' + 
			",veryPopular = '" + veryPopular + '\'' + 
			",healthScore = '" + healthScore + '\'' + 
			",title = '" + title + '\'' + 
			",diets = '" + diets + '\'' + 
			",aggregateLikes = '" + aggregateLikes + '\'' + 
			",creditsText = '" + creditsText + '\'' + 
			",readyInMinutes = '" + readyInMinutes + '\'' + 
			",sourceUrl = '" + sourceUrl + '\'' + 
			",dairyFree = '" + dairyFree + '\'' + 
			",servings = '" + servings + '\'' + 
			",vegetarian = '" + vegetarian + '\'' + 
			",id = '" + id + '\'' + 
			",imageType = '" + imageType + '\'' + 
			",summary = '" + summary + '\'' + 
			",image = '" + image + '\'' + 
			",veryHealthy = '" + veryHealthy + '\'' + 
			",vegan = '" + vegan + '\'' + 
			",cheap = '" + cheap + '\'' + 
			",dishTypes = '" + dishTypes + '\'' + 
			",gaps = '" + gaps + '\'' + 
			",cuisines = '" + cuisines + '\'' + 
			",lowFodmap = '" + lowFodmap + '\'' + 
			",license = '" + license + '\'' + 
			",weightWatcherSmartPoints = '" + weightWatcherSmartPoints + '\'' + 
			",occasions = '" + occasions + '\'' + 
			",spoonacularScore = '" + spoonacularScore + '\'' + 
			",pricePerServing = '" + pricePerServing + '\'' + 
			",sourceName = '" + sourceName + '\'' + 
			",spoonacularSourceUrl = '" + spoonacularSourceUrl + '\'' + 
			"}";
		}
}
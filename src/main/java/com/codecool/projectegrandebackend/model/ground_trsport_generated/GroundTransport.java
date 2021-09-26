package com.codecool.projectegrandebackend.model.ground_trsport_generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroundTransport{

	@JsonProperty("rec_cost_in_usd_cents")
	private String recCostInUsdCents;

	@JsonProperty("cost")
	private Cost cost;

	@JsonProperty("micro_units")
	private String microUnits;

	@JsonProperty("offset")
	private Offset offset;

	@JsonProperty("pretty_url")
	private String prettyUrl;

	@JsonProperty("renewable_energy_certificate")
	private RenewableEnergyCertificate renewableEnergyCertificate;

	@JsonProperty("estimated_at")
	private String estimatedAt;

	@JsonProperty("equivalent_carbon_in_kg")
	private String equivalentCarbonInKg;

	@JsonProperty("environment")
	private String environment;

	@JsonProperty("total_cost_in_usd_cents")
	private String totalCostInUsdCents;

	@JsonProperty("micro_rec_count")
	private String microRecCount;

	@JsonProperty("state")
	private String state;

	@JsonProperty("transaction_cost_in_usd_cents")
	private String transactionCostInUsdCents;

	@JsonProperty("electricity_in_kwh")
	private String electricityInKwh;

	@JsonProperty("slug")
	private String slug;

	public String getRecCostInUsdCents(){
		return recCostInUsdCents;
	}

	public Cost getCost(){
		return cost;
	}

	public String getMicroUnits(){
		return microUnits;
	}

	public Offset getOffset(){
		return offset;
	}

	public String getPrettyUrl(){
		return prettyUrl;
	}

	public RenewableEnergyCertificate getRenewableEnergyCertificate(){
		return renewableEnergyCertificate;
	}

	public String getEstimatedAt(){
		return estimatedAt;
	}

	public String getEquivalentCarbonInKg(){
		return equivalentCarbonInKg;
	}

	public String getEnvironment(){
		return environment;
	}

	public String getTotalCostInUsdCents(){
		return totalCostInUsdCents;
	}

	public String getMicroRecCount(){
		return microRecCount;
	}

	public String getState(){
		return state;
	}

	public String getTransactionCostInUsdCents(){
		return transactionCostInUsdCents;
	}

	public String getElectricityInKwh(){
		return electricityInKwh;
	}

	public String getSlug(){
		return slug;
	}
}
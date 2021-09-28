package com.codecool.projectegrandebackend.model.FLGHT_generated;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightTransport{

	@JsonProperty("rec_cost_in_usd_cents")
	private String rec_cost_in_usd_cents;

	@JsonProperty("cost")
	private Cost cost;

	@JsonProperty("micro_units")
	private String micro_units;

	@JsonProperty("offset")
	private Offset offset;

	@JsonProperty("pretty_url")
	private String pretty_url;

	@JsonProperty("renewable_energy_certificate")
	private RenewableEnergyCertificate renewable_energy_certificate;

	@JsonProperty("estimated_at")
	private String estimated_at;

	@JsonProperty("equivalent_carbon_in_kg")
	private String equivalent_carbon_in_kg;

	@JsonProperty("environment")
	private String environment;

	@JsonProperty("total_cost_in_usd_cents")
	private String total_cost_in_usd_cents;

	@JsonProperty("micro_rec_count")
	private String micro_rec_count;

	@JsonProperty("state")
	private String state;

	@JsonProperty("transaction_cost_in_usd_cents")
	private String transaction_cost_in_usd_cents;

	@JsonProperty("electricity_in_kwh")
	private String electricity_in_kwh;

	@JsonProperty("slug")
	private String slug;

	public String getRecCostInUsdCents(){
		return rec_cost_in_usd_cents;
	}

	public Cost getCost(){
		return cost;
	}

	public String getMicroUnits(){
		return micro_units;
	}

	public Offset getOffset(){
		return offset;
	}

	public String getPrettyUrl(){
		return pretty_url;
	}

	public RenewableEnergyCertificate getRenewableEnergyCertificate(){
		return renewable_energy_certificate;
	}

	public String getEstimatedAt(){
		return estimated_at;
	}

	public String getEquivalentCarbonInKg(){
		return equivalent_carbon_in_kg;
	}

	public String getEnvironment(){
		return environment;
	}

	public String getTotalCostInUsdCents(){
		return total_cost_in_usd_cents;
	}

	public String getMicroRecCount(){
		return micro_rec_count;
	}

	public String getState(){
		return state;
	}

	public String getTransactionCostInUsdCents(){
		return transaction_cost_in_usd_cents;
	}

	public String getElectricityInKwh(){
		return electricity_in_kwh;
	}

	public String getSlug(){
		return slug;
	}
}
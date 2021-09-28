package com.codecool.projectegrandebackend.model.FLGHT_generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FlightTransport{

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
}
package com.tsystems.dia1.work.domain;

public class CityEntity {

    private final Long id;
    private final String name;
    private final String countrycode;
    private final String district;
    private final Long population;

    public CityEntity(Long id, String name, String countrycode, String district, Long population) {
	super();
	this.id = id;
	this.name = name;
	this.countrycode = countrycode;
	this.district = district;
	this.population = population;
    }

    public Long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public String getCountrycode() {
	return countrycode;
    }

    public String getDistrict() {
	return district;
    }

    public Long getPopulation() {
	return population;
    }

    public static CityEntityBuilder builder() {
	return new CityEntityBuilder();
    }

    public static class CityEntityBuilder {

	private Long id;
	private String name;
	private String countryCode;
	private String district;
	private Long population;

	public CityEntityBuilder id(Long id) {
	    this.id = id;
	    return this;
	}

	public CityEntityBuilder name(String name) {
	    this.name = name;
	    return this;
	}

	public CityEntityBuilder countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	public CityEntityBuilder district(String district) {
	    this.district = district;
	    return this;
	}

	public CityEntityBuilder population(Long population) {
	    this.population = population;
	    return this;
	}

	public CityEntity build() {
	    return new CityEntity(id, name, countryCode, district, population);
	}
    }
}

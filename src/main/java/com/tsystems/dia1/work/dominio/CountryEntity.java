package com.tsystems.dia1.work.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @Column(name = "Code")
    private String countryCode;
    @Column(name = "Name")
    private String countryName;
    @Column(name = "Continent")
    private String countryContinent;
    @Column(name = "Region")
    private String countryRegion;
    @Column(name = "SurfaceArea")
    private Long countrySurfaceArea;
    @Column(name = "IndepYear")
    private String countryIndepYear;
    @Column(name = "Population")
    private Long countryPopulation;
    @Column(name = "LifeExpectancy")
    private Long countryLifeExpectancy;
    @Column(name = "GNP")
    private Long countryGnp;
    @Column(name = "GNPOld")
    private Long countryGnpOld;
    @Column(name = "LocalName")
    private String countryLocalName;
    @Column(name = "GovernmentForm")
    private String countryGovernmentForm;
    @Column(name = "HeadOfState")
    private String countryHeadOfState;
    @Column(name = "Capital")
    private Long countryCapital;
    @Column(name = "Code2")
    private String countryCode2;

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
    }

    public String getCountryName() {
	return countryName;
    }

    public void setCountryName(String countryName) {
	this.countryName = countryName;
    }

    public String getCountryContinent() {
	return countryContinent;
    }

    public void setCountryContinent(String countryContinent) {
	this.countryContinent = countryContinent;
    }

    public String getCountryRegion() {
	return countryRegion;
    }

    public void setCountryRegion(String countryRegion) {
	this.countryRegion = countryRegion;
    }

    public Long getCountrySurfaceArea() {
	return countrySurfaceArea;
    }

    public void setCountrySurfaceArea(Long countrySurfaceArea) {
	this.countrySurfaceArea = countrySurfaceArea;
    }

    public String getCountryIndepYear() {
	return countryIndepYear;
    }

    public void setCountryIndepYear(String countryIndepYear) {
	this.countryIndepYear = countryIndepYear;
    }

    public Long getCountryPopulation() {
	return countryPopulation;
    }

    public void setCountryPopulation(Long countryPopulation) {
	this.countryPopulation = countryPopulation;
    }

    public Long getCountryLifeExpectancy() {
	return countryLifeExpectancy;
    }

    public void setCountryLifeExpectancy(Long countryLifeExpectancy) {
	this.countryLifeExpectancy = countryLifeExpectancy;
    }

    public Long getCountryGnp() {
	return countryGnp;
    }

    public void setCountryGnp(Long countryGnp) {
	this.countryGnp = countryGnp;
    }

    public Long getCountryGnpOld() {
	return countryGnpOld;
    }

    public void setCountryGnpOld(Long countryGnpOld) {
	this.countryGnpOld = countryGnpOld;
    }

    public String getCountryLocalName() {
	return countryLocalName;
    }

    public void setCountryLocalName(String countryLocalName) {
	this.countryLocalName = countryLocalName;
    }

    public String getCountryGovernmentForm() {
	return countryGovernmentForm;
    }

    public void setCountryGovernmentForm(String countryGovernmentForm) {
	this.countryGovernmentForm = countryGovernmentForm;
    }

    public String getCountryHeadOfState() {
	return countryHeadOfState;
    }

    public void setCountryHeadOfState(String countryHeadOfState) {
	this.countryHeadOfState = countryHeadOfState;
    }

    public Long getCountryCapital() {
	return countryCapital;
    }

    public void setCountryCapital(Long countryCapital) {
	this.countryCapital = countryCapital;
    }

    public String getCountryCode2() {
	return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
	this.countryCode2 = countryCode2;
    }

}

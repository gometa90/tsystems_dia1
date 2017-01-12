package com.tsystems.dia1.work.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class CountryEntity {

    @Id
    @Column(name = "Code", columnDefinition = "CHAR", length = 3)
    private String countryCode;
    @Column(name = "Name", columnDefinition = "CHAR", length = 52)
    private String countryName;
    @Column(name = "Continent", columnDefinition = "ENUM")
    private String countryContinent;
    @Column(name = "Region", columnDefinition = "CHAR", length = 26)
    private String countryRegion;
    @Column(name = "SurfaceArea")
    private Float countrySurfaceArea;
    @Column(name = "IndepYear", columnDefinition = "SMALLINT")
    private String countryIndepYear;
    @Column(name = "Population", columnDefinition = "INT")
    private Float countryPopulation;
    @Column(name = "LifeExpectancy")
    private Float countryLifeExpectancy;
    @Column(name = "GNP")
    private Float countryGnp;
    @Column(name = "GNPOld")
    private Float countryGnpOld;
    @Column(name = "LocalName", columnDefinition = "CHAR", length = 45)
    private String countryLocalName;
    @Column(name = "GovernmentForm", columnDefinition = "CHAR", length = 45)
    private String countryGovernmentForm;
    @Column(name = "HeadOfState", columnDefinition = "CHAR", length = 60)
    private String countryHeadOfState;
    @Column(name = "Capital", columnDefinition = "INT")
    private Float countryCapital;
    @Column(name = "Code2", columnDefinition = "CHAR", length = 2)
    private String countryCode2;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "cityCountryCode")
    private List<HibernateCityEntity> cities = new ArrayList<>();

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

    public Float getCountrySurfaceArea() {
	return countrySurfaceArea;
    }

    public void setCountrySurfaceArea(Float countrySurfaceArea) {
	this.countrySurfaceArea = countrySurfaceArea;
    }

    public String getCountryIndepYear() {
	return countryIndepYear;
    }

    public void setCountryIndepYear(String countryIndepYear) {
	this.countryIndepYear = countryIndepYear;
    }

    public Float getCountryPopulation() {
	return countryPopulation;
    }

    public void setCountryPopulation(Float countryPopulation) {
	this.countryPopulation = countryPopulation;
    }

    public Float getCountryLifeExpectancy() {
	return countryLifeExpectancy;
    }

    public void setCountryLifeExpectancy(Float countryLifeExpectancy) {
	this.countryLifeExpectancy = countryLifeExpectancy;
    }

    public Float getCountryGnp() {
	return countryGnp;
    }

    public void setCountryGnp(Float countryGnp) {
	this.countryGnp = countryGnp;
    }

    public Float getCountryGnpOld() {
	return countryGnpOld;
    }

    public void setCountryGnpOld(Float countryGnpOld) {
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

    public Float getCountryCapital() {
	return countryCapital;
    }

    public void setCountryCapital(Float countryCapital) {
	this.countryCapital = countryCapital;
    }

    public String getCountryCode2() {
	return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
	this.countryCode2 = countryCode2;
    }

    public List<HibernateCityEntity> getCities() {
	return cities;
    }

    public void setCities(List<HibernateCityEntity> cities) {
	this.cities = cities;
    }

    @Override
    public String toString() {
	return "CountryEntity [countryCode=" + countryCode + ", countryName=" + countryName + ", countryContinent="
		+ countryContinent + ", countryRegion=" + countryRegion + ", countrySurfaceArea=" + countrySurfaceArea
		+ ", countryIndepYear=" + countryIndepYear + ", countryPopulation=" + countryPopulation
		+ ", countryLifeExpectancy=" + countryLifeExpectancy + ", countryGnp=" + countryGnp + ", countryGnpOld="
		+ countryGnpOld + ", countryLocalName=" + countryLocalName + ", countryGovernmentForm="
		+ countryGovernmentForm + ", countryHeadOfState=" + countryHeadOfState + ", countryCapital="
		+ countryCapital + ", countryCode2=" + countryCode2 + "]";
    }

}

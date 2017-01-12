package com.tsystems.dia1.work.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "city")
public class HibernateCityEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "INT")
    private Float id;
    @Column(name = "Name", columnDefinition = "CHAR", length = 35)
    private String cityName;
    @Column(name = "CountryCode", columnDefinition = "CHAR", length = 3)
    private String cityCountryCode;

    public Float getId() {
	return id;
    }

    public void setId(Float id) {
	this.id = id;
    }

    public String getCityName() {
	return cityName;
    }

    public void setCityName(String cityName) {
	this.cityName = cityName;
    }

    public String getCityCountryCode() {
	return cityCountryCode;
    }

    public void setCityCountryCode(String cityCountryCode) {
	this.cityCountryCode = cityCountryCode;
    }

    @Override
    public String toString() {
	return "HibernateCityEntity [id=" + id + ", cityName=" + cityName + ", cityCountryCode=" + cityCountryCode
		+ "]";
    }

}

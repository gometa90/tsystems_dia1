package com.tsystems.dia1.work.domain;

public class CountryLanguageEntity {

    private final String countryCode;
    private final String language;
    private final boolean isOfficial;
    private final Long percentage;

    public CountryLanguageEntity(String countryCode, String language, boolean isOfficial, Long percentage) {
	super();
	this.countryCode = countryCode;
	this.language = language;
	this.isOfficial = isOfficial;
	this.percentage = percentage;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public String getLanguage() {
	return language;
    }

    public boolean isIsofficial() {
	return isOfficial;
    }

    public Long getPercentage() {
	return percentage;
    }

    public static CountryLanguageEntityBuilder builder() {
	return new CountryLanguageEntityBuilder();
    }

    public static class CountryLanguageEntityBuilder {
	private String countryCode;
	private String language;
	private boolean isOfficial;
	private Long percentage;

	public CountryLanguageEntityBuilder countryCode(String countryCode) {
	    this.countryCode = countryCode;
	    return this;
	}

	public CountryLanguageEntityBuilder language(String language) {
	    this.language = language;
	    return this;
	}

	public CountryLanguageEntityBuilder isOfficial(boolean isOfficial) {
	    this.isOfficial = isOfficial;
	    return this;
	}

	public CountryLanguageEntityBuilder percentage(Long percentage) {
	    this.percentage = percentage;
	    return this;
	}

	public CountryLanguageEntity build() {
	    return new CountryLanguageEntity(countryCode, language, isOfficial, percentage);
	}
    }

}

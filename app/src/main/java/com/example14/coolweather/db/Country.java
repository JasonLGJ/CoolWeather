package com.example14.coolweather.db;

import org.litepal.crud.DataSupport;

public class Country extends DataSupport {

    private int id;
    private String countryName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

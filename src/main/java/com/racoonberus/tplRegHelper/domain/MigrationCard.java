package com.racoonberus.tplRegHelper.domain;

public class MigrationCard {
    private String series;
    private String number;

    public String getSeries() {
        return series;
    }

    public MigrationCard setSeries(String series) {
        this.series = series;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public MigrationCard setNumber(String number) {
        this.number = number;
        return this;
    }
}

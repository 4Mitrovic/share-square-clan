package com.kosmopolitika.sharesquareclan.model;

public enum ClanType {

    SARADNIK("Saradnik"),
    CLAN("Clan"),
    PRETPLATNIK("Pretplatnik");

    private final String displayValue;

    private ClanType(String displayValue) {
        this.displayValue = displayValue;
    }

    public String getDisplayValue() {
        return displayValue;
    }
}
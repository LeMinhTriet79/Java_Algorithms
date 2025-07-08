package com.minhtriet.zpayment.categories;

import java.util.List;

public class InterestRate {
    private int terml;
    private String currencyVND;
    private float rateVND;
    private String currencyUSD;
    private float rateUSD;
    private Date effectiveDate;
    private String bankCode;

    public InterestRate(int terml, String currencyVND, float rateVND, String currencyUSD, float rateUSD, Date effectiveDate, String bankCode) {
        this.terml = terml;
        this.currencyVND = currencyVND;
        this.rateVND = rateVND;
        this.currencyUSD = currencyUSD;
        this.rateUSD = rateUSD;
        this.effectiveDate = effectiveDate;
        this.bankCode = bankCode;
    }
    public InterestRate() {
        // Default constructor
    }

    public List<InteresRateTable> initData() {
        var items = new ArrayList<>();
        items.add(new InterestRate(1, "VND", 0.5f, "USD", 0.02f, Date.valueOf("2023-01-01"), "BIDV"));
        items.add(new InterestRate(3, "VND", 0.1f, "USD", 0.03f, Date.valueOf("2025-01-01"), "BANK002"));
    }

    public int getTerml() {
        return terml;
    }
    public void setTerml(int terml) {
        this.terml = terml;
    }
    public String getCurrencyVND() {
        return currencyVND;
    }

    
    public void setCurrencyVND(String currencyVND) {
        this.currencyVND = currencyVND;
    }
    public float getRateVND() {
        return rateVND;
    }
    public void setRateVND(float rateVND) {
        this.rateVND = rateVND;
    }
    public String getCurrencyUSD() {
        return currencyUSD;
    }
    public void setCurrencyUSD(String currencyUSD) {
        this.currencyUSD = currencyUSD;
    }
    public float getRateUSD() {
        return rateUSD;
    }
    public void setRateUSD(float rateUSD) {
        this.rateUSD = rateUSD;
    }
    public Date getEffectiveDate() {
        return effectiveDate;
    }
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }
    public String getBankCode() {
        return bankCode;
    }
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    
}
    @Override
    public String toString() {
        return "InterestRate{" +
                "terml=" + terml +
                ", currencyVND='" + currencyVND + '\'' +
                ", rateVND=" + rateVND +
                ", currencyUSD='" + currencyUSD + '\'' +
                ", rateUSD=" + rateUSD +
                ", effectiveDate=" + effectiveDate +
                ", bankCode='" + bankCode + '\'' +
                '}';
    }

}

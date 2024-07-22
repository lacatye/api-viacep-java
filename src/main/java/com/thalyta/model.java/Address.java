package com.thalyta.model.java;

public class Address {
    
    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
    private String ibgeCode;
    private String giaCode;
    private String areaCode;
    private String siafiCode;
    
    public String getZipCode() {
        return zipCode;
    }
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public String getComplement() {
        return complement;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getIbgeCode() {
        return ibgeCode;
    }
    public void setIbgeCode(String ibgeCode) {
        this.ibgeCode = ibgeCode;
    }
    public String getGiaCode() {
        return giaCode;
    }
    public void setGiaCode(String giaCode) {
        this.giaCode = giaCode;
    }
    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public String getSiafiCode() {
        return siafiCode;
    }
    public void setSiafiCode(String siafiCode) {
        this.siafiCode = siafiCode;
    }
    
    @Override
    public String toString() {
        return "Address [zipCode=" + zipCode + ", street=" + street + ", complement=" + complement + ", neighborhood="
                + neighborhood + ", city=" + city + ", state=" + state + ", ibgeCode=" + ibgeCode + ", giaCode=" + giaCode + ", areaCode="
                + areaCode + ", siafiCode=" + siafiCode + "]";
    }
}


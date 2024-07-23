package com.thalyta.model;

import com.google.gson.annotations.SerializedName;

public class Address {

    @SerializedName("cep")
    private String zipCode;

    @SerializedName("logradouro")
    private String street;

    @SerializedName("complemento")
    private String complement;

    @SerializedName("bairro")
    private String neighborhood;

    @SerializedName("localidade")
    private String city;

    @SerializedName("uf")
    private String state;

    @SerializedName("ibge")
    private String ibgeCode;

    @SerializedName("gia")
    private String giaCode;

    @SerializedName("ddd")
    private String areaCode;

    @SerializedName("siafi")
    private String siafiCode;

    // Getters e setters

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

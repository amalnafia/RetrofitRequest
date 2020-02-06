package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

public class JobEmployer {
    @SerializedName("longitude")
    private double longitude;
    @SerializedName("latitude")
    private double latitude;
    @SerializedName("companyLogo")
    private String companyLogo;
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("email")
    private String email;
    @SerializedName("contactMobile")
    private String contactMobile;
    @SerializedName("contactPerson")
    private String contactPerson;
    @SerializedName("fullAddress")
    private String fullAddress;
    @SerializedName("id")
    private int id;

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public String getCompanyLogo() {
        return companyLogo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public int getId() {
        return id;
    }
}

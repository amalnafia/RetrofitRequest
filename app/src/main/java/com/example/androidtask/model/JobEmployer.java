package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

public class JobEmployer {

    @SerializedName("companyLogo")
    private String companyLogo;

    public String getCompanyLogo() {

        return companyLogo;
    }
    public void setCompanyLogo(String companyLogo) {
        this.companyLogo = companyLogo;
    }
}

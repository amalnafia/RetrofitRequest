package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

public class Employee {

    @SerializedName("id")
    private String id;

    @SerializedName("jobTitle")
    private String jobTitle;

    @SerializedName("createdDate")
    private String createdDate;

    @SerializedName("jobEmployer")
    private JobEmployer jobEmployer =new JobEmployer();

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public JobEmployer getJobEmployer() {
        return jobEmployer;
    }

    public void setJobEmployer(JobEmployer jobEmployer) {
        this.jobEmployer = jobEmployer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

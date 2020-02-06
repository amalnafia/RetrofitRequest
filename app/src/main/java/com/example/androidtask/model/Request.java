package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Request {

    @SerializedName("yearExperienceTo")
    private int yearExperienceTo;
    @SerializedName("yearExperienceFrom")
    private int yearExperienceFrom;
    @SerializedName("jobVacancySkills")
    private List<String> jobVacancySkills;
    @SerializedName("salaryTo")
    private int salaryTo;
    @SerializedName("salaryFrom")
    private int salaryFrom;
    @SerializedName("jobVacancyPreferredNatinality")
    private List<String> jobVacancyPreferredNatinality;
    @SerializedName("jobVacancyPreferredLanguage")
    private List<String> jobVacancyPreferredLanguage;
    @SerializedName("jobVacancyPreferredDegree")
    private List<String> jobVacancyPreferredDegree;
    @SerializedName("paging")
    private int paging;
    @SerializedName("pageSource")
    private int pageSource;
    @SerializedName("jobVacancyLocation")
    private List<String> jobVacancyLocation;
    @SerializedName("keyword")
    private String keyword;
    @SerializedName("jobVacancyIndustry")
    private List<String> jobVacancyIndustry;
    @SerializedName("id")
    private int id;
    @SerializedName("requestHeader")
    private RequestHeader requestHeader;
    @SerializedName("employmentTypeId")
    private int employmentTypeId;
    @SerializedName("employeerId")
    private int employeerId;
    @SerializedName("jobVacancyCarrerLevels")
    private List<String> jobVacancyCarrerLevels;

    public Request(int yearExperienceTo, int yearExperienceFrom,
                   List<String> jobVacancySkills,
                   int salaryTo, int salaryFrom,
                   List<String> jobVacancyPreferredNatinality,
                   List<String> jobVacancyPreferredLanguage,
                   List<String> jobVacancyPreferredDegree,
                   int paging, int pageSource, List<String> jobVacancyLocation,
                   String keyword, List<String> jobVacancyIndustry, int id,
                   RequestHeader requestHeader, int employmentTypeId,
                   int employeerId, List<String> jobVacancyCarrerLevels) {
        this.yearExperienceTo = yearExperienceTo;
        this.yearExperienceFrom = yearExperienceFrom;
        this.jobVacancySkills = jobVacancySkills;
        this.salaryTo = salaryTo;
        this.salaryFrom = salaryFrom;
        this.jobVacancyPreferredNatinality = jobVacancyPreferredNatinality;
        this.jobVacancyPreferredLanguage = jobVacancyPreferredLanguage;
        this.jobVacancyPreferredDegree = jobVacancyPreferredDegree;
        this.paging = paging;
        this.pageSource = pageSource;
        this.jobVacancyLocation = jobVacancyLocation;
        this.keyword = keyword;
        this.jobVacancyIndustry = jobVacancyIndustry;
        this.id = id;
        this.requestHeader = requestHeader;
        this.employmentTypeId = employmentTypeId;
        this.employeerId = employeerId;
        this.jobVacancyCarrerLevels = jobVacancyCarrerLevels;
    }
}

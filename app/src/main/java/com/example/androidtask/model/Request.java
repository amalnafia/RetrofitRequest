
package com.example.androidtask.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Request {

    @SerializedName("jobVacancyCarrerLevels")
    @Expose
    private List<Object> jobVacancyCarrerLevels = null;
    @SerializedName("employeerId")
    @Expose
    private int employeerId;
    @SerializedName("employmentTypeId")
    @Expose
    private int employmentTypeId;
    @SerializedName("requestHeader")
    @Expose
    private RequestHeader requestHeader;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("jobVacancyIndustry")
    @Expose
    private List<Object> jobVacancyIndustry = null;
    @SerializedName("keyword")
    @Expose
    private String keyword;
    @SerializedName("jobVacancyLocation")
    @Expose
    private List<Object> jobVacancyLocation = null;
    @SerializedName("pageSource")
    @Expose
    private int pageSource;
    @SerializedName("paging")
    @Expose
    private int paging;
    @SerializedName("jobVacancyPreferredDegree")
    @Expose
    private List<Object> jobVacancyPreferredDegree = null;
    @SerializedName("jobVacancyPreferredLanguage")
    @Expose
    private List<Object> jobVacancyPreferredLanguage = null;
    @SerializedName("jobVacancyPreferredNatinality")
    @Expose
    private List<Object> jobVacancyPreferredNatinality = null;
    @SerializedName("salaryFrom")
    @Expose
    private int salaryFrom;
    @SerializedName("salaryTo")
    @Expose
    private int salaryTo;
    @SerializedName("jobVacancySkills")
    @Expose
    private List<Object> jobVacancySkills = null;
    @SerializedName("yearExperienceFrom")
    @Expose
    private int yearExperienceFrom;
    @SerializedName("yearExperienceTo")
    @Expose
    private int yearExperienceTo;

    public Request(List<Object> jobVacancyCarrerLevels, int employeerId, int employmentTypeId, RequestHeader requestHeader, int id, List<Object> jobVacancyIndustry, String keyword, List<Object> jobVacancyLocation, int pageSource, int paging, List<Object> jobVacancyPreferredDegree, List<Object> jobVacancyPreferredLanguage, List<Object> jobVacancyPreferredNatinality, int salaryFrom, int salaryTo, List<Object> jobVacancySkills, int yearExperienceFrom, int yearExperienceTo) {
        this.jobVacancyCarrerLevels = jobVacancyCarrerLevels;
        this.employeerId = employeerId;
        this.employmentTypeId = employmentTypeId;
        this.requestHeader = requestHeader;
        this.id = id;
        this.jobVacancyIndustry = jobVacancyIndustry;
        this.keyword = keyword;
        this.jobVacancyLocation = jobVacancyLocation;
        this.pageSource = pageSource;
        this.paging = paging;
        this.jobVacancyPreferredDegree = jobVacancyPreferredDegree;
        this.jobVacancyPreferredLanguage = jobVacancyPreferredLanguage;
        this.jobVacancyPreferredNatinality = jobVacancyPreferredNatinality;
        this.salaryFrom = salaryFrom;
        this.salaryTo = salaryTo;
        this.jobVacancySkills = jobVacancySkills;
        this.yearExperienceFrom = yearExperienceFrom;
        this.yearExperienceTo = yearExperienceTo;
    }
}

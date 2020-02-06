package com.example.androidtask.model;

import com.example.androidtask.model.Extra.EmploymentType;
import com.example.androidtask.model.Extra.JobIndustry;
import com.example.androidtask.model.Extra.SalaryType;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeData {
    @SerializedName("preferredcarrerLevel")
    private List<JobIndustry> preferredcarrerLevel;
    @SerializedName("jobIndustry")
    private List<JobIndustry> jobIndustry;
    @SerializedName("skills")
    private List<JobIndustry> skills;
    @SerializedName("preferredVisaStatus")
    private List<JobIndustry> preferredVisaStatus;
    @SerializedName("preferredLanguage")
    private List<JobIndustry> preferredLanguage;
    @SerializedName("preferredMiliteryStatus")
    private List<JobIndustry> preferredMiliteryStatus;
    @SerializedName("preferredGender")
    private List<JobIndustry> preferredGender;
    @SerializedName("preferredNationality")
    private List<JobIndustry> preferredNationality;
    @SerializedName("preferredCountry")
    private List<JobIndustry> preferredCountry;
    @SerializedName("preferredDegree")
    private List<JobIndustry> preferredDegree;
    @SerializedName("jobEmployer")
    private JobEmployer jobEmployer;
    @SerializedName("employmentType")
    private EmploymentType employmentType;
    @SerializedName("salaryType")
    private SalaryType salaryType;
    @SerializedName("checkApplied")
    private boolean checkApplied;
    @SerializedName("hasQuestion")
    private boolean hasQuestion;
    @SerializedName("isFavorit")
    private boolean isFavorit;
    @SerializedName("isFollow")
    private boolean isFollow;
    @SerializedName("hideCompanyProfile")
    private boolean hideCompanyProfile;
    @SerializedName("requirement")
    private String requirement;
    @SerializedName("additionalSalaryDetails")
    private String additionalSalaryDetails;
    @SerializedName("salaryTo")
    private int salaryTo;
    @SerializedName("salaryFrom")
    private int salaryFrom;
    @SerializedName("yearExperienceTo")
    private int yearExperienceTo;
    @SerializedName("yearExperienceFrom")
    private int yearExperienceFrom;
    @SerializedName("preferredAgeTo")
    private int preferredAgeTo;
    @SerializedName("noOfEmployee")
    private int noOfEmployee;
    @SerializedName("preferredAgeFrom")
    private int preferredAgeFrom;
    @SerializedName("isConfidential")
    private boolean isConfidential;
    @SerializedName("pagging")
    private int pagging;
    @SerializedName("createdDate")
    private String createdDate;
    @SerializedName("description")
    private String description;
    @SerializedName("jobTitle")
    private String jobTitle;
    @SerializedName("reference")
    private String reference;
    @SerializedName("id")
    private int id;

    public List<JobIndustry> getPreferredcarrerLevel() {
        return preferredcarrerLevel;
    }

    public List<JobIndustry> getJobIndustry() {
        return jobIndustry;
    }

    public List<JobIndustry> getSkills() {
        return skills;
    }

    public List<JobIndustry> getPreferredVisaStatus() {
        return preferredVisaStatus;
    }

    public List<JobIndustry> getPreferredLanguage() {
        return preferredLanguage;
    }

    public List<JobIndustry> getPreferredMiliteryStatus() {
        return preferredMiliteryStatus;
    }

    public List<JobIndustry> getPreferredGender() {
        return preferredGender;
    }

    public List<JobIndustry> getPreferredNationality() {
        return preferredNationality;
    }

    public List<JobIndustry> getPreferredCountry() {
        return preferredCountry;
    }

    public List<JobIndustry> getPreferredDegree() {
        return preferredDegree;
    }

    public JobEmployer getJobEmployer() {
        return jobEmployer;
    }

    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public SalaryType getSalaryType() {
        return salaryType;
    }

    public boolean getCheckApplied() {
        return checkApplied;
    }

    public boolean getHasQuestion() {
        return hasQuestion;
    }

    public boolean getIsFavorit() {
        return isFavorit;
    }

    public boolean getIsFollow() {
        return isFollow;
    }

    public boolean getHideCompanyProfile() {
        return hideCompanyProfile;
    }

    public String getRequirement() {
        return requirement;
    }

    public String getAdditionalSalaryDetails() {
        return additionalSalaryDetails;
    }

    public int getSalaryTo() {
        return salaryTo;
    }

    public int getSalaryFrom() {
        return salaryFrom;
    }

    public int getYearExperienceTo() {
        return yearExperienceTo;
    }

    public int getYearExperienceFrom() {
        return yearExperienceFrom;
    }

    public int getPreferredAgeTo() {
        return preferredAgeTo;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public int getPreferredAgeFrom() {
        return preferredAgeFrom;
    }

    public boolean getIsConfidential() {
        return isConfidential;
    }

    public int getPagging() {
        return pagging;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public String getDescription() {
        return description;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getReference() {
        return reference;
    }

    public int getId() {
        return id;
    }
}

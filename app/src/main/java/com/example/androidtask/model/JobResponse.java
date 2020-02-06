package com.example.androidtask.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JobResponse {

    @SerializedName("data")
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}

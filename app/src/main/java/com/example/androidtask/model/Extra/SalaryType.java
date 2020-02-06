package com.example.androidtask.model.Extra;

import com.google.gson.annotations.SerializedName;

public class SalaryType {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

package com.example.androidtask.model.Extra;

import com.google.gson.annotations.SerializedName;

public class ResponseHeader {
    @SerializedName("responseRemark")
    private String responseRemark;
    @SerializedName("responseMessage")
    private String responseMessage;
    @SerializedName("responseCode")
    private int responseCode;

    public String getResponseRemark() {
        return responseRemark;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public int getResponseCode() {
        return responseCode;
    }
}

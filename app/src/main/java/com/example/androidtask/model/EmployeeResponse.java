package com.example.androidtask.model;

import androidx.annotation.NonNull;

import com.example.androidtask.ResponseStatus;
import com.example.androidtask.model.Extra.ResponseHeader;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeeResponse extends ViewHeaderModel {

    //using this constructor to check on the response status

    @SerializedName("responseHeader")
    private ResponseHeader responseHeader;
    @SerializedName("data")
    private List<EmployeeData> data;

    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    public List<EmployeeData> getData() {
        return data;
    }

    public EmployeeResponse(@NonNull ResponseStatus responseStatus, String message) {
        super(responseStatus, message);
    }

    public EmployeeResponse(@NonNull ResponseStatus responseStatus, String message,
                            ResponseHeader responseHeader, List<EmployeeData> data) {
        super(responseStatus, message);
        this.responseHeader = responseHeader;
        this.data = data;
    }
}

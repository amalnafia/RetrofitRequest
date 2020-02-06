package com.example.androidtask.model;

import android.view.View;

import androidx.annotation.NonNull;

import com.example.androidtask.ResponseStatus;

public class ViewHeaderModel {

    //class to identify the status of response which is responseStatus,message

    @NonNull
    private ResponseStatus responseStatus;

    private String message;

    public ViewHeaderModel(@NonNull ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.message = message;
    }

    public static ViewHeaderModel success(ResponseStatus responseStatus){
       return new ViewHeaderModel(ResponseStatus.SUCCESS, null);
    }

    public static ViewHeaderModel failed(String message){
        return new ViewHeaderModel(ResponseStatus.FAILED, message);
    }

    public static ViewHeaderModel error(String message){
        return new ViewHeaderModel(ResponseStatus.ERROR, message);
    }

    public static ViewHeaderModel loading(){
        return new ViewHeaderModel(ResponseStatus.LOADING, null);
    }

    public String getMessage() {
        return message;
    }

    @NonNull
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }
}

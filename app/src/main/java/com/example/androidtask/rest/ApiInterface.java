package com.example.androidtask.rest;

import com.example.androidtask.model.EmployeeResponse;
import com.example.androidtask.model.Request;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("JobVacancy/GetAvailableJob")
    Flowable<EmployeeResponse> getEmployee(@Body Request body);
}

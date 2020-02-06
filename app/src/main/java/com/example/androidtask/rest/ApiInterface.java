package com.example.androidtask.rest;

import com.example.androidtask.model.JobResponse;
import com.example.androidtask.model.Request;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {

    @POST("JobVacancy/GetAvailableJob")
    Flowable<JobResponse> getEmployee(@Body Request body);
}

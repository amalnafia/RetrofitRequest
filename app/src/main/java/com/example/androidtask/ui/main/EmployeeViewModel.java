package com.example.androidtask.ui.main;

import android.util.Log;
import android.webkit.WebView;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidtask.model.Employee;
import com.example.androidtask.model.JobResponse;
import com.example.androidtask.model.Request;
import com.example.androidtask.model.RequestHeader;
import com.example.androidtask.rest.ApiInterface;
import com.example.androidtask.rest.ServiceGenerator;


import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class EmployeeViewModel extends ViewModel {

    private static final String TAG = "EmployeeViewModel";
    MutableLiveData<List<Employee>> employeeMutableLiveData = new MutableLiveData<>();

    public void getEmployees() {
        RequestHeader requestHeader = new RequestHeader(1, "1.0", 1, 0
                , "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
                , 2, "", false, "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo",
                "Device model: SM-N950F ,Android version: 9 , Api level: 28", 0, 1);

        List<Object> emptyList = new ArrayList<>();
        Request request = new Request(emptyList, 0, 0, requestHeader, 0, emptyList, "", emptyList, 1,
                0, emptyList, emptyList, emptyList, 0, 0, emptyList, 0, 0);

//        ApiInterface apiInterface = ;
        new CompositeDisposable().add(ServiceGenerator.builder(ApiInterface.class).getEmployee(request).
                observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(this::handleResponse, this::handleError));

    }

    private void handleResponse(JobResponse jobResponse) {
        employeeMutableLiveData.setValue(jobResponse.getEmployeeList());
    }


    private void handleError(Throwable throwable) {
        Log.e(TAG, throwable.getMessage());
    }

}

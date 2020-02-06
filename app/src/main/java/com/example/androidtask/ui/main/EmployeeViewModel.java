package com.example.androidtask.ui.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androidtask.model.EmployeeData;
import com.example.androidtask.model.EmployeeResponse;
import com.example.androidtask.model.Request;
import com.example.androidtask.model.RequestHeader;
import com.example.androidtask.repo.EmployeeRepo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeViewModel extends ViewModel {
    // create method to send request
    // send to mediator on Repo the request
    // return mediatorLiveData with data
    private static final String TAG = "EmployeeViewModel";
    MediatorLiveData<EmployeeResponse> mediatorLiveData = new MediatorLiveData<>();

    public void setEmployeeMediatorLiveData() {
        RequestHeader requestHeader = new RequestHeader(1, 0, "Device model: SM-N950F ,Android version: 9 , Api level: 28",
                "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
                , false, "", 2,
                "drc-Scbc_ok:APA91bEA5_n4Jn7xQpUAyDI4xisaCUyzCx-66zoeG-m7Dh5Y8TsRPHxvJb6mTrtQp_g7qcpCV1ZcaF6ytqJ0t7XCCkfB7om_6dPxGtVBeGliI6rpCNZq-peDK7CvhL2RutuBr31_cBUo"
                , 0, 1, "1.0", 1);

        List<String> emptyList = new ArrayList<>();
        Request request = new Request(0, 0,
                emptyList, 0, 0, emptyList, emptyList, emptyList,
                0, 1, emptyList, "", emptyList, 0, requestHeader,
                0, 0, emptyList);
        mediatorLiveData = new EmployeeRepo().getEmployees(request);
    }

    public LiveData<EmployeeResponse> getEmployees() {

        return mediatorLiveData;
    }
}

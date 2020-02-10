package com.example.androidtask.repo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataReactiveStreams;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;

import com.example.androidtask.ResponseStatus;
import com.example.androidtask.model.EmployeeResponse;
import com.example.androidtask.model.Request;
import com.example.androidtask.rest.ApiInterface;
import com.example.androidtask.rest.ServiceGenerator;


import io.reactivex.schedulers.Schedulers;

public class EmployeeRepo {
    //call ApiInterface, map, handleError
    //mediatorLivedata of type responseModel
    //(source livedata , Rxjava observer)

    MediatorLiveData<EmployeeResponse> mediatorLiveData = new MediatorLiveData<>();

    public MediatorLiveData<EmployeeResponse> getEmployees(Request request) {
        mediatorLiveData.setValue(new EmployeeResponse(ResponseStatus.LOADING, null));
        final LiveData<EmployeeResponse> source = LiveDataReactiveStreams.fromPublisher(
                ServiceGenerator.builder(ApiInterface.class).getEmployee(request)
                        .map(this::MapResponse)
                        .onErrorReturn(this::handleError)
                        .subscribeOn(Schedulers.io()));
        mediatorLiveData.addSource(source, response -> {
            mediatorLiveData.setValue(response);
            mediatorLiveData.removeSource(source);
        });
        return mediatorLiveData;
    }

    private EmployeeResponse handleError(Throwable throwable) {
        return new EmployeeResponse(ResponseStatus.ERROR, throwable.getMessage());
    }

    private EmployeeResponse MapResponse(EmployeeResponse employeeResponse) {
        if (employeeResponse.getResponseHeader() == null)
            return new EmployeeResponse(ResponseStatus.ERROR, employeeResponse.getMessage());
        else if (employeeResponse.getResponseHeader().getResponseCode() == 1 &&
                employeeResponse.getData() != null) {
            return new EmployeeResponse(ResponseStatus.SUCCESS, employeeResponse.getResponseHeader().getResponseMessage(),
                    employeeResponse.getResponseHeader(), employeeResponse.getData());
        } else
            return new EmployeeResponse(ResponseStatus.FAILED, employeeResponse.getResponseHeader().getResponseMessage());
    }
}

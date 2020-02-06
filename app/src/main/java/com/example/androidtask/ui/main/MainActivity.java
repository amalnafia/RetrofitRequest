package com.example.androidtask.ui.main;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtask.R;
import com.example.androidtask.model.Employee;
import com.example.androidtask.model.JobResponse;
import com.example.androidtask.model.Request;
import com.example.androidtask.model.RequestHeader;
import com.example.androidtask.rest.ApiInterface;
import com.example.androidtask.rest.ServiceGenerator;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    static final String TAG = MainActivity.class.getSimpleName();
    EmployeeViewModel employeeViewModel;

    @BindView(R.id.main_recyclerview)
    RecyclerView main_recyclerview;

    private MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        employeeViewModel = ViewModelProviders.of(this).get(EmployeeViewModel.class);
        main_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(getApplicationContext());
        main_recyclerview.setAdapter(mainAdapter);
        employeeViewModel.getEmployees();
        employeeViewModel.employeeMutableLiveData.observe(this, employees -> mainAdapter.setEmployees(employees));
    }
}

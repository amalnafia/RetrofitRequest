package com.example.androidtask.ui.main;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidtask.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //get data from viewmodel "getEmployees" and observe of data status

    static final String TAG = MainActivity.class.getSimpleName();
    EmployeeViewModel employeeViewModel;

    @BindView(R.id.main_recyclerview)
    RecyclerView main_recyclerview;

    private MainAdapter mainAdapter;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        progressDialog = new ProgressDialog(this);
        employeeViewModel = ViewModelProviders.of(this).get(EmployeeViewModel.class);
        main_recyclerview.setLayoutManager(new LinearLayoutManager(this));
        mainAdapter = new MainAdapter(getApplicationContext());
        main_recyclerview.setAdapter(mainAdapter);
        employeeViewModel.setEmployeeMediatorLiveData();
        employeeViewModel.getEmployees().observe(this, employees -> {
            switch (employees.getResponseStatus()) {
                case ERROR:

                    Log.e(TAG, "onCreate: " + employees.getMessage());
                    break;
                case FAILED:
                    break;
                case LOADING:
                    progressDialog.show();
                    break;
                case SUCCESS:
                    progressDialog.dismiss();
                    mainAdapter.setEmployees(employees.getData());
                    break;
            }
        });
    }
}

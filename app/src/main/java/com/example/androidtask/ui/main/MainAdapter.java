package com.example.androidtask.ui.main;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidtask.R;
import com.example.androidtask.model.Employee;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private Context context;
    private List<Employee> employees;

    public MainAdapter(Context context) {
        this.context = context;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MainAdapter.ViewHolder holder, int position) {
        final Employee employee = employees.get(position);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Employee ID: " + employee.getId(),
                        Toast.LENGTH_SHORT).show();
            }
        });

        holder.jobTitle.setText(employee.getJobTitle());

        SimpleDateFormat fmtIn = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat fmtOut = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = fmtIn.parse(employee.getCreatedDate());
            String formattedDate = fmtOut.format(date);
            holder.createdDate.setText(formattedDate);

        } catch (Exception e) {
            e.printStackTrace();
        }

        Glide.with(context)
                .load(employee.getJobEmployer().getCompanyLogo())
                .override(300, 300)
                .into(holder.image);
    }

    @Override
    public int getItemCount() {
        return employees != null ? employees.size() : 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        TextView jobTitle;
        @BindView(R.id.date)
        TextView createdDate;
        @BindView(R.id.image)
        ImageView image;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}

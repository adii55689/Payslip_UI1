package com.example.payslip_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TextView calender = (TextView)findViewById(R.id.calender);
        TextView employee = (TextView)findViewById(R.id.employee);

        calender.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Calender",Toast.LENGTH_LONG).show();
            }
        }));

        employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Employee pressed",Toast.LENGTH_LONG).show();
                employee();

            }
        });




    }
    public void employee()
    {
        Intent main = new Intent(this,add_employee.class);
        startActivity(main);
    }
}
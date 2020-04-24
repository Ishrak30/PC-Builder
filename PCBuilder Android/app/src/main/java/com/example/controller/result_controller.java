package com.example.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.extraclasses.result;
import com.rest.dao.BuilderFunctions;

public class result_controller extends AppCompatActivity {

    private String email;

    TextView gpuresult;
    TextView CPUresult;
    TextView RAMresult;
    TextView Moboresult;
    TextView HDDresult;
    TextView Psuresult;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_layout);

        Bundle bundle = getIntent().getExtras();
        result build = (result) bundle.getSerializable("result");

        gpuresult = (TextView) findViewById(R.id.gpu_result);
        gpuresult.setText(build.getGPU());

        CPUresult = (TextView) findViewById(R.id.processor_result);
        CPUresult.setText(build.getCPU());

        RAMresult = (TextView) findViewById(R.id.ram_result);
        RAMresult.setText(build.getRAM());

        Moboresult = (TextView) findViewById(R.id.motherboard_result);
        Moboresult.setText(build.getMOBO());

        HDDresult = (TextView) findViewById(R.id.storage_result);
        HDDresult.setText(build.getHDD());

        Psuresult = (TextView) findViewById(R.id.PSU_result);
        Psuresult.setText(build.getPSU());

        save = (Button) findViewById(R.id.saveresult);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = getEmail();
                BuilderFunctions builderFunctions = new BuilderFunctions();
                builderFunctions.savebuild(email,build);
            }
        });
    }



    public String getEmail() {
        SharedPreferences sharedPreferences = getSharedPreferences("User_Email", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email","");
    return email;
    }
};

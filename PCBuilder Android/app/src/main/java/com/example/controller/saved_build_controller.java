package com.example.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.extraclasses.SavedBuilds;
import com.extraclasses.User;
import com.rest.dao.BuilderFunctions;

import java.util.ArrayList;
import java.util.List;

public class saved_build_controller extends AppCompatActivity {

    String[] saved_build_no={"     Build no 1 ","     Build no 2","     Build no 3","     Build no 4"} ;
    //  String[] des = {"build 1 des","build 2 des","build 3 des","build 4 des"} ;

    ArrayAdapter<String> adapter;

    Spinner sp;
    TextView description;
    TextView GPU;
    TextView CPU;
    TextView MOBO;
    TextView HDD;
    TextView PSU;
    TextView RAM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saved_build_layout);

        GPU = (TextView) findViewById(R.id.gpu_result);
        CPU = (TextView) findViewById(R.id.processor_result);
        MOBO = (TextView) findViewById(R.id.motherboard_result);
        HDD = (TextView) findViewById(R.id.storage_result);
        PSU = (TextView) findViewById(R.id.PSU_result);
        RAM = (TextView) findViewById(R.id.ram_result);

        Bundle bundle = getIntent().getExtras();

        List<SavedBuilds> builds = (List<SavedBuilds>) bundle.getSerializable("builds");

        List<String> buildslist = new ArrayList<String>();
        for(int i=0;i<builds.size();i++){
            String itemno = "Build " + (i+1);
            buildslist.add(itemno);
        }


        sp = (Spinner) findViewById(R.id.sp1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_spinner_item,buildslist);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(adapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                int index = sp.getSelectedItemPosition();
                getresults(index,builds);
             }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

public void getresults(int pos,List<SavedBuilds> builds){
    SavedBuilds build = builds.get(pos);
    GPU.setText(build.getGpu());
    CPU.setText(build.getCpu());
    MOBO.setText(build.getMobo());
    RAM.setText(build.getRam());
    PSU.setText(build.getPsu());
    HDD.setText(build.getHdd());
}

    public void logout(View view) {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
}

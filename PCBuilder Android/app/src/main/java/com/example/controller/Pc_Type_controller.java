package com.example.controller;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.extraclasses.Budget_and_type;
import com.extraclasses.SavedBuilds;
import com.extraclasses.User;
import com.extraclasses.result;
import com.rest.dao.BuildJsonPlaceHolderApi;
import com.rest.dao.BuilderFunctions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Pc_Type_controller extends AppCompatActivity {

    ImageButton voiinputrecord;
    Button generalbuild;
    Button workbuild;
    Button gamingbuild;
    EditText speechtext;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pc_type_layout);

        voiinputrecord = (ImageButton) findViewById(R.id.voiceinput);
        generalbuild = (Button) findViewById(R.id.general_pc_button);
        workbuild = (Button) findViewById(R.id.working_pc_button);
        gamingbuild = (Button) findViewById(R.id.button4);

        generalbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "general";
                Intent intent = new Intent(getApplicationContext(),budget_controller.class);
                intent.putExtra("pctype",type);
                startActivity(intent);
            }
        });

        workbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "work";
                Intent intent = new Intent(getApplicationContext(),budget_controller.class);
                intent.putExtra("pctype",type);
                startActivity(intent);
            }
        });

        gamingbuild.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                type = "gaming";
                Intent intent = new Intent(getApplicationContext(),budget_controller.class);
                intent.putExtra("pctype",type);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 10:
                if(resultCode==RESULT_OK && data != null){
                    ArrayList<String> result =  data.
                            getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);

                    String speechinput = result.get(0);
                    BuilderFunctions builderFunctions = new BuilderFunctions();
                    Budget_and_type budget_and_type = new Budget_and_type();


                    budget_and_type.setType(builderFunctions.gettypefromspeech(speechinput));
                    budget_and_type.setBudget(builderFunctions.getbudgetfromspeech(speechinput));
                    result buildresult = builderFunctions.buildpc(budget_and_type);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(getApplicationContext(),result_controller
                                    .class);
                            intent.putExtra("result",buildresult);
                            startActivity(intent);
                        }
                    },2000);

                }
                break;
        }
    }

    public void speech(View view) {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());

        if(intent.resolveActivity(getPackageManager()) != null)
            startActivityForResult(intent,10);
        else
            Toast.makeText(this,"Speech input not supported by device",Toast.LENGTH_SHORT).show();


    }

    public void show_builds(View view) {


        User user = getUser();

        //must have own localhost ip address in base url
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.105:8080/PC_Builder/results/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        List<SavedBuilds> savedBuilds = new ArrayList<SavedBuilds>();

        BuildJsonPlaceHolderApi buildJsonPlaceHolderApi = retrofit.create(BuildJsonPlaceHolderApi
                .class);

        Call<List<SavedBuilds>> call = buildJsonPlaceHolderApi.getsavedbuilds(user);

        call.enqueue(new Callback<List<SavedBuilds>>() {
            @Override
            public void onResponse(Call<List<SavedBuilds>> call, Response<List<SavedBuilds>> response) {
                if (!response.isSuccessful()) {
                    Log.i("Connection Failure :", "404 Error");
                    return;
                }
                savedBuilds.addAll(response.body());
            }

            @Override
            public void onFailure(Call<List<SavedBuilds>> call, Throwable t) {
                Log.i("Connection Failed :","No response");
            }
        });



    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(getApplicationContext(),saved_build_controller.class);
            intent.putExtra("builds", (Serializable) savedBuilds);
            startActivity(intent);
        }
    },3000);
    }


    public User getUser(){
        SharedPreferences sharedPreferences = getSharedPreferences("User_Email", Context.MODE_PRIVATE);
        String email = sharedPreferences.getString("email","");
        String password = sharedPreferences.getString("password","");

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        return user;
    }
}


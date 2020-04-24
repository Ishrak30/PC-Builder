package com.example.controller;

import android.content.Intent;
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
import com.extraclasses.result;
import com.rest.dao.BuildJsonPlaceHolderApi;
import com.rest.dao.BuilderFunctions;

import java.util.ArrayList;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class budget_controller extends AppCompatActivity {


Button build;
EditText amount_input;
result buildresult = new result();


BuilderFunctions builderfunctions = new BuilderFunctions();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.budget_layout);

        Bundle bundle = getIntent().getExtras();
        String type = bundle.getString("pctype");


        build = (Button) findViewById(R.id.resultbutton);
        amount_input = (EditText) findViewById(R.id.budgetinput);



       build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (amount_input.getText().toString().isEmpty() ||
                        !amount_input.getText().toString().matches(".*\\d.*") ||
                        Double.parseDouble(amount_input.getText().toString()) < 41000) {
                    Toast.makeText(getApplicationContext(), "Please enter correct budget above 41000",
                            Toast.LENGTH_LONG).show();
                }else {

                    Budget_and_type price = new Budget_and_type();
                    double user_budget = Double.parseDouble(amount_input.getText().toString());

                    price.setType(type);
                    price.setBudget(user_budget);
                    String asd = Double.toString(price.getBudget());
                    Log.i("budget :", asd);
                    Log.i("type", price.getType());
                    buildresult = builderfunctions.buildpc(price);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent intent = new Intent(getApplicationContext(), result_controller.class);
                            intent.putExtra("result", buildresult);
                            startActivity(intent);

                        }
                    }, 2000);
                }
            }
        });


}
}

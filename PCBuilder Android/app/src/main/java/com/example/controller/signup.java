package com.example.controller;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.extraclasses.User;
import com.rest.dao.UserJsonPlaceHolderApi;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class signup extends AppCompatActivity {


EditText email;
EditText password;
Button signupbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        email = (EditText) findViewById(R.id.editText4);
        password = (EditText) findViewById(R.id.editText3);
        signupbutton = (Button) findViewById(R.id.button);

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //must have own localhost ip address in base url
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.105:8080/PC_Builder/rest/")
                        .addConverterFactory(GsonConverterFactory.create()).build();
                User user = new User(email.getText().toString(),password.getText().toString());
                UserJsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(UserJsonPlaceHolderApi.class);
                Call<User> call = jsonPlaceHolderApi.adduser(user);

                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if(!response.isSuccessful()){
                            Log.i("Connection Failure :","404 Error");
                            return;
                        }

                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.i("Connection Failed :","No response");
                    }
                });
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

    }



}

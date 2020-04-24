package com.example.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.extraclasses.User;
import com.rest.dao.UserFunctions;
import com.rest.dao.UserJsonPlaceHolderApi;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button loginbutton;
    TextView signupbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        email = (EditText) findViewById(R.id.emailinput);
        password = (EditText) findViewById(R.id.editText2);
        loginbutton = (Button) findViewById(R.id.button2);
        signupbutton = (TextView) findViewById(R.id.signup);
        List<User> users = new ArrayList<User>();



        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



              //  retrofit part to get the userlist
                //must have own localhost ip address in base url
                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.105:8080/PC_Builder/rest/")
                        .addConverterFactory(GsonConverterFactory.create()).build();

                UserJsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(UserJsonPlaceHolderApi.class);
                Call<List<User>> call = jsonPlaceHolderApi.getUsers();

                call.enqueue(new Callback<List<User>>() {
                    @Override
                    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                        if(!response.isSuccessful()){
                            Log.i("Connection Failure :","404 Error");
                            return;
                        }
                        users.addAll(response.body());
                    }

                    @Override
                    public void onFailure(Call<List<User>> call, Throwable t) {
                        Log.i("Connection Failed :","No response");
                    }
                });



                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        UserFunctions userFunctions = new UserFunctions();
                        if(userFunctions.login(email.getText().toString(),password.getText().toString(),users))
                        {
                            startsession();
                            Intent intent = new Intent(getApplicationContext(),Pc_Type_controller.class);
                            startActivity(intent);
                        }else
                            Toast.makeText(getApplicationContext(), "Incorrect Credentials", LENGTH_SHORT).show();

                    }
                },1000);


            }
        });

        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),signup.class);
                startActivity(intent);
            }
        });
    }
public void startsession(){

        SharedPreferences sharedPreferences = getSharedPreferences("User_Email", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("email",email.getText().toString()).commit();
        editor.putString("password",password.getText().toString()).commit();
    }


}


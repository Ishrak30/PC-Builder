package com.rest.dao;

import android.os.Handler;
import android.util.Log;

import com.extraclasses.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserFunctions {


    public boolean login(String email, String password,List<User> users){
        boolean login = false;
                    for (User USER : users) {
                        if(USER.getEmail().equals(email)&&USER.getPassword().equals(password))
                            login = true;
                    }
        return login;
                }
}

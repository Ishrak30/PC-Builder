package com.rest.dao;

import com.extraclasses.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserJsonPlaceHolderApi {
    @GET("listusers")
    Call<List<User>> getUsers();


    @POST("adduser")
    Call<User> adduser(@Body User user);
}

package com.rest.dao;

import com.extraclasses.Budget_and_type;
import com.extraclasses.SavedBuilds;
import com.extraclasses.User;
import com.extraclasses.result;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface BuildJsonPlaceHolderApi {
    @GET("workpc")
    Call<result> getworkresult();

    @GET("gamingpc")
    Call<result> getgamingresult();

    @GET("generalpc")
    Call<result> getgeneralresult();

    @POST("budgetinput")
    Call<result> inputamount(@Body Budget_and_type price);

    @POST("save")
    Call<SavedBuilds> savebuild(@Body SavedBuilds build);

    @POST("savedbuildslist")
    Call<List<SavedBuilds>> getsavedbuilds(@Body User user);
}

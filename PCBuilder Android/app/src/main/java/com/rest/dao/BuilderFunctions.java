package com.rest.dao;

import android.util.Log;

import com.extraclasses.Budget_and_type;
import com.extraclasses.SavedBuilds;
import com.extraclasses.User;
import com.extraclasses.result;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class BuilderFunctions {
    public result buildpc(Budget_and_type budget_and_type){
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.105:8080/PC_Builder/buildpc/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        BuildJsonPlaceHolderApi buildJsonPlaceHolderApi = retrofit.create(BuildJsonPlaceHolderApi.class);

        result pcresult = new result();
        Call<result> call = buildJsonPlaceHolderApi.inputamount(budget_and_type);

        call.enqueue(new Callback<result>() {
            @Override
            public void onResponse(Call<result> call, Response<result> response) {
                if (!response.isSuccessful()) {
                    Log.i("Connection Failure :", "404 Error");
                    return;
                }

                pcresult.setGPU(response.body().getGPU());
                pcresult.setCPU(response.body().getCPU());
                pcresult.setHDD(response.body().getHDD());
                pcresult.setMOBO(response.body().getMOBO());
                pcresult.setPSU(response.body().getPSU());
                pcresult.setRAM(response.body().getRAM());
            }
            @Override
            public void onFailure(Call<result> call, Throwable t) {
                Log.i("Connection Failed :","No response");
            }
        });
        return pcresult;
    }

    public String gettypefromspeech(String speech){
        String PCtype = null;


        //determining pc type from voice input
        if(speech.contains("gaming")||speech.contains("GAMING"))
            PCtype = "Gamingpc";
        else if(speech.contains("work")||speech.contains("workstation"))
            PCtype = "Workpc";
        else if(speech.contains("general")||speech.contains("generaluse"))
            PCtype = "Generalpc";
        else
            PCtype = "Generalpc";
        return PCtype;
    }

    public double getbudgetfromspeech(String speech){
        double budget = Double.parseDouble(speech.replaceAll("[^0-9]",""));
        return budget;
    }

    public void savebuild(String email,result build_to_save){
        SavedBuilds savedBuild = new SavedBuilds();
        savedBuild.setEmail(email);
        savedBuild.setCpu(build_to_save.getCPU());
        savedBuild.setGpu(build_to_save.getGPU());
        savedBuild.setHdd(build_to_save.getHDD());
        savedBuild.setMobo(build_to_save.getMOBO());
        savedBuild.setRam(build_to_save.getRAM());
        savedBuild.setPsu(build_to_save.getRAM());
        //must have own localhost ip address in base url
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.0.105:8080/PC_Builder/results/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        BuildJsonPlaceHolderApi buildJsonPlaceHolderApi = retrofit.create(BuildJsonPlaceHolderApi.class);

        Call<SavedBuilds> call = buildJsonPlaceHolderApi.savebuild(savedBuild);

        call.enqueue(new Callback<SavedBuilds>() {
            @Override
            public void onResponse(Call<SavedBuilds> call, Response<SavedBuilds> response) {
                if (!response.isSuccessful()) {
                    Log.i("Connection Failure :", "404 Error");
                    return;
                }
            }

            @Override
            public void onFailure(Call<SavedBuilds> call, Throwable t) {
                Log.i("Connection Failed :","No response");
            }
        });
    }

    public List<SavedBuilds> getbuilds(User user){
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


        return savedBuilds;
    }
}

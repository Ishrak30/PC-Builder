package com.extraclasses;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SavedBuilds implements Serializable {
    @SerializedName("email")
    private String email;

    @SerializedName("cpu")
    private String cpu;

    @SerializedName("gpu")
    private String gpu;

    @SerializedName("mobo")
    private String mobo;

    @SerializedName("psu")
    private String psu;

    @SerializedName("hdd")
    private String hdd;

    @SerializedName("ram")
    private String ram;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getMobo() {
        return mobo;
    }

    public void setMobo(String mobo) {
        this.mobo = mobo;
    }

    public String getPsu() {
        return psu;
    }

    public void setPsu(String psu) {
        this.psu = psu;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }
}

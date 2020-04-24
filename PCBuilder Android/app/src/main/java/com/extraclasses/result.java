package com.extraclasses;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class result implements Serializable {
    @SerializedName("cpu_model")
    private String CPU;
    @SerializedName("gpumodel")
    private String GPU;
    @SerializedName("mobo_model")
    private String MOBO;
    @SerializedName("hdd_model")
    private String HDD;
    @SerializedName("ram_model")
    private String RAM;
    @SerializedName("psumodel")
    private String PSU;



    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getMOBO() {
        return MOBO;
    }

    public void setMOBO(String MOBO) {
        this.MOBO = MOBO;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getPSU() {
        return PSU;
    }

    public void setPSU(String PSU) {
        this.PSU = PSU;
    }
}

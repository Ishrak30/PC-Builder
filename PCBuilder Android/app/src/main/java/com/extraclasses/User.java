package com.extraclasses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("serial")
    private String serial;
    @SerializedName("email")
    private String email;
    @SerializedName("pass")
    private String password;

    public User() {
    }

    public User(String email, String password) {

        this.email = email;
        this.password = password;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

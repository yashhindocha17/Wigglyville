package com.example.wigglyville;

public class SignUpModel {

    String email;
    String username;
    String pword;

    public SignUpModel(String email, String username, String pword){
        this.email = email;
        this.username = username;
        this.pword = pword;
    }

    public String getEmail(){ return email; }

    public String getUsername() {
        return username;
    }

    public String getPword() {
        return pword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }
}

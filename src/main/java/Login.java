package com.grp57.app;

public class Login {
    private String username, password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }
    
    public String getPassword(){
        return password;
    }
}
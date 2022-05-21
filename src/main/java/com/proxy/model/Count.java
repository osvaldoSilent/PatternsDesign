package com.proxy.model;

public class Count {
    String password, user;
    public Count(String password, String user){
            this.password=password;
            this.user=user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}

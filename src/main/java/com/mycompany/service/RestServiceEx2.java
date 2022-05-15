package com.mycompany.service;

import com.mycompany.interf.IRestService;

public class RestServiceEx2 implements IRestService {
    private RestServiceEx2(){

    }
    private static RestServiceEx2 restServiceEx2;
    public static RestServiceEx2 getInstance(){
        if(restServiceEx2 ==null){
            restServiceEx2 = new RestServiceEx2();
        }
        return restServiceEx2;
    }

    @Override
    public void connect() {
        System.out.println("REST service example 2 connected");
    }

    @Override
    public void disconnect() {
        System.out.println("REST service example 2 disconnected");
    }
}

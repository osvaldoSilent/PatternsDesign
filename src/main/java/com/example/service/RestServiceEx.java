package com.example.service;

import com.example.factory.Factory;
import com.example.interf.IService;

public class RestServiceEx extends Factory implements IService{


    private RestServiceEx(){

    }
    private static RestServiceEx restServiceEx;
    public static RestServiceEx getInstance(){
        if(restServiceEx ==null){
            restServiceEx = new RestServiceEx();
        }
        return restServiceEx;
    }
    @Override
    public void connect() {
        System.out.println("REST service example 1 connected");
    }
    @Override
    public void disconnect() {
        System.out.println("REST service example 1 disconnected");
    }

    public IService getService() {
        if(restServiceEx ==null){
            restServiceEx = RestServiceEx.getInstance();
        }
        return restServiceEx;
    }
}

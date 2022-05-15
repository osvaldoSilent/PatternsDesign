package com.mycompany.service;

public class RestServiceEx implements com.mycompany.interf.IRestService {


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
}

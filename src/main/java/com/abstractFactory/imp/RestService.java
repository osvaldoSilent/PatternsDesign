package com.abstractFactory.imp;

import com.abstractFactory.interf.IService;

public class RestService implements IService {
    private static IService restService;
    private RestService(){}
    public static IService getInstance(){
        if(restService==null){
            restService=new RestService();
        }
        return restService;
    }
    @Override
    public void callService() {
        System.out.println("calling Rest service");
    }
}

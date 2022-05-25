package com.factorydecorator.imp;

import com.factorydecorator.inter.IService;

public class RestService implements IService {
    private static RestService restService;
    private RestService(){}
    public static RestService getInstance(){
        if(restService==null) restService = new RestService();
        return restService;
    }
    @Override
    public void callService() {
        System.out.println("Rest service called");
    }
}

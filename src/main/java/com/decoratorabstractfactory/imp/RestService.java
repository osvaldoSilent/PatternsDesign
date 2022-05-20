package com.decoratorabstractfactory.imp;

import com.decoratorabstractfactory.interf.IService;

public class RestService implements IService {

    private static IService restService;
    private RestService(){}
    public static IService getInstance(){
        if(restService==null)restService=new RestService();
        return restService;
    }

    @Override
    public void connect() {
        System.out.println("Calling REST service");
    }

}

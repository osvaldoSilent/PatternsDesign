package com.services.imp.service.rest;

import com.services.interf.IRest;

public class ServiceRest2 implements IRest {
    private static ServiceRest2 serviceRest2;
    private ServiceRest2(){}
    public static ServiceRest2 getInstance(){
        if(serviceRest2 == null) serviceRest2 = new ServiceRest2();
        return serviceRest2;
    }

    @Override
    public void call() {
        System.out.println("Rest 2 called");
    }
}

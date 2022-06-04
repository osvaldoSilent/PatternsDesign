package com.services.imp.service.rest;


import com.services.interf.IRest;

public class ServiceRest1 implements IRest {
    private static ServiceRest1 serviceRest1;
    private ServiceRest1(){}
    public static ServiceRest1 getInstance(){
        if(serviceRest1 == null) serviceRest1 = new ServiceRest1();
        return serviceRest1;
    }

    @Override
    public void call() {
        System.out.println("Rest 1 called");
    }
}

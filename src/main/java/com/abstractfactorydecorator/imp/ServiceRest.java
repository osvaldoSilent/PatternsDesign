package com.abstractfactorydecorator.imp;

import com.abstractfactorydecorator.interf.IService;
import com.abstractfactorydecorator.interf.AbstractDecorator;

public class ServiceRest implements IService {
    private static IService serviceRest;
    private ServiceRest(){}
    public static IService getInstance(){
        if(serviceRest==null) serviceRest= new ServiceRest();
        return serviceRest;
    }
    @Override
    public void callService() {
        System.out.println("Calling RestService");
    }
}

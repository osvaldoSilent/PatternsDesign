package com.abstractfactory.imp;

import com.abstractfactory.interf.IService;

public class ServiceRest implements IService {
    private static ServiceRest serviceRest;
    private ServiceRest(){}
    public static ServiceRest getInstance(){
        if(serviceRest==null) serviceRest= new ServiceRest();
        return serviceRest;
    }
    @Override
    public void callService() {
        System.out.println("Calling RestService");
    }
}

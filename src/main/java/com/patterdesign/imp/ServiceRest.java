package com.patterdesign.imp;

import com.patterdesign.interfa.IServiceRest;

public class ServiceRest implements IServiceRest {
    private static ServiceRest serviceRest;
    private ServiceRest(){}
    public static ServiceRest getInstance(){
        if(serviceRest==null) serviceRest = new ServiceRest();
        return serviceRest;
    }

    @Override
    public void callService() {
        System.out.println("Rest called");
    }
}

package com.decoratorfactory.imp;

import com.decoratorfactory.interfa.IServiceRest;

public class ServiceRest implements IServiceRest {
    private static ServiceRest serviceRest;
    private ServiceRest(){}
    public static ServiceRest getInstance(){
        if(serviceRest==null) serviceRest = new ServiceRest();
        return serviceRest;
    }

    @Override
    public void call() {
        System.out.println("Rest called");
    }
}

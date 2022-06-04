package com.services.imp.factory;

import com.services.imp.service.rest.ServiceRest1;
import com.services.imp.service.rest.ServiceRest2;
import com.services.interf.IRest;
import com.services.interf.factory.AbstractFactory;

public class FactoryRest extends AbstractFactory {
    private static FactoryRest factoryRest;
    private FactoryRest(){}
    public static FactoryRest getInstance(){
        if(factoryRest == null) factoryRest = new FactoryRest();
        return factoryRest;
    }

    public static IRest getRestService(String restService){
        if(restService.equalsIgnoreCase("rest1")) return ServiceRest1.getInstance();
        else if(restService.equalsIgnoreCase("rest2")) return ServiceRest2.getInstance();
        return null;
    }
}

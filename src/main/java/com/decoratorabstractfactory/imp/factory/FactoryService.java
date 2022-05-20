package com.decoratorabstractfactory.imp.factory;

import com.decoratorabstractfactory.imp.RestService;
import com.decoratorabstractfactory.interf.AbstractFactory;
import com.decoratorabstractfactory.interf.IService;

public class FactoryService extends AbstractFactory {
    private static FactoryService factoryService;
    private FactoryService(){}

    public static FactoryService getInstance(){
        if(factoryService==null) factoryService = new FactoryService();
        return factoryService;
    }
    public static IService getService(String service){
        if(service.equalsIgnoreCase("rest")) return RestService.getInstance();
        else return null;
    }

    public static AbstractFactory getFactory(){
        return factoryService.getInstance();
    }
}

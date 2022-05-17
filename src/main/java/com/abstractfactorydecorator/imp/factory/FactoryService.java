package com.abstractfactorydecorator.imp.factory;

import com.abstractfactorydecorator.imp.ServiceRest;
import com.abstractfactorydecorator.imp.ServiceSoap;
import com.abstractfactorydecorator.interf.AbstractFactory;
import com.abstractfactorydecorator.interf.IService;

public class FactoryService extends AbstractFactory {
    static FactoryService factoryService;
    private FactoryService(){}
    public static IService getService(String service){
        if(service.equalsIgnoreCase("REST"))
            return ServiceRest.getInstance();
        if(service.equalsIgnoreCase("SOAP"))
            return ServiceSoap.getInstance();
        else return null;
    }

    @Override
    public AbstractFactory getAbstractFactory() {
        if(factoryService==null)factoryService=new FactoryService();
        return factoryService;
    }

    public static AbstractFactory getFactory(){
        if(factoryService==null)factoryService=new FactoryService();
        return factoryService;
    }
}

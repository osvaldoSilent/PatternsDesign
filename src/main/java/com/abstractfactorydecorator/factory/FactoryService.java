package com.abstractfactorydecorator.factory;

import com.abstractfactory.imp.ServiceRest;
import com.abstractfactory.imp.ServiceSoap;
import com.abstractfactory.interf.AbstractFactory;
import com.abstractfactory.interf.IService;

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

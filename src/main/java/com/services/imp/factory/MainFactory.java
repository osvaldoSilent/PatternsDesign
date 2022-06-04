package com.services.imp.factory;

import com.services.interf.factory.AbstractFactory;

public class MainFactory extends AbstractFactory {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rest")) FactoryRest.getInstance();
        else if (factory.equalsIgnoreCase("soap")) FactorySoap.getInstance();
        return null;
    }
}

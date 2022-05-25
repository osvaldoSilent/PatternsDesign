package com.factorydecorator.factory;

import com.factorydecorator.imp.SoapService;
import com.factorydecorator.inter.AbstractFactory;

public class FactorySoapService extends AbstractFactory {
    private static AbstractFactory factory;
    private FactorySoapService(){}

    public static SoapService getService(String soap){
        if(soap.equalsIgnoreCase("soap")) return SoapService.getInstance();
        else return null;
    }

    public static AbstractFactory getFactory(){
        if(factory==null) factory = new FactorySoapService();
        return factory;
    }
}

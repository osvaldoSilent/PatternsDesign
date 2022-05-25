package com.factorydecorator.factory;

import com.abstractfactorydecorator.imp.factory.FactoryService;
import com.factorydecorator.inter.AbstractFactory;

public class MainFactory extends AbstractFactory {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rest")) return FactoryRestService.getAbstractFactory();
        else if (factory.equalsIgnoreCase("soap")) return FactorySoapService.getFactory();
        return null;
    }
}

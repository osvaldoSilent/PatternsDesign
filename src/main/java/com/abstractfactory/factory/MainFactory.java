package com.abstractfactory.factory;

import com.abstractfactory.interf.AbstractFactory;

public class MainFactory {
    public static AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("SERVICES"))
            return FactoryService.getFactory();
        else if(factory.equalsIgnoreCase("CONNECTIONS"))
            return FactoryConnection.getFactory();
        else return null;
    }
}

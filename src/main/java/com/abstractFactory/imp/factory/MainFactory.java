package com.abstractFactory.imp.factory;

import com.abstractFactory.interf.AbstractFactory;

public class MainFactory extends AbstractFactory {

    public static AbstractFactory getFactory(String factory) {
        if(factory.equalsIgnoreCase("database")){
            return DataBaseFactory.getFactory();
        }else if(factory.equalsIgnoreCase("service")){
            return ServiceFactory.getFactory();
        }else{
            return null;
        }

    }
}

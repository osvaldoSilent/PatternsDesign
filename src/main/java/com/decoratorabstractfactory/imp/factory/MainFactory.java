package com.decoratorabstractfactory.imp.factory;

import com.decoratorabstractfactory.interf.AbstractFactory;

public class MainFactory extends AbstractFactory {
    public static AbstractFactory getFactory(String motor){
        if(motor.equalsIgnoreCase("service")) return FactoryService.getFactory();
        else if (motor.equalsIgnoreCase("DB")) return FactoryDB.getFactory();
        else return null;
    }
}

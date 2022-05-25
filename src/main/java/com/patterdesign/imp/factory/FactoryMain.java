package com.patterdesign.imp.factory;

import com.patterdesign.interfa.AbstractFactory;
import com.patterdesign.interfa.IFactory;

public class FactoryMain extends AbstractFactory implements IFactory {
    private static FactoryMain factoryMain;
    private FactoryMain(){}
    public static AbstractFactory getInstance(){
        if(factoryMain==null) factoryMain = new FactoryMain();
        return  factoryMain;
    }
    public static IFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rest")) return FactoryServiceRest.getInstance();
        else return null;
    }

}

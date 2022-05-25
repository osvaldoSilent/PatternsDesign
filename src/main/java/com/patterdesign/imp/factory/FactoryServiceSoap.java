package com.patterdesign.imp.factory;

import com.patterdesign.interfa.IFactory;

public class FactoryServiceSoap implements IFactory {
    private static FactoryServiceSoap factoryServiceSoap;
    private FactoryServiceSoap(){}
    public static IFactory getInstance(){
        if(factoryServiceSoap==null) factoryServiceSoap = new FactoryServiceSoap();
        return factoryServiceSoap;
    }

}

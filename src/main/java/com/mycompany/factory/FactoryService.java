package com.mycompany.factory;

import com.mycompany.interf.IFactory;

public class FactoryService extends IFactory{

    public static IFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("REST")) return FactoryRestService.getFactory();
        else if(factory.equalsIgnoreCase("SOAP")) return FactorySoapService.getFactory();
        else return null;
    }

}

package com.example.factory;

import com.example.service.RestServiceEx;

public class FactoryServiceProducer {
    Factory factory;
    public static Factory getFactory(String factory){
        if(factory.equalsIgnoreCase("REST"))
            return RestServiceEx.getInstance();
        else return null;
    }
}

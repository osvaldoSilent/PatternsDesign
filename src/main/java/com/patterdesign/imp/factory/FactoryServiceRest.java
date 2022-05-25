package com.patterdesign.imp.factory;

import com.patterdesign.imp.ServiceRest;
import com.patterdesign.interfa.IFactory;
import com.patterdesign.interfa.IServiceRest;

public class FactoryServiceRest implements IFactory{
    private static FactoryServiceRest factoryServiceRest;
    private FactoryServiceRest(){}
    public static FactoryServiceRest getInstance(){
        if(factoryServiceRest ==null) factoryServiceRest = new FactoryServiceRest();
        return factoryServiceRest;
    }
    public static IServiceRest getService(String rest){
        if(rest.equalsIgnoreCase("rest")) return ServiceRest.getInstance();
        else return null;
    }



}

package com.factorydecorator.factory;

import com.factorydecorator.inter.AbstractFactory;
import com.factorydecorator.inter.IConecttion;
import com.factorydecorator.imp.ConnectionSql;
import com.factorydecorator.inter.IFactoryRestService;

public class FactoryRestService extends AbstractFactory implements IFactoryRestService {
    private static FactoryRestService factoryRestService;

    private FactoryRestService(){}

    @Override
    public IConecttion getService(String service){
        if(service.equalsIgnoreCase("rest")) return ConnectionSql.getInstance();
        else return null;
    }

    public static AbstractFactory getAbstractFactory() {
        if(factoryRestService==null) factoryRestService = new FactoryRestService();
        return factoryRestService;
    }


}

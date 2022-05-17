package com.abstractfactorydecorator;

import com.abstractfactorydecorator.imp.DecoratedServiceRest;
import com.abstractfactorydecorator.interf.IService;
import com.abstractfactorydecorator.imp.factory.FactoryConnection;
import com.abstractfactorydecorator.imp.factory.FactoryService;
import com.abstractfactorydecorator.imp.factory.MainFactory;

public class app {
    public static void main(String[] args) {
        ((FactoryConnection) MainFactory.getFactory("CONNECTIONS")).getConnection("SQL").connect();


        ((FactoryConnection) MainFactory.getFactory("CONNECTIONS")).getConnection("MONGODB").connect();

        ((FactoryService) MainFactory.getFactory("SERVICES")).getService("REST").callService();
        ((FactoryService) MainFactory.getFactory("SERVICES")).getService("SOAP").callService();

        IService service = new DecoratedServiceRest(
                (IService) ((FactoryService) MainFactory.getFactory("SERVICES")).getService("REST")
        );

        service.callService();
    }
}

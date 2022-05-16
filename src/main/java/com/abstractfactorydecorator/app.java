package com.abstractfactorydecorator;

import com.abstractfactory.factory.FactoryConnection;
import com.abstractfactory.factory.FactoryService;
import com.abstractfactory.factory.MainFactory;

public class app {
    public static void main(String[] args) {
        ((FactoryConnection) MainFactory.getFactory("CONNECTIONS")).getConnection("SQL").connect();
        ((FactoryConnection) MainFactory.getFactory("CONNECTIONS")).getConnection("MONGODB").connect();

        ((FactoryService) MainFactory.getFactory("SERVICES")).getService("REST").callService();
        ((FactoryService) MainFactory.getFactory("SERVICES")).getService("SOAP").callService();
    }
}

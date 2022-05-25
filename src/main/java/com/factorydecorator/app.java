package com.factorydecorator;

import com.factorydecorator.factory.FactoryRestService;
import com.factorydecorator.factory.FactorySoapService;
import com.factorydecorator.factory.MainFactory;

public class app {
    public static void main(String[] args) {
        ((FactoryRestService) MainFactory.getFactory("rest")).getService("rest").connect();
    }
}

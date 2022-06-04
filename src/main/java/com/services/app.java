package com.services;

import com.services.imp.factory.FactoryRest;
import com.services.imp.factory.MainFactory;
import com.services.imp.service.rest.decorator.DecoratedRest;

public class app {
    public static void main(String[] args) {

        //DecoratedRest.getInstance(
        //        ((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest1")
        //).parse();

        //DecoratedRest.getInstance(
        //        ((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest2")
        //).parse();
        DecoratedRest decoratedRest = new DecoratedRest(((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest1"));
        DecoratedRest decoratedRest2 = new DecoratedRest(((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest2"));
        decoratedRest.parse();
        decoratedRest2.parse();

        //((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest1").call();
        //((FactoryRest) MainFactory.getFactory("rest")).getRestService("rest2").call();
    }
}

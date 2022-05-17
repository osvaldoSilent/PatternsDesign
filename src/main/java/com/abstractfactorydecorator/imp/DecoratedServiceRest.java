package com.abstractfactorydecorator.imp;

import com.abstractfactorydecorator.interf.AbstractDecorator;
import com.abstractfactorydecorator.interf.IService;

public class DecoratedServiceRest extends AbstractDecorator{
    private static IService decoratedServiceRest;

    public DecoratedServiceRest(IService service){
        super(service);
    }

    @Override
    public IService getDecoratedService(IService service) {
        if(decoratedServiceRest==null)
            decoratedServiceRest=new DecoratedServiceRest(service);
        return decoratedServiceRest;
    }

    @Override
    public void callService() {
        parser();
        System.out.println("Calling service");
    }

    private static void parser() {
        System.out.println("parsing service");
    }

    public static IService getService(IService service){
        if(decoratedServiceRest==null)
            decoratedServiceRest=new DecoratedServiceRest(service);
        return decoratedServiceRest;
    }
}

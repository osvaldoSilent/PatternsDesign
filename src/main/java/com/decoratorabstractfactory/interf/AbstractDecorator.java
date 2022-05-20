package com.decoratorabstractfactory.interf;

public abstract class AbstractDecorator{
    public static IService service=null;
    public AbstractDecorator(IService service){
        this.service=service;
    }
    public static IService getDecoratedService(){
        return service;
    }
}

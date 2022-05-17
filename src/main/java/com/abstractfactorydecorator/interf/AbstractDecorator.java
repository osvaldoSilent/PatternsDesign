package com.abstractfactorydecorator.interf;

public abstract class AbstractDecorator implements IService{
    IService abstractDecorator;
    public AbstractDecorator(IService service){
        abstractDecorator= service;
    }
    public abstract IService getDecoratedService(IService service);

    public abstract void callService();
}

package com.abstractfactorydecorator.interf;

public abstract class AbstractDecorator {
    public abstract IService getDecoratedService(IService service);
}

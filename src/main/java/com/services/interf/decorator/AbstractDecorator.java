package com.services.interf.decorator;

import com.services.interf.IRest;

public abstract class AbstractDecorator {
    IRest decoratedRest;
    public AbstractDecorator(IRest decoratedRest){
        this.decoratedRest = decoratedRest;
    }
    protected abstract void parse();

}

package com.services.imp.service.rest.decorator;

import com.patterdesign.imp.decorator.DecoratorRest;
import com.services.interf.IRest;
import com.services.interf.decorator.AbstractDecorator;

public class DecoratedRest extends AbstractDecorator {
    private IRest rest;
    private DecoratedRest decoratedRest;

    public DecoratedRest(IRest decoratedRest) {
        super(decoratedRest);
        this.rest = decoratedRest;
    }

    //public static DecoratedRest getInstance(IRest rest){
    //    if (decoratedRest == null) decoratedRest = new DecoratedRest(rest);
    //    return decoratedRest;
    //}

    @Override
    public void parse() {
        System.out.println("parsing data");
        rest.call();
    }
}

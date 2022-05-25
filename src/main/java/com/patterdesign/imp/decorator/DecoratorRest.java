package com.patterdesign.imp.decorator;

import com.patterdesign.interfa.AbstractDecorator;
import com.patterdesign.interfa.IServiceRest;

public class DecoratorRest extends AbstractDecorator {
    private static DecoratorRest decoratorRest;
    private static IServiceRest iServiceRest;
    private DecoratorRest(IServiceRest iServiceRest){
        super(iServiceRest);
        this.iServiceRest=iServiceRest;
    }

    public static DecoratorRest getInstance(IServiceRest serviceRest){
        if(decoratorRest==null) decoratorRest = new DecoratorRest(serviceRest);
        return decoratorRest;
    }

    @Override
    public void parse() {
        System.out.println("parsing data before call");
        callService();
    }

    @Override
    public void callService() {
        iServiceRest.callService();
    }
}

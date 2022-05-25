package com.patterdesign.interfa;

import com.patterdesign.imp.ServiceRest;

public abstract class AbstractDecorator implements IServiceRest{
    private static IServiceRest serviceRest;

    public AbstractDecorator(IServiceRest serviceRest){
        this.serviceRest = serviceRest;
    }
    protected abstract void parse();

}

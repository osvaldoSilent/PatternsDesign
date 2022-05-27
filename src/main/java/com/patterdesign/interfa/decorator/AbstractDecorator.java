package com.patterdesign.interfa.decorator;

import com.patterdesign.imp.ServiceRest;
import com.patterdesign.interfa.IServiceRest;

public abstract class AbstractDecorator implements IServiceRest {
    private static IServiceRest serviceRest;

    public AbstractDecorator(IServiceRest serviceRest){
        this.serviceRest = serviceRest;
    }
    protected abstract void parse();

}

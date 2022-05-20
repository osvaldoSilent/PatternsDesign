package com.decoratorabstractfactory.imp;


import com.decoratorabstractfactory.interf.AbstractDecorator;
import com.decoratorabstractfactory.interf.IService;

public class DecoratedService extends AbstractDecorator implements IService {
    public DecoratedService(IService service) {
        super(service);
    }

    public void connect(){
        System.out.println("parsing data");
        System.out.println("calling Rest");
    }
}

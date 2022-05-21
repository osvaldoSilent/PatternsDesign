package com.decoratorabstractfactory;

import com.decoratorabstractfactory.imp.DecoratedService;
import com.decoratorabstractfactory.imp.factory.FactoryService;
import com.decoratorabstractfactory.imp.factory.MainFactory;
import com.decoratorabstractfactory.interf.IService;

public class app {
    public static void main(String[] args) {
        new DecoratedService(
                (IService) ((FactoryService) MainFactory.getFactory("service")).getService("rest")
        ).connect();
    }
}

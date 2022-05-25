package com.patterdesign;

import com.patterdesign.imp.ServiceRest;
import com.patterdesign.imp.decorator.DecoratorRest;
import com.patterdesign.imp.factory.FactoryMain;
import com.patterdesign.imp.factory.FactoryServiceRest;
import com.patterdesign.interfa.IServiceRest;

public class app {
    public static void main(String[] args) {

        DecoratorRest.getInstance(
                (((FactoryServiceRest) FactoryMain.getFactory("rest")).getService("rest"))
        ).parse();

    }
}

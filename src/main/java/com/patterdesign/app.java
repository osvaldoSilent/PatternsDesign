package com.patterdesign;

import com.patterdesign.imp.ServiceRest;
import com.patterdesign.imp.factory.FactoryMain;
import com.patterdesign.imp.factory.FactoryServiceRest;

public class app {
    public static void main(String[] args) {
        ((FactoryServiceRest) FactoryMain.getFactory("rest")).getService("rest").callService();
    }
}

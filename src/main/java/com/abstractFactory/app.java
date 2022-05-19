package com.abstractFactory;

import com.abstractFactory.imp.factory.MainFactory;
import com.abstractFactory.imp.factory.ServiceFactory;

public class app {
    public static void main(String[] args) {
        ((ServiceFactory) MainFactory.getFactory("Service")).getService("rest").callService();
    }
}

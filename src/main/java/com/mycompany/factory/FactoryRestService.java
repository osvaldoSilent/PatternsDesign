package com.mycompany.factory;

import com.mycompany.interf.IFactory;
import com.mycompany.interf.IRestService;
import com.mycompany.service.RestServiceEx;
import com.mycompany.service.RestServiceEx2;

public class FactoryRestService extends IFactory {
    private static FactoryRestService factoryRestService;
    private FactoryRestService(){

    }

    public static IFactory getFactory() {
        if (factoryRestService==null) factoryRestService=new FactoryRestService();
        return factoryRestService;
    }
    public IRestService getRestService(String service){
        if(service.equalsIgnoreCase("RESTExample")) return RestServiceEx.getInstance();
        if(service.equalsIgnoreCase("RESTExample2")) return RestServiceEx2.getInstance();
        else return null;
    }


}

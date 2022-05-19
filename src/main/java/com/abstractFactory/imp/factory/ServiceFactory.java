package com.abstractFactory.imp.factory;

import com.abstractFactory.imp.RestService;
import com.abstractFactory.imp.SoapService;
import com.abstractFactory.interf.AbstractFactory;
import com.abstractFactory.interf.IFactoryService;
import com.abstractFactory.interf.IService;

public class ServiceFactory extends AbstractFactory implements IFactoryService {

    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}
    public static  ServiceFactory getFactory(){
        if(serviceFactory==null){
            serviceFactory=new ServiceFactory();
        }
        return serviceFactory;
    }
    @Override
    public IService getService(String service) {
        if(service.equalsIgnoreCase("rest")) return RestService.getInstance();
        else if(service.equalsIgnoreCase("soap")) return SoapService.getInstance();
        else return null;
    }


}

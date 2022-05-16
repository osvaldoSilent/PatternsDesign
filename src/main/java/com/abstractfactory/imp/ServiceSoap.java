package com.abstractfactory.imp;

import com.abstractfactory.interf.IService;

public class ServiceSoap implements IService {
    private static ServiceSoap serviceSoap;
    private ServiceSoap(){}
    public static ServiceSoap getInstance(){
        if(serviceSoap==null) serviceSoap= new ServiceSoap();
        return serviceSoap;
    }

    @Override
    public void callService() {
        System.out.println("Calling SOAP service");
    }
}

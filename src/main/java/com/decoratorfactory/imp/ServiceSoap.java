package com.decoratorfactory.imp;

import com.decoratorfactory.interfa.IServiceSoap;

public class ServiceSoap implements IServiceSoap {

    private static ServiceSoap serviceSoap;
    private ServiceSoap(){}
    public static ServiceSoap getInstance(){
        if(serviceSoap==null) serviceSoap = new ServiceSoap();
        return serviceSoap;
    }
    @Override
    public void call() {
        System.out.println("Soap called");
    }
}

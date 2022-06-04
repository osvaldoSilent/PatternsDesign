package com.services.imp.service.soap;

import com.services.interf.ISoap;

public class ServiceSoap1 implements ISoap {
    private static ServiceSoap1 serviceSoap1;
    private ServiceSoap1(){}
    public static ServiceSoap1 getInstance(){
        if(serviceSoap1 == null) serviceSoap1 = new ServiceSoap1();
        return serviceSoap1;
    }
    @Override
    public void call() {
        System.out.println("Soap Called");
    }
}

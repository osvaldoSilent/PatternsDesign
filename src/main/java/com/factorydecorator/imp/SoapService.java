package com.factorydecorator.imp;

import com.factorydecorator.inter.IService;

public class SoapService implements IService {
    private static SoapService soapService;
    private SoapService(){}
    public static SoapService getInstance(){
        if(soapService==null) soapService = new SoapService();
        return soapService;
    }


    @Override
    public void callService() {
        System.out.println("Soap service called");
    }
}

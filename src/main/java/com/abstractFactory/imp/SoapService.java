package com.abstractFactory.imp;

import com.abstractFactory.interf.IService;

public class SoapService implements IService {
    private static IService soapService;
    private SoapService(){}
    public static IService getInstance(){
        if(soapService==null){
            soapService=new SoapService();
        }
        return soapService;
    }
    @Override
    public void callService() {
        System.out.println("calling SOAP service");
    }
}

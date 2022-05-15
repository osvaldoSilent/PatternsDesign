package com.mycompany.service;

import com.mycompany.interf.ISoapService;

public class SoapServiceEx implements ISoapService {

    private static SoapServiceEx soapServiceEx;
    private SoapServiceEx(){
    }

    public static SoapServiceEx getInstance(){
        if (soapServiceEx==null) soapServiceEx=new SoapServiceEx();
        return soapServiceEx;
    }

    @Override
    public void connect() {
        System.out.println("SOAP service example 1 connected");
    }

    @Override
    public void disconnect() {
        System.out.println("SOAP service example 1 disconnected");
    }
}

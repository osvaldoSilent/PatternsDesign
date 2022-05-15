package com.mycompany.service;

import com.mycompany.interf.ISoapService;

public class SoapServiceEx2 implements ISoapService {
    private static SoapServiceEx2 soapServiceEx2;
    private SoapServiceEx2(){
    }

    public static SoapServiceEx2 getInstance(){
        if (soapServiceEx2==null) soapServiceEx2=new SoapServiceEx2();
        return soapServiceEx2;
    }

    @Override
    public void connect() {
        System.out.println("SOAP service example 2 connected");
    }

    @Override
    public void disconnect() {
        System.out.println("SOAP service example 2 disconnected");
    }
}

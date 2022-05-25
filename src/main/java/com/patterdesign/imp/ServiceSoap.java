package com.patterdesign.imp;

import com.patterdesign.interfa.IServiceSoap;

public class ServiceSoap implements IServiceSoap {

    @Override
    public void callService() {
        System.out.println("Soap called");
    }
}

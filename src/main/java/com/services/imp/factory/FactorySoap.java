package com.services.imp.factory;

import com.services.imp.service.soap.ServiceSoap1;
import com.services.interf.ISoap;
import com.services.interf.factory.AbstractFactory;

public class FactorySoap extends AbstractFactory {
    private static FactorySoap factorySoap;
    private FactorySoap(){}
    public static FactorySoap getInstance(){
        if(factorySoap == null) factorySoap = new FactorySoap();
        return factorySoap;
    }
    public static ISoap getFactorySoap(String soapService){
        if(soapService.equalsIgnoreCase("soap1")) return ServiceSoap1.getInstance();
        return null;
    }
}

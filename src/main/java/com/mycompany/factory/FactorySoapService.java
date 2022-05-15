package com.mycompany.factory;

import com.mycompany.interf.IFactory;
import com.mycompany.interf.ISoapService;
import com.mycompany.service.SoapServiceEx;
import com.mycompany.service.SoapServiceEx2;

public class FactorySoapService extends IFactory{

    private static FactorySoapService factorySoapService;
    private FactorySoapService(){

    }

    public static IFactory getFactory() {
        if (factorySoapService==null) factorySoapService=new FactorySoapService();
        return factorySoapService;
    }
    public ISoapService getSoapService(String service){
        if(service.equalsIgnoreCase("SOAPExample"))
            return SoapServiceEx.getInstance();
        else if(service.equalsIgnoreCase("SOAPExample2"))
            return SoapServiceEx2.getInstance();
        else return null;
    }
}

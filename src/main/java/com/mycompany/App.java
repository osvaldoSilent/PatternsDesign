package com.mycompany;

import com.mycompany.factory.FactoryRestService;
import com.mycompany.factory.FactoryService;
import com.mycompany.factory.FactorySoapService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ((FactoryRestService) FactoryService.getFactory("REST")).getRestService("RESTExample").connect();
        ((FactoryRestService) FactoryService.getFactory("REST")).getRestService("RESTExample2").connect();

        ((FactorySoapService) FactoryService.getFactory("SOAP")).getSoapService("SOAPExample").connect();
        ((FactorySoapService) FactoryService.getFactory("SOAP")).getSoapService("SOAPExample2").connect();
    }
}

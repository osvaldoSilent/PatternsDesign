package com.example.factory;

import com.example.interf.IService;
import com.example.service.RestServiceEx;

public class RestServiceFactory {

    IService getRestService(String RESTService){
            if(RESTService.equalsIgnoreCase("RESTExample1")) return RestServiceEx.getInstance();
            else return null;
    }
}

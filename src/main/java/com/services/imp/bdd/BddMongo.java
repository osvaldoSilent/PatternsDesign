package com.services.imp.bdd;

import com.services.interf.IBdd;

public class BddMongo implements IBdd {
    private static BddMongo bddMongo;
    private BddMongo(){}
    public static BddMongo getInstance(){
        if(bddMongo==null) bddMongo = new BddMongo();
        return bddMongo;
    }
    @Override
    public void connect() {
        System.out.println("mongo connected");
    }
}

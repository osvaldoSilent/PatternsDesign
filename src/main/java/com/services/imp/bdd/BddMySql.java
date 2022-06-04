package com.services.imp.bdd;

import com.services.interf.IBdd;

public class BddMySql implements IBdd {
    private static BddMySql bddMySql;
    private BddMySql(){}
    public static BddMySql getInstance(){
        if(bddMySql == null) bddMySql = new BddMySql();
        return bddMySql;
    }

    @Override
    public void connect() {
        System.out.println("MySql Connected");
    }
}

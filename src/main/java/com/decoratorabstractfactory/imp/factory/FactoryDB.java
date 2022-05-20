package com.decoratorabstractfactory.imp.factory;

import com.decoratorabstractfactory.imp.MySql;
import com.decoratorabstractfactory.interf.AbstractFactory;
import com.decoratorabstractfactory.interf.IDB;

public class FactoryDB extends AbstractFactory {
    private static FactoryDB factoryDB;
    private FactoryDB(){}
    public static FactoryDB getInstance(){
        if(factoryDB==null) factoryDB = new FactoryDB();
        return factoryDB;
    }

    public static IDB getDataBase(String db){
        if(db.equalsIgnoreCase("mysql")) return MySql.getInstance();
        else return null;
    }

    public static AbstractFactory getFactory(){
        return FactoryDB.getInstance();
    }

}

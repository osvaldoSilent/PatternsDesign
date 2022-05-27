package com.decoratorfactory.imp.factory;

import com.decoratorfactory.imp.DBMysql;
import com.decoratorfactory.interfa.IDBMysql;
import com.decoratorfactory.interfa.factory.IFactory;

public class FactoryDBMysql implements IFactory{
    private static FactoryDBMysql factoryDBMysql;
    private FactoryDBMysql(){}
    public static FactoryDBMysql getInstance(){
        if(factoryDBMysql==null) factoryDBMysql = new FactoryDBMysql();
        return factoryDBMysql;
    }

    public static IDBMysql getDB(String service){
        if(service.equalsIgnoreCase("mysql")) return DBMysql.getInstance();
        return null;
    }
}

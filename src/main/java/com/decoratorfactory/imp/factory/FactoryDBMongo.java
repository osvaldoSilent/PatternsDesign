package com.decoratorfactory.imp.factory;

import com.decoratorfactory.imp.DBMongo;
import com.decoratorfactory.interfa.IDBMongo;
import com.decoratorfactory.interfa.factory.IFactory;

public class FactoryDBMongo implements IFactory {
    private static FactoryDBMongo factoryDBMongo;
    private FactoryDBMongo(){}
    public static FactoryDBMongo getInstance(){
        if(factoryDBMongo==null) factoryDBMongo = new FactoryDBMongo();
        return factoryDBMongo;
    }

    public static IDBMongo getDB(String db){
        if(db.equalsIgnoreCase("mongo")) return DBMongo.getInstance();
        return null;
    }
}

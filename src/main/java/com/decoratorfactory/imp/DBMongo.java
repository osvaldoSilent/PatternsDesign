package com.decoratorfactory.imp;

import com.decoratorfactory.interfa.IDBMongo;

public class DBMongo implements IDBMongo {
    private static DBMongo dbMongo;
    private DBMongo(){}
    public static DBMongo getInstance(){
        if(dbMongo==null)dbMongo= new DBMongo();
        return dbMongo;
    }
    @Override
    public void connect() {
        System.out.println("DBMongo connected");
    }
}

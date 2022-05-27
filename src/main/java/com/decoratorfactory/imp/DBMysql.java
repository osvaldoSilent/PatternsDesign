package com.decoratorfactory.imp;

import com.decoratorfactory.interfa.IDBMysql;

public class DBMysql implements IDBMysql {
    private static DBMysql dbMysql;
    private DBMysql(){}
    public static DBMysql getInstance(){
        if(dbMysql==null)dbMysql=new DBMysql();
        return dbMysql;
    }
    @Override
    public void connect() {
        System.out.println("DBMysql connected");
    }
}

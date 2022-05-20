package com.decoratorabstractfactory.imp;

import com.decoratorabstractfactory.interf.IDB;

public class MySql implements IDB {
    private static MySql mySql;
    private MySql(){}
    public static MySql getInstance(){
        if (mySql==null)mySql=new MySql();
        return mySql;
    }
    @Override
    public void connect() {
        System.out.println("MwSql Connected");
    }
}

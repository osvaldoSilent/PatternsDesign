package com.abstractFactory.imp;

import com.abstractFactory.interf.IDataBase;

public class MySql implements IDataBase {

    private static IDataBase mySqlConnector;
    private MySql(){}
    public static IDataBase getInstance(){
        if(mySqlConnector==null){
            mySqlConnector=new MySql();
        }
        return mySqlConnector;
    }
    @Override
    public void connect() {
        System.out.println("Connecting MySql");
    }
}

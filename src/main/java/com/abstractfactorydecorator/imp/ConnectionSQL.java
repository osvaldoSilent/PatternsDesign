package com.abstractfactorydecorator.imp;

import com.abstractfactory.interf.IConnection;

public class ConnectionSQL implements IConnection {
    private static ConnectionSQL connection;
    private ConnectionSQL(){}

    public static ConnectionSQL getInstance(){
        if(connection==null){
            connection = new ConnectionSQL();
        }
        return connection;
    }
    @Override
    public void connect(){
        System.out.println("SQL connected");
    }

}

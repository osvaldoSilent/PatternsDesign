package com.abstractfactory.imp;

import com.abstractfactory.interf.IConnection;

public class ConnectionMongoDB implements IConnection {
    private static ConnectionMongoDB connection;

    private ConnectionMongoDB(){}

    public static ConnectionMongoDB getInstance(){
        if(connection==null){
            connection = new ConnectionMongoDB();
        }
        return connection;
    }
    @Override
    public void connect(){
        System.out.println("MongoDB Connected");
    }
}
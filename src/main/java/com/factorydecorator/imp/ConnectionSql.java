package com.factorydecorator.imp;

import com.factorydecorator.imp.ConnectionSql;
import com.factorydecorator.inter.IConecttion;

public class ConnectionSql implements IConecttion {

    private static ConnectionSql connection;

    private ConnectionSql(){}

    public static ConnectionSql getInstance(){
        if(connection==null) connection = new ConnectionSql();
        return connection;
    }

    @Override
    public void connect(){
        System.out.println("Sql connected");
    }
}

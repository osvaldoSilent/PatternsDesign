package com.abstractfactory.factory;

import com.abstractfactory.imp.ConnectionMongoDB;
import com.abstractfactory.imp.ConnectionSQL;
import com.abstractfactory.interf.AbstractFactory;
import com.abstractfactory.interf.IConnection;

public class FactoryConnection extends AbstractFactory {
    private static FactoryConnection factoryConnection;
    private FactoryConnection(){}
    public static IConnection getConnection(String motor){
        if(motor.equalsIgnoreCase("MONGODB")) return ConnectionMongoDB.getInstance();
        else if (motor.equalsIgnoreCase("SQL")) return ConnectionSQL.getInstance();
        else return null;
    }
    @Override
    public AbstractFactory getAbstractFactory(){
        if(factoryConnection==null)factoryConnection=new FactoryConnection();
        return factoryConnection;
    }
    public static AbstractFactory getFactory(){
        if(factoryConnection==null)factoryConnection=new FactoryConnection();
        return factoryConnection;
    }
}

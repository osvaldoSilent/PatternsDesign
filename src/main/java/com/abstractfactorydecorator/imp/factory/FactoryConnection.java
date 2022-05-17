package com.abstractfactorydecorator.imp.factory;

import com.abstractfactorydecorator.imp.ConnectionMongoDB;
import com.abstractfactorydecorator.imp.ConnectionSQL;
import com.abstractfactorydecorator.interf.AbstractFactory;
import com.abstractfactorydecorator.interf.IConnection;

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

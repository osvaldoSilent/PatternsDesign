package com.decoratorfactory.imp.factory;

import com.decoratorfactory.interfa.factory.AbstractFactory;
import com.decoratorfactory.interfa.factory.IFactory;

public class MainFactory extends AbstractFactory {
    public static IFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("mysql")) return FactoryDBMysql.getInstance();
        else if (factory.equalsIgnoreCase("mongo")) return FactoryDBMongo.getInstance();
        return null;
    }
}

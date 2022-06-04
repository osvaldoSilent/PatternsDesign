package com.services.imp.factory;

import com.services.imp.bdd.BddMongo;
import com.services.imp.bdd.BddMySql;
import com.services.interf.IBdd;
import com.services.interf.factory.AbstractFactory;

public class FactoryBddMongo extends AbstractFactory {
    private static FactoryBddMongo factoryBddMongo;
    private FactoryBddMongo(){}
    public static FactoryBddMongo getInstance(){
        if(factoryBddMongo == null) factoryBddMongo = new FactoryBddMongo();
        return factoryBddMongo;
    }
    public static IBdd getBdd(String bdd){
        if(bdd.equalsIgnoreCase("mongo")) BddMongo.getInstance();
        else if (bdd.equalsIgnoreCase("mysql")) BddMySql.getInstance();
        return null;
    }
}

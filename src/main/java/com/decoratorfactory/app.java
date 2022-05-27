package com.decoratorfactory;

import com.decoratorfactory.imp.decorator.DBMysqlDecorated;
import com.decoratorfactory.imp.factory.FactoryDBMongo;
import com.decoratorfactory.imp.factory.FactoryDBMysql;
import com.decoratorfactory.imp.factory.MainFactory;

public class app {
    public static void main(String[] args) {
        ((FactoryDBMysql) MainFactory.getFactory("mysql")).getDB("mysql").connect();
        ((FactoryDBMongo) MainFactory.getFactory("mongo")).getDB("mongo").connect();

        DBMysqlDecorated.getInstance(
                ((FactoryDBMysql) MainFactory.getFactory("mysql")).getDB("mysql")
        ).parse();
    }
}

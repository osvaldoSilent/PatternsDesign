package com.decoratorfactory.imp.decorator;

import com.decoratorfactory.imp.DBMysql;
import com.decoratorfactory.interfa.IDBMysql;
import com.decoratorfactory.interfa.decorator.AbstractDecoratorMysql;

public class DBMysqlDecorated extends AbstractDecoratorMysql {

    IDBMysql localIDBMysql;
    private static DBMysqlDecorated dbMysqlDecorated;

    private DBMysqlDecorated(IDBMysql idbMysql){
        super(idbMysql);
        this.localIDBMysql = idbMysql;
    }

    public static DBMysqlDecorated getInstance(IDBMysql dbMysql){
        if(dbMysqlDecorated == null) dbMysqlDecorated = new DBMysqlDecorated(dbMysql);
        return dbMysqlDecorated;
    }

    @Override
    public void parse() {
        System.out.println("Parsing data");
        localIDBMysql.connect();
    }
}

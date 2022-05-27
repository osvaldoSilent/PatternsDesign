package com.decoratorfactory.interfa.decorator;

import com.decoratorfactory.interfa.IDBMysql;

public abstract class AbstractDecoratorMysql {
    IDBMysql idbMysql;
    public AbstractDecoratorMysql(IDBMysql idbMysql){
        this.idbMysql = idbMysql;
    }
    public abstract void parse();
}

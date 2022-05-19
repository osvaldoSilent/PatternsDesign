package com.abstractFactory.imp.factory;

import com.abstractFactory.imp.MySql;
import com.abstractFactory.interf.IDataBase;
import com.abstractFactory.interf.AbstractFactory;
import com.abstractFactory.interf.IFactoryDataBase;

public class DataBaseFactory  extends AbstractFactory implements IFactoryDataBase{

    private static DataBaseFactory dataBaseFactory;

    private DataBaseFactory(){}
    public static DataBaseFactory getFactory(){
        if(dataBaseFactory==null){
            dataBaseFactory=new DataBaseFactory();
        }
        return dataBaseFactory;
    }
    @Override
    public IDataBase getDataBaseConnector(String dataBase) {
        if(dataBase.equalsIgnoreCase("mysql")) return MySql.getInstance();
        else return null;
    }
}

package com.abstractFactory.interf;

public interface IFactoryDataBase {
    IDataBase getDataBaseConnector(String dataBase);
}

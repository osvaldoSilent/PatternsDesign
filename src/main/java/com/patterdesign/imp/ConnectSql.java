package com.patterdesign.imp;

import com.patterdesign.interfa.IConnectionSql;

public class ConnectSql implements IConnectionSql {

    @Override
    public void connect() {
        System.out.println("SQL connected");
    }
}

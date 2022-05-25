package com.patterdesign.imp;

import com.patterdesign.interfa.IConnectionPostgress;

public class ConnectPostgress implements IConnectionPostgress {
    @Override
    public void connect() {
        System.out.println("Postgress connected");
    }
}

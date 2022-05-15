package com.example;

import com.example.factory.FactoryServiceProducer;

public class app {
    public static void main(String[] args) {
        FactoryServiceProducer.getFactory("REST").getService().connect();
    }
}

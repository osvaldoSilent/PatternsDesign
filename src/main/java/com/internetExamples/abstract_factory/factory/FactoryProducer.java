package com.internetExamples.abstract_factory.factory;

public class FactoryProducer {
    public AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("rounded")) return new RoundedFactory();
        else if(factory.equalsIgnoreCase("rect")) return new RectFactory();
        return null;
    }
}

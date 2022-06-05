package com.internetExamples.abstract_factory;

import com.internetExamples.abstract_factory.factory.FactoryProducer;
import com.internetExamples.abstract_factory.factory.RectFactory;

public class app {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();
        factoryProducer.getFactory("rect").getShape("square").draw();
        factoryProducer.getFactory("rounded").getShape("circle").draw();

    }
}

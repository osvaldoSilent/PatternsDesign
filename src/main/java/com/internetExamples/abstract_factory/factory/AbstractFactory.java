package com.internetExamples.abstract_factory.factory;

import com.internetExamples.abstract_factory.interfa.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
}

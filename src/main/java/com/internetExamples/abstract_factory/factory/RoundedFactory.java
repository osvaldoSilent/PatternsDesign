package com.internetExamples.abstract_factory.factory;


import com.internetExamples.abstract_factory.imp.Circle;
import com.internetExamples.abstract_factory.interfa.Shape;

public class RoundedFactory extends AbstractFactory{
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("circle")) return (Shape) new Circle();
        return null;
    }
}

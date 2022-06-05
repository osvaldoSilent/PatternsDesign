package com.internetExamples.abstract_factory.factory;


import com.internetExamples.abstract_factory.imp.Square;
import com.internetExamples.abstract_factory.interfa.Shape;

public class RectFactory extends AbstractFactory{

    Shape shape=null;
    @Override
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("square")) return this.shape= new Square();
        return this.shape;
    }
}

package com.internetExamples.factory.factory;

import com.internetExamples.factory.imp.Circle;
import com.internetExamples.factory.imp.Square;
import com.internetExamples.factory.interf.Shape;

public class ShapeFactory {
    Shape shape;
    public Shape getShape(String shape){
        if(shape.equalsIgnoreCase("square")) this.shape = new Square();
        else if(shape.equalsIgnoreCase("circle")) this.shape = new Circle();
        return this.shape;
    }
}

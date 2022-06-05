package com.internetExamples.factory;

import com.internetExamples.factory.factory.ShapeFactory;

public class app {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getShape("square").draw();
    }
}

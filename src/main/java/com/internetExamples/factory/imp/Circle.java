package com.internetExamples.factory.imp;

import com.internetExamples.factory.interf.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}

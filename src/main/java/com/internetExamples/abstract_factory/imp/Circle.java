package com.internetExamples.abstract_factory.imp;


import com.internetExamples.abstract_factory.interfa.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle draw");
    }
}

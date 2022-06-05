package com.internetExamples.abstract_factory.imp;

import com.internetExamples.abstract_factory.interfa.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("square draw");
    }
}

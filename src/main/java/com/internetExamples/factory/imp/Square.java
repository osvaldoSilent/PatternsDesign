package com.internetExamples.factory.imp;

import com.internetExamples.factory.interf.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("square draw");
    }
}

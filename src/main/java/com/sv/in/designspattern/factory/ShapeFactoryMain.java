package com.sv.in.designspattern.factory;

public class ShapeFactoryMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape circle=shapeFactory.creteShape("Circle");
        circle.draw();
        Shape rectangle=shapeFactory.creteShape("Rectangle");
        rectangle.draw();
    }
}

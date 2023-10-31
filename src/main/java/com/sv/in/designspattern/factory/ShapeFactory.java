package com.sv.in.designspattern.factory;

public class ShapeFactory {
    public Shape creteShape(String shapeType){
         if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
         }
         else if(shapeType.equalsIgnoreCase("Rectangle")){
             return new Rectangle();
         }else {
             throw new IllegalArgumentException("Invalid Shape type: "+ shapeType);
         }
    }
}

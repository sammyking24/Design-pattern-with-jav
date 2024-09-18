package code.solidclass;

import code.sammy.baseinterface.Shape;

public class ShapeDecorator implements Shape {

//    this is the main class
//    it allows us not to create the concrate classes it allows us to add dynamic property to those 3 shape
//    to implement the wrapper, this approach uses abstract classes or interface with composition

    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){

        this.decoratedShape = decoratedShape;
    }
    @Override
    public void draw() {

        decoratedShape.draw();

    }
}

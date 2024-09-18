package code.solidclass;

import code.sammy.baseinterface.Shape;

public class GreenShapeDecorator extends ShapeDecorator {
    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setGreenBorder(decoratedShape);

    }
    private void setGreenBorder(Shape decoratedShape){
        System.out.println("Border Color: Green");
    }
}

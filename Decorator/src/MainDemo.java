import code.sammy.baseinterface.Shape;
import code.solidclass.*;

public class MainDemo {
    public static void main(String[] args) {

        Shape circle =  new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape greenCircle = new GreenShapeDecorator(new Circle());
        System.out.println("\nCircle of green border");
        greenCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();

        Shape redTriangle = new RedShapeDecorator(new Triangle());
        System.out.println("\nTriangle of red border");
        redTriangle.draw();

        Shape mixTriangle = new RedShapeDecorator(
                new GreenShapeDecorator(new Triangle()));
        System.out.println("\nTriangle of mix border");
        mixTriangle.draw();

    }
}


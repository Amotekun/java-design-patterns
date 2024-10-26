package creationdesignpattern.factormethod.static_method;

public class StaticMethodsApp {
    public static void run() {
        System.out.println("===== Factor Method Pattern (Static Methods) =====\n");

        Circle circle = ShapeFactory.createCircle();
        circle.draw();

        Rectangle rectangle = ShapeFactory.createRectangle();
        rectangle.draw();
    }
}

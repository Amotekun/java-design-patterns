package creationdesignpattern.factormethod.static_method;

public class ShapeFactory {
    public static Circle createCircle() {
        return new Circle();
    }

    public static Rectangle createRectangle() {
        return new Rectangle();
    }
}

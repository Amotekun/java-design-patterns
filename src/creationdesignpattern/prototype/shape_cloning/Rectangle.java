package creationdesignpattern.prototype.shape_cloning;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Drawing a rectangle...");
    }

}

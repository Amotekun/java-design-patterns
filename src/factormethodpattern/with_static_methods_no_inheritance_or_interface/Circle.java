package factormethodpattern.with_static_methods_no_inheritance_or_interface;

public class Circle {
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
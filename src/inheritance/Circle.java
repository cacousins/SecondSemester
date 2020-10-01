package inheritance;

/**
 *
 * @author cacousins
 */
public class Circle {

    //private instance variables
    private double radius;
    private String color;

    //no argument constructor
    public Circle() {
    radius = 1.0;
    color = "red";
    
    }

    //single argument constructor
    public Circle(double radius) {
        this.radius = radius;
        color = "red";

    }

    //two argument constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

}

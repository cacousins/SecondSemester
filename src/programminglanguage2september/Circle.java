package programminglanguage2september;

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
    public Circle(double r) {
        this.radius = r;
        color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }
    
    public double getRadius(){
        return radius;
    }
    
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return Math.PI * radius * radius;
    }
    

}

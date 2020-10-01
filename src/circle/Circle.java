/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circle;

/**
 *
 * @author cacousins
 */
public class Circle {
double radius = 1.0;
    private String color = "red";
    
    // No arg constructor
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    // Single argument constructor
    public Circle(double r){
        radius = r;
        color = "red";
    }
    
    // Double argument constructor
    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    
    public double getRadius(){
    return radius;
    
    }
    
    public String getColor(){
        return color;
    }
    
    public double getArea(){
        return (Math.PI * radius * radius);
    }

 

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }

 

    public void setRadius(double radius) {
        this.radius = radius;
    }

 

    public void setColor(String color) {
        this.color = color;
    }
    
    
}

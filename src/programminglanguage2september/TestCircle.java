/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programminglanguage2september;

/**
 *
 * @author cacousins
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is : " + c1.getRadius());
        System.out.println("The color is : " + c1.getColor());
        System.out.printf("The area is : %.2f%n", c1.getArea());
        
    }

}

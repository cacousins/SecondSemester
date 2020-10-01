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
public class Cylinder extends Circle {

    private double height;

    //No argument constructor
    public Cylinder() {
        super();
        this.height =1;

    }

    // single argument constructor
    public Cylinder(double height) {
        super();
        this.height = height;
    }

    // double argument constructor
    public Cylinder(double height, double r) {
        super(r);
        this.height = height;
    }

    public Cylinder(double height, double r, String c) {
        super(r, c);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + height + '}';
    }

    public double getVolume() {
        return (Math.PI * radius * radius * height);
    }

}

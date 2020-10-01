/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractionAnimalClass;

/**
 *
 * @author cacousins
 */
public abstract class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }
    
    //getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    /*
        Method Header
    */
    
    public abstract String makeSound();
    public abstract String movement();

    @Override
    public String toString() {
        return "this is the abstract animal class";
    }
    
    
    

}

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
public class Duck extends Animal {
 private String breed;
    private String name;

    public Duck(String breed, String name) {
        super("Duck");
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    

    @Override
    public String makeSound() {
        return "quack quack";
    }

    @Override
    public String movement() {
        return "this is amoving duck";
    }

    @Override
    public String toString() {
        return "Duck{" + "breed=" + breed + ", name=" + name + '}';
    }
    
    
    
}

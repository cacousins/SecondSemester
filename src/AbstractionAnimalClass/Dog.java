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
public class Dog extends Animal {
    private String breed;
    private String name;

    public Dog(String breed, String name) {
        super("Guard Dog");
        this.breed = breed;
        this.name = name;
    }
    
    //getters and setters

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
        return "woof woof woof woof";
    }

    @Override
    public String movement() {
       return "a dog chase cat";
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + ", name=" + name + '}';
    }
    
    

}

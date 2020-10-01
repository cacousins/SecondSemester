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
public class Cat extends Animal {
     private String breed;
    private String name;

    public Cat(String breed, String name) {
        super("Cat");
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
        return "meow meow";
    }

    @Override
    public String movement() {
        return "the cat is moving";
    }

    @Override
    public String toString() {
        return "Cat{" + "breed=" + breed + ", name=" + name + '}';
    }
    
    

}

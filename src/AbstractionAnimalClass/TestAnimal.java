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
public class TestAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        
        //Animal myDog = new Dog("Alsation","Rufus");
        Dog myDog = new Dog("Alsation","Rufus");
        Animal myCat = new Cat("American","Garfield");
        Animal myDuck = new Duck("Muscovy","Daffy Duck");
        //Dog animal = new Animal();
        
        
        Animal[] macDonaldFarm = new Animal[3];
        macDonaldFarm[0] = myDog;
        macDonaldFarm[1] = myCat;
        macDonaldFarm[2] = myDuck;
        
        for (int i = 0; i < macDonaldFarm.length; i++) {
            System.out.println(macDonaldFarm[i].makeSound());
            System.out.println(macDonaldFarm[i].movement());
            System.out.println(macDonaldFarm[i].toString());
            
        }
        
        
        
    }

}

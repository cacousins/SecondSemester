/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ArrayListExamples;

import java.util.ArrayList;

/**
 *
 * @author cacousins
 */
public class TestRemoveRange extends ArrayList<String> {
    public static void main(String[] args) {
        TestRemoveRange cities = new TestRemoveRange();
       //testing the 
      
        cities.add("Las Vegas"); //0
        cities.add("Marrakech"); //1
        cities.add("Lisbon"); //2
        cities.add("Kingston");
        cities.add("Cairo");
        cities.add("Georgetown");
        
        System.out.println("my Current List" + cities);
        System.out.println("--------------");
        cities.removeRange(0, 2); //-1
        
        System.out.println("my Current List" + cities);
        cities.clear();
        cities.ensureCapacity(5000);
        System.out.println("my Current List" + cities);
    }

}

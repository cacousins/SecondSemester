/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author cacousins
 */
public class GenericArrayListExampleOne {

    public static void main(String[] args) {
        //List<String> cities1 = new ArrayList<>();
        //ArrayList<String> cities = new ArrayList<>();
        ArrayList<String> cities = new ArrayList<>(4);
        
        cities.add("Las Vegas");
        cities.add("Marrakech");
        cities.add("Lisbon");
        cities.add("Sao Paulo");
        cities.add("Tokyo");
        cities.add("NYC");
        cities.add(2, "Cairo");
        
        System.out.println(cities);
        System.out.println("Array Size : " + cities.size());
        System.out.println("ArrayList first element: " + cities.get(0));
        System.out.println("ArrayList first element: " +
                cities.get(cities.size()-1));
        //removing elements
        System.out.println("Removing an element : " + cities.remove(0));
        System.out.println("Removing an element : " + cities.remove("Mexico"));
        
        //check if the list is empty
        System.out.println("Is the ArrayList empty ? " + cities.isEmpty());
        
        //replace an element
        System.out.println("Replacing : " + cities.set(5, "Georgetown"));
        System.out.println(cities);
        
        /*for(String city: cities){
        System.out.println(city);
        }*/
        
        Collections.sort(cities);
          System.out.println(cities);
        
        
        
        
        

    }

}

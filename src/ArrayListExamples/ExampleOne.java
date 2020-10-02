/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListExamples;

/**
 *
 * @author cacousins
 */
public class ExampleOne {

    public static void main(String[] args) {

        //reminder of the Array class, static/fixed in nature
        int myArray[] = new int[3];
        myArray[0] = 10;
        myArray[1] = 11;
        myArray[2] = 12;
        //myArray[3] = 13; //Array will not give runtime error
        printArray(myArray);
        
    }
//create a method to printArray
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }

}

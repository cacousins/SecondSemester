/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package StringExamples;

/**
 *
 * @author cacousins
 */
public class StringExampleOne {
    public static void main(String[] args) {
        String string = "Welcome to Java";
        String string2 = new String ("");
        
        String str1 = "Colin Anthony ";
        String str2 = "Cousins";
        String str3 = str1 + str2;
        System.out.println(str3);
        
        String str4 = str1.concat(str2);
        System.out.println(str3);
        
        System.out.println(str3.length());
        
        String str5 = "      This is the best     ";
        System.out.println(str5);
        System.out.println(str5.trim());
        System.out.println(str4.isEmpty());
    }

}

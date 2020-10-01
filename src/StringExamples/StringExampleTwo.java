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
public class StringExampleTwo {
    public static void main(String[] args) {
        /*String str1 = "COUSINS";
        String str2 = "cOUSINS";*/
        
        /*//System.out.println(str1.equalsIgnoreCase(str2));
        String str3 = "I love the love British Virgin Islands";
        String str4 = "Love";
        System.out.println(str3.contains(str4));
        System.out.println(str3.toLowerCase().contains(str4.toLowerCase()));
        System.out.println(str3.startsWith("I"));
        System.out.println(str3.endsWith("Islands"));
        System.out.println(str3.indexOf("love"));
        System.out.println(str3.lastIndexOf("love"));*/
        
        /*int num = 2;
        String string = "String";
        System.out.println(string+num);*/
        
        String str1 = "ABCDEFG";
        //DCBA
        System.out.println(str1.charAt(3));
        String temp ="";
        
        for (int i = 0; i <= str1.length() -1; i++) {            
            temp = str1.charAt(i) + temp;                       
        }
        System.out.println(temp);
        
       String str5 = "HAM1234LTON LAV1234TY STOUTT COMMUN1234TY COLLEGE"; 
       String str6 = "1234";
       String str7 = "I";
        System.out.println(str5.replace(str6, str7));
       
       
        
        
    }

}

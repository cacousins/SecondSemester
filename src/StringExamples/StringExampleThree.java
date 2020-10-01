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
public class StringExampleThree {
    public static void main(String[] args) {
        /*String string = new String ("Colin Anthony ");
        
        String newString = string.concat("Cousins");
        
        StringBuffer sb = new StringBuffer("Colin Anthony ");
        sb.append("Cousins");
        System.out.println("String : " + newString);
        System.out.println("String Buffer : " + sb);
        System.out.println(sb.reverse());*/
        
        String s1 = new String("Colin");
        String s2 = new String ("colin");
        String s3;
        s3=s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s2));
        
        
        
        
    }

}

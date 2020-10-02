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
public class NonGenericArrayList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Colin Cousins");
        al.add("Golden State Warriors");
        al.add(6);
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
    }

}

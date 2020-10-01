/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceexamplefour;

/**
 *
 * @author cacousins
 */
public interface SpecialInterface {
        void greet(String msg);  
        default void browsingApps(){
            System.out.println("This is my deafult browsing app");
        }
}

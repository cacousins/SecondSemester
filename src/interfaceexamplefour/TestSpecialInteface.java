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
public class TestSpecialInteface implements SpecialInterface {

    @Override
    public void greet(String msg) {
        System.out.println(msg);
    }
    
    public static void main(String[] args) {
        TestSpecialInteface tsi = new TestSpecialInteface();
        tsi.greet("This is my greetings");
        tsi.browsingApps();
    }

}

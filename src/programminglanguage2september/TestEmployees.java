/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package programminglanguage2september;

/**
 *
 * @author cacousins
 */
public class TestEmployees {
    public static void main(String[] args) {
        Employees ptime = new Employees(1000);
        System.out.println(ptime.bonus);
        ptime.partTime();
        
        Employees ftime = new Employees(2000);
        ftime.partTime();
        System.out.println(ftime.bonus);
        
        //bonus value in this object is 1000
        
        
    }

}

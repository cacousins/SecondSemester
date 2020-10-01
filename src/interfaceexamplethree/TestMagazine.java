/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceexamplethree;

/**
 *
 * @author cacousins
 */
public class TestMagazine implements Magazine {
    public static void main(String[] args) {
        TestMagazine tm = new TestMagazine();
        System.out.println(tm.colorPages());
        
    }

    @Override
    public boolean colorPages() {
        return true;
    }

    @Override
    public boolean currentAffairs() {
        return true;
    }

    @Override
    public boolean sportArticles() {
        return true;
    }

}

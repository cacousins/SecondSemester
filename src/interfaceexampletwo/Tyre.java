/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaceexampletwo;

/**
 *
 * @author cacousins
 */
public class Tyre implements Movable, Rollable{

    @Override
    public boolean isMovable() {
        return true;
    }

    @Override
    public boolean isRollable() {
        return true;
    }

}

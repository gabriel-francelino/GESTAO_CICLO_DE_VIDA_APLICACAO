/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class HandGun implements Weapon {

    public void load() {
        System.out.println("Loading the HandGun");
    }

    public void shoot() {
        System.out.println("Can you resist this shot?");
    }

    public void aim() {
        System.out.println("I can see you ;) ");
    }

}

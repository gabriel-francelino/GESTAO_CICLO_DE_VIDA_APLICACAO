/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class Pistol implements Weapon {

    public void load() {
        System.out.println("Loading my Pistol");
    }

    public void shoot() {
        System.out.println("Nobody resists a pistol shot");
    }

    public void aim() {
        System.out.println("You are under my eyes");
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package adapter;

/**
 * @author Rodrigo Martins Pagliares
 */

public class Rifle implements Weapon {

    public void load() {
        System.out.println("Loading my Rifle");
    }

    public void shoot() {
        System.out.println("Shooting to kill, babe !");
    }

    public void aim() {
        System.out.println("Zoooooooom");
    }


}

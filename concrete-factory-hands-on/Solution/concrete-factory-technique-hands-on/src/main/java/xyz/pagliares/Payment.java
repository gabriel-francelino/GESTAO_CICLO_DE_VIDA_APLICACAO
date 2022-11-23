/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xyz.pagliares;

/**
 *
 * @author pagliares
 */
public abstract class Payment {
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Total...: RS " + amount + "\n";
    }



    



}

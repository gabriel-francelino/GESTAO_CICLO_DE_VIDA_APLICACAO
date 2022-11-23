/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xyz.pagliares;

/**
 *
 * @author pagliares
 */
public class CheckPayment extends Payment {
    private String bank;

    public CheckPayment(double amount, String bank) {
        super(amount);
        this.bank = bank;
    }

    /**
     * @return the bank
     */
    public String getBank() {
        return bank;
    }

    @Override
    public String toString() {
        return super.toString() + "Bank...: " + this.bank;
    }


    





}

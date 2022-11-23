/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xyz.pagliares;

/**
 *
 * @author pagliares
 */
public class CreditCardPayment extends Payment {
    private String company;

    public CreditCardPayment(double amount, String company) {
        super(amount);
        this.company = company;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
         return super.toString() + "Company...: " + this.company;
    }
    

    





}

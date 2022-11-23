/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package xyz.pagliares;

/**
 *
 * @author pagliares
 */
public class PaymentFactory {
    private static Payment payment;

    public static Payment createPayment(String type, String bank, String company, double amount) {
        if (type.equals("check")) {
            payment = new CheckPayment(amount, bank);
        } else {
            payment = new CreditCardPayment(amount, company);
        }
        return payment;
    }

}

package xyz.pagliares;

public class PaymentFactory {
    public static Payment createPayment(double amount, String company, String type){
        if(type.equals("Card")){
            return new CreditCardPayment(amount, company);
        }else if (type.equals("Check")){
            return new CheckPayment(amount, company);
        }
        return null;
    }

}

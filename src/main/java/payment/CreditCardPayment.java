package payment;

import flowerstore.Flower;

import flowerstore.Flower;

public class CreditCardPayment implements Payment {
    @Override
    public boolean pay(double price){
        System.out.println("Paid " + price + " $ with CreditCard");
//        Flower = flower = new Flower();
        return true;
    }
}

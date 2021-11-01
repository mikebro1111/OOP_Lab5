package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PayPalPaymentTest {

    PayPalPayment p = new PayPalPayment();

    @Test
    void pay(){
        assertTrue(p.pay(6.0));
    }

}
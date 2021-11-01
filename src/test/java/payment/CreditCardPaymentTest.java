package payment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardPaymentTest {
    CreditCardPayment p = new CreditCardPayment();

    @Test
    void pay(){
        assertTrue(p.pay(9.0));
    }

}
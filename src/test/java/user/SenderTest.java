package user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class SenderTest {

    Sender receiver1;
    Sender receiver2;

    @BeforeEach
    void setUp(){
        receiver1 = new Sender();
        receiver2 = new Sender();
        receiver2.update("four");
    }

    @Test
    void idCheck() {
        assertEquals(1, receiver2.getInd() - receiver1.getInd());
    }

    @Test
    void statusCheck() {
        assertEquals("four", receiver2.getResult());
    }


}

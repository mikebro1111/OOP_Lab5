package delivery;

import flowerstore.Color;
import flowerstore.Flower;
import flowerstore.FlowerType;
import flowerstore.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DHLDeliveryStrategyTest {
    DHLDeliveryStrategy d;
    List<Item> todel;

    @BeforeEach
    void setUp() {
        d = new DHLDeliveryStrategy();
        todel = new ArrayList<>();
        Flower flower = new Flower(FlowerType.CHAMOMILE, Color.White);
        todel.add(flower);

    }

    @Test
    void deliver(){
        assertTrue(d.deliver(todel));
    }
}
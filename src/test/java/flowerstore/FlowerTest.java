package flowerstore;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower_c;
    private Flower flower_r;
    private Flower flower_t;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        flower_c = new Flower(FlowerType.CHAMOMILE, Color.Red);
        flower_r = new Flower(FlowerType.ROSE, Color.Blue);
        flower_t = new Flower(FlowerType.TULIP, Color.Green);
        flower_c.setPrice(10);
        flower_r.setPrice(15);
        flower_t.setPrice(20);
        flower_c.setSepalLength(11);
        flower_r.setSepalLength(12);
        flower_t.setSepalLength(13);



    }

    @org.junit.jupiter.api.Test
    void getPrice() {
        assertEquals(10, flower_c.getPrice());
        assertEquals(15, flower_r.getPrice());
        assertEquals(20, flower_t.getPrice());
    }
    @org.junit.jupiter.api.Test
    void getFlowerType() {
        assertEquals(FlowerType.CHAMOMILE, flower_c.getFlowerType());
        assertEquals(FlowerType.ROSE, flower_r.getFlowerType());
        assertEquals(FlowerType.TULIP, flower_t .getFlowerType());

    }
    @org.junit.jupiter.api.Test
    void getSepalLength() {
        assertEquals(11, flower_c.getSepalLength());
        assertEquals(12, flower_r.getSepalLength());
        assertEquals(13, flower_t .getSepalLength());

    }
    @org.junit.jupiter.api.Test
    void getColor() {
        assertEquals(Color.Red, flower_c.getColor());
        assertEquals(Color.Blue, flower_r.getColor());
        assertEquals(Color.Green, flower_t .getColor());

    }
}
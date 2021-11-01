package decorators;

import flowerstore.Color;
import flowerstore.Flower;
import flowerstore.FlowerType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperDecoratorTest {
    Flower flower = new Flower(FlowerType.TULIP, Color.Blue);
    PaperDecorator p = new PaperDecorator(flower);

    @Test
    void getPrice() {
        assertNotEquals(p.getPrice(), flower.getPrice());
    }


}
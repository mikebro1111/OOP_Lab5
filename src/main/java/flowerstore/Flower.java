package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

@Getter
@Setter
@ToString

public class Flower extends Item{
    private double price;
    private double sepalLength;
    private Color color;
    private FlowerType flowerType;


    public Flower(FlowerType flowerType, Color color) {
        this.flowerType = flowerType;
        this.color = color;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    @Override
    public String getDescription() {
        return flowerType.toString();
        // realsise method
    }

//    public void setPrice(double price){
//        this.price = price;
//    }


    // Add constructor with Flower Type
    // FlowerPack
    // FlowerBucket
}

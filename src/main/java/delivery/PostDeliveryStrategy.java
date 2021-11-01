package delivery;


import flowerstore.Item;

import java.util.List;


public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(List<Item> items){
        System.out.println("The items will be delivered by post");
        return true;
    }
}

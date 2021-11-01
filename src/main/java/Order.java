import delivery.Delivery;
import flowerstore.Item;
import payment.Payment;

import java.util.ArrayList;
import java.util.List;

public class Order {
    List<Item> order = new ArrayList<>();
    private Delivery delivery;
    private Payment payment;

    public Order(){

    }
    public double calculateTotal(){
        double result = 0;
        for (Item item: order){
            result += item.getPrice();
        }
        return result;
    }
    public void removeItem(Item item){
        if (order.contains(item)){
            order.remove(item);
            System.out.println("Item deleted");
        }
        else {
            System.out.println("No item");
        }
    }
    public void addItem(Item item){
        order.add(item);
    }
    public boolean processOrder(){
        double result = calculateTotal();
        if(payment.pay(result)){
            return delivery.deliver(order);
        }
        else { return false;}
    }
}

package decorators;


import flowerstore.Item;

public class FlowerDecorator extends ItemDecorator {
    public FlowerDecorator(Item item){
        super(item);
    }
    @Override
    public double getPrice(){
        return 40 + super.getPrice();
    }
}

package decorators;

import flowerstore.Item;

public class BucketDecorator extends ItemDecorator {
    public BucketDecorator(Item item){
        super(item);
    }
    @Override public double getPrice(){
        return 4 + super.getPrice();
    }
}

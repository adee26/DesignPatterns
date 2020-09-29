package structural;

public class HatAdapter extends Item{

    private Hat hat;

    public HatAdapter(Hat hat){
        super();
        this.hat = hat;
    }

    @Override
    public String itemName() {
        return hat.name;
    }

    @Override
    public int itemPrice() {
        return hat.price;
    }
}

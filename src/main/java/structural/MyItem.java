package structural;

public class MyItem extends Item {
    public String name;
    public int price;

    public MyItem(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String itemName() {
        return name;
    }

    @Override
    public int itemPrice() {
        return price;
    }
}

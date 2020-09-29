package structural;

public class Main {
    public static void main(String[] args) {
        MyItem item1 = new MyItem("Item 1", 100);
        MyItem item2 = new MyItem("Item 2", 200);
        MyItem item3 = new MyItem("Item 3", 300);
        MyItem item4 = new MyItem("Item 4", 400);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

        System.out.println("Total price: " + cart.getTotalPrice());

        cart.removeItem(item3);

        System.out.println("Total price: " + cart.getTotalPrice());

        //Adapter

        HatAdapter hat1 = new HatAdapter(new Hat("Premium Hat", "This is a premium hat", 600));
        HatAdapter hat2 = new HatAdapter(new Hat("Gold Hat", "This is a gold hat", 400));
        HatAdapter hat3 = new HatAdapter(new Hat("Silver Hat", "This is a silver hat", 200));

        cart.addItem(hat1);
        cart.addItem(hat2);
        cart.addItem(hat3);

        System.out.println("Total price: " + cart.getTotalPrice());
    }
}

package structural;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    public List<Item> items = new LinkedList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public boolean removeItem(Item item){
        return items.remove(item);
    }

    public int getTotalPrice(){
        int result = 0;

        for(Item item : items){
            result = result + item.itemPrice();
        }

        return result;
    }

}

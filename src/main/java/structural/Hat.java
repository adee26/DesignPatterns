package structural;

public class Hat{
    public String name;
    public String description;
    public int price;

    public Hat(String name, String description, int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}

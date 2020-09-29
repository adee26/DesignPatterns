package creational.singleton.abstractFactory;

public abstract class AbstractFactory {
    public abstract CarpenterShop getCarpenterShop (String carpenterShop);
    public abstract SteelShop getSteelShop (String steelShop);
}

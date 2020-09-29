package creational.singleton.abstractFactory;

public class SteelShopFactory extends  AbstractFactory {
    @Override
    public CarpenterShop getCarpenterShop(String carpenterShop) {
        return null;
    }

    @Override
    public SteelShop getSteelShop(String steelShop) {
        if(steelShop.equals(null)){
            return null;
        }

        if(steelShop.equalsIgnoreCase("steel table")){
            return new SteelTable();
        }

        return null;
    }
}

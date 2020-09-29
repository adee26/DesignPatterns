package creational.singleton.abstractFactory;

public class CarpenterShopFactory extends AbstractFactory {

    @Override
    public CarpenterShop getCarpenterShop(String carpenterShop) {
        if(carpenterShop.equals(null)){
            return null;
        }

        if(carpenterShop.equalsIgnoreCase("wood table")){
            return new WoodenTable();
        }

        return null;
    }

    @Override
    public SteelShop getSteelShop(String steelShop) {
        return null;
    }
}

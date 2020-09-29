package creational.singleton.abstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory carpenterShopFactory =  FactoryProducer.getFactory("carpenter shop");
        AbstractFactory steelShopFactory =  FactoryProducer.getFactory("steel shop");

        CarpenterShop carpenterShop = carpenterShopFactory.getCarpenterShop("Carpenter Shop");
        carpenterShop.woodenTable();
        SteelShop steelShop = steelShopFactory.getSteelShop("Steel Shop");
        steelShop.steelTable();
    }

}

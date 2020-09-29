package creational.singleton.builder;

public class Main {
    public static void main(String[] args) {

        //telescoping problem
        LunchOrder lunchOrder1 = new LunchOrder("white bread");
        System.out.println("Withouth Builder " + " " + lunchOrder1.getBread());

        LunchOrder lunchOrder2 = new LunchOrder("white bread", "tomato", "blue cheese", null);
        System.out.println("Whithout Builder" + " " + lunchOrder2.getBread());
        System.out.println("Without Builder" + " "  + lunchOrder2.getTomato());
        System.out.println("Without Builder" + " "  + lunchOrder2.getCheese());
        System.out.println("Without Builder" + " "  + lunchOrder2.getAvocado());

        //builder solution

        LunchOrderBuilder lunchOrderBuilder1 = new LunchOrderBuilder.Builder()
                .withCheese("blue cheese")
                .withAvocado("avocado")
                .build();
        System.out.println("With Builder: " + " " + lunchOrderBuilder1.getCheese());

        LunchOrderBuilder lunchOrderBuilder2 = new LunchOrderBuilder.Builder()
                .withDressing("Salad")
                .withTomato("Tomato")
                .withEggs("Scrambled eggs")
                .withBread("White Bread")
                .build();
        System.out.println("With builder: " + " " + lunchOrderBuilder2.getEggs());
    }
}

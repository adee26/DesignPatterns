package creational.singleton;

public class Singleton {
    public static void main(String[] args) {

        Runtime instance = Runtime.getRuntime();
        System.out.println("First instance: " + instance);

        Runtime anotherInstance = Runtime.getRuntime();
        System.out.println("Second instance: " + anotherInstance);


        if(instance == anotherInstance){
            System.out.println("The instances are the same.");
        }
    }
}

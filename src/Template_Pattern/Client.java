package Template_Pattern;

public class Client {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker1 = new CappuccinoCoffee();
        coffeeMaker1.prepareCoffee();
        CoffeeMaker coffeeMaker2 = new BlackCoffee();
        coffeeMaker2.prepareCoffee();
    }
}

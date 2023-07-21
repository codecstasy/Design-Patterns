package Template_Pattern;

public class CappuccinoCoffee extends CoffeeMaker {
    @Override
    public void boilWater() {
        System.out.println("Water Boiled");
    }

    @Override
    public void addCoffeeGrain() {
        System.out.println("Cappuccino Coffee Grain Added");
    }

    @Override
    public void addMilk() {
        System.out.println("Milk added for cappuccino");
    }

    @Override
    public void addSugar() {
        System.out.println("Sugar added");
    }

    @Override
    public void decorateCoffee() {
        System.out.println("Decorated for cappuccino");
    }
}

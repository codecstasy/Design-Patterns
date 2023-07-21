package Template_Pattern;

public class BlackCoffee extends CoffeeMaker {
    @Override
    public void boilWater() {
        System.out.println("Water Boiled");
    }

    @Override
    public void addCoffeeGrain() {
        System.out.println("Black Coffee Grain Added");
    }

    @Override
    public void addMilk() {}

    @Override
    public void addSugar() {
        System.out.println("Sugar added");
    }

    @Override
    public void decorateCoffee() {
        System.out.println("Decorated for Black Coffee");
    }
}

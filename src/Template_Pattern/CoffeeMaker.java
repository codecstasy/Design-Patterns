package Template_Pattern;

public abstract class CoffeeMaker {
    public void prepareCoffee() {
        boilWater();
        addCoffeeGrain();
        addMilk();
        addSugar();
        decorateCoffee();
        System.out.println("Coffee is ready!");
    }
    public abstract void boilWater();
    public abstract void addCoffeeGrain();
    public abstract void addMilk();
    public abstract void addSugar();
    public abstract void decorateCoffee();
}

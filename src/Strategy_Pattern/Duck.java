package Strategy_Pattern;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }
    public void swim() {
        System.out.println("I am swimming!!!");
    }
    public void display() {
        System.out.println("I look really good!!!");
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void performFly() {
        flyBehavior.fly();
    }
}

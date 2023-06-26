package Strategy_Pattern;

public class RedheadDuck extends Duck {
    RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
        super(quackBehavior, flyBehavior);
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void perfromFly() {
        flyBehavior.fly();
    }
}

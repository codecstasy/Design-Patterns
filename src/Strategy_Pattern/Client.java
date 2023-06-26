package Strategy_Pattern;

public class Client {
    public static void main(String[] args) {
        LoudQuack loudQuack = new LoudQuack();
        NoFly noFly = new NoFly();
        Duck duck = new MallardDuck(loudQuack, noFly);
        duck.performFly();
        duck.swim();
        duck.performQuack();
        duck.display();
    }
}

package Adapter_Pattern;

public class Client {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        duck.quack();
        duck.fly();
        turkey.gobble();
        turkey.fly();


        System.out.println("\n\nUsing the adapter pattern");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

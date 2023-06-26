package Strategy_Pattern;

public interface FlyBehavior {
    public void fly();
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("FLying With Wingsss!!!");
    }
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("Sorry I cannot fly!!!");
    }
}

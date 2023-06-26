package Adapter_Pattern;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Wild Turkey Gobble!!!");
    }
    public void fly() {
        System.out.println("Wild Turkey Flies!!!");
    }
}

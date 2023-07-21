package Decorator_Pattern;

public class OnionDosaDecorator extends DosaDecorator {
    public void makeDosa() {
        System.out.println("Decorating Plain Dosa to Onion Dosa");
        this.addOnion();
    }
    public void addOnion() {
        System.out.println("Onion Added");
    }
}

package Decorator_Pattern;

public class MasalaDosaDecorator extends DosaDecorator {
    public void makeDosa() {
        System.out.println("Decorating Plain Dosa to Masala Dosa");
        this.addMasala();
    }
    public void addMasala() {
        System.out.println("Masala Added");
    }
}

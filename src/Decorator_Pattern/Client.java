package Decorator_Pattern;

public class Client {
    public static void main(String[] args) {
        Dosa dosa = new PlainDosa();
        DosaDecorator dosaDecorator1 = new MasalaDosaDecorator();
        dosaDecorator1.makeDosa();
        DosaDecorator dosaDecorator2 = new OnionDosaDecorator();
        dosaDecorator2.makeDosa();
    }
}

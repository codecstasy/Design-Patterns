package Decorator_Pattern;

public abstract class DosaDecorator implements Dosa {
    private Dosa dosa;
    public abstract void makeDosa();
}

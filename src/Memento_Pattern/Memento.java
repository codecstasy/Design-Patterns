package Memento_Pattern;

public class Memento {
    TV tv;
    public Memento(TV tv) {
        this.tv = tv;
    }
    public TV getTV() {
        return tv;
    }
    public void setTV(TV tv) {
        this.tv = tv;
    }
}

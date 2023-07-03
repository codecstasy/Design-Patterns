package Memento_Pattern;

public class Originator {
    TV tv;
    public TV getTV() {
        return tv;
    }
    public void setTV(TV tv) {
        this.tv = tv;
    }
    public Memento createMemento() {
        return new Memento(tv);
    }
    public void setMemento(Memento memento) {
        tv = memento.getTV();
    }
}

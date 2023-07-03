package Memento_Pattern;

public class Client {
    public static void main(String[] args) {
        int mementoIndex = -1;

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setTV(new TV(42, 40000, false));
        caretaker.addMemento(originator.createMemento());
        mementoIndex++;

        originator.setTV((new TV(46, 60000, true)));
        caretaker.addMemento(originator.createMemento());
        mementoIndex++;

        originator.setTV(new TV(50, 80000, true));
        caretaker.addMemento(originator.createMemento());
        mementoIndex++;

        System.out.println("Current state: " + caretaker.getMemento(mementoIndex).getTV().getSize());
        System.out.println("Immediately previous state: " + caretaker.getMemento(mementoIndex-1).getTV().getSize());
    }
}

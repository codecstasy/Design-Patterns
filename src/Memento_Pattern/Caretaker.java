package Memento_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> tvList = new ArrayList<Memento>();
    public void addMemento(Memento memento) {
        tvList.add(memento);
    }
    public Memento getMemento(int index) {
        return tvList.get(index);
    }
}

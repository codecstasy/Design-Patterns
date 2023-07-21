package Observer_Pattern_2;

import java.util.ArrayList;

public class Toyota implements Car {
    public ArrayList <String> availableModels = new ArrayList<String>();
    private ArrayList <Subscriber> subscribers = new ArrayList<Subscriber>();

    public void addNewModel(String modelName) {
        availableModels.add(modelName);
        notifySubscribers(modelName);
    }
    public void notifySubscribers(String modelName) {
        for(Subscriber subs : subscribers) {
            subs.update(modelName);
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}

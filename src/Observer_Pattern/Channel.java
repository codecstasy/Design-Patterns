package Observer_Pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Channel {
    public String channelName;
    List <Subscriber> subscribers = new ArrayList<>();
    public Channel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribeUser(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribeUser(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifyUsers() {
        for(Subscriber it : subscribers) {
            it.update(channelName);
        }
    }

    public void uploadVideo() {
        notifyUsers();
    }
}

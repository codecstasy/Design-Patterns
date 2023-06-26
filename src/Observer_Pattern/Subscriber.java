package Observer_Pattern;

public class Subscriber {
    public String subscriberName;
    Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public void update(String channelName) {
        System.out.println("Hello " + subscriberName + "! New video has been uploaded by " + channelName);
    }
}

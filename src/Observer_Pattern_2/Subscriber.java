package Observer_Pattern_2;

public class Subscriber {
    private String subscriberName;
    public Subscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }
    public void update(String modelName) {
        System.out.println("Hey " + subscriberName + "! " + "New model has arrived! \n" + "Model Name: " + modelName);
    }
}

package Observer_Pattern_2;

public class Client {
    public static void main(String[] args) {
        Subscriber subscriber1 = new Subscriber("Ashish");
        Subscriber subscriber2 = new Subscriber("Arpita");
        Subscriber subscriber3 = new Subscriber("Sajib");

        Toyota toyotaCar = new Toyota();
        toyotaCar.addSubscriber(subscriber1);
        toyotaCar.addSubscriber(subscriber2);
        toyotaCar.addSubscriber(subscriber2);

        toyotaCar.addNewModel("Vitz");
        toyotaCar.addNewModel("Corolla");
        
    }
}

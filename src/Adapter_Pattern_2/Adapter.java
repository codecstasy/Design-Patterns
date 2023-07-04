package Adapter_Pattern_2;

public class Adapter extends AmericanCharger {
    private EuropeSocket europeSocket;
    public void chargePhone() {
        europeSocket = new EuropeSocket();
        System.out.println("Adapter is being used");
        europeSocket.europeanSocketCharge();
    }
}

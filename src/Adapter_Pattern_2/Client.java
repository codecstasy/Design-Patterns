package Adapter_Pattern_2;

public class Client {
    public static void main(String[] args) {
        AmericanCharger americanCharger = new AmericanCharger();
        Adapter adapter = new Adapter();

        americanCharger.chargePhone(adapter);
    }
}

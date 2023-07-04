package Adapter_Pattern_2;

public class AmericanCharger {
    public void chargePhone(Adapter adapter) {
        System.out.println("American charger requesting for charge");
        adapter.chargePhone();
    }
}

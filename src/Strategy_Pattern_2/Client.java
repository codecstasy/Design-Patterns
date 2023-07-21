package Strategy_Pattern_2;

public class Client {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer();
        swimmer.setSwimmingStrategy(new FreeStyle());
        swimmer.getSwimmingStrategy().doSwim();
        swimmer.setSwimmingStrategy(new Butterfly());
        swimmer.getSwimmingStrategy().doSwim();
    }
}

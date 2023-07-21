package Strategy_Pattern_2;

public class Swimmer {
    private SwimmingStrategy swimmingStrategy;
    public void setSwimmingStrategy(SwimmingStrategy swimmingStrategy) {
        this.swimmingStrategy = swimmingStrategy;
    }
    public SwimmingStrategy getSwimmingStrategy() {
        return swimmingStrategy;
    }
}

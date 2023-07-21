package Observer_Pattern_2;

public interface Car {
    void addNewModel(String modelName);
    void notifySubscribers(String modelName);
}

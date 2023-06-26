package Command_Pattern;

public class TurnOnCommand implements Command {
    Light light;
    public TurnOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}

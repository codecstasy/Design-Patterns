package Command_Pattern;

public class TurnOffCommand implements Command {
    Light light;
    public TurnOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOff();
    }
}

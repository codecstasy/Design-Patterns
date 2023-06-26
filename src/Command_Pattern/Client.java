package Command_Pattern;

public class Client {
    public static void main(String[] args) {
        Remote remote = new Remote();
        remote.setCommand(new TurnOnCommand(new Light()));
        remote.pressButton();
        remote.setCommand(new TurnOffCommand(new Light()));
        remote.pressButton();
    }
}

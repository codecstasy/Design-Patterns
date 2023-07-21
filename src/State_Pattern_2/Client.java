package State_Pattern_2;

public class Client {
    public static void main(String[] args) {
        SwitchedOff switchedOff = new SwitchedOff();

        SoundBox soundBox = new SoundBox();
        soundBox.setState(switchedOff);

        soundBox.pressSoundsDown();
        soundBox.pressPowerButton();
        soundBox.pressSoundsDown();
    }
}

package State_Pattern_2;

public class SwitchedOff implements State {
    State state;
    public void powerButtonPressed() {
        if(this.state == null || this.state instanceof SwitchedOff) {
            System.out.println("Power on!");
            changeState();
        }
        else {
            state.powerButtonPressed();
        }
    }
    public void soundsUpPressed() {
        if(this.state == null || this.state instanceof SwitchedOff)
            System.out.println("Nothing");
        else
            state.soundsUpPressed();
    }
    public void soundsDownPressed() {
        if(this.state == null || this.state instanceof SwitchedOff)
            System.out.println("Noting");
        else
            state.soundsDownPressed();
    }
    private void changeState() {
        if(this.state instanceof SwitchedOff) {
            this.state = new SwitchedOn();
        }
    }
}

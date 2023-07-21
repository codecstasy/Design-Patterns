package State_Pattern_2;

public class SwitchedOn implements State {
    State state;
    public void powerButtonPressed() {
        if(this.state == null || this.state instanceof SwitchedOn) {
            System.out.println("Power off!");
            changeState();
        }
        else {
            state.powerButtonPressed();
        }
    }
    public void soundsUpPressed() {
        if(this.state == null || this.state instanceof SwitchedOn) {
            System.out.println("Sound++");
        }
        else {
            state.soundsUpPressed();
        }
    }
    public void soundsDownPressed() {
        if(this.state == null || this.state instanceof SwitchedOn) {
            System.out.println("Sound--");
        }
        else {
            state.soundsDownPressed();
        }
    }
    private void changeState() {
        if(this.state instanceof SwitchedOff) {
            this.state = new SwitchedOn();
        }
    }
}

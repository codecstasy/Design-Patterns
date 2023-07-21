package State_Pattern_2;

public class SoundBox {
    State state;
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public void pressPowerButton() {
        state.powerButtonPressed();
    }
    public void pressSoundsUp() {
        state.soundsUpPressed();
    }
    public void pressSoundsDown() {
        state.soundsDownPressed();
    }
}

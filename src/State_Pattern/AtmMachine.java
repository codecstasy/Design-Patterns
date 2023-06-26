package State_Pattern;

public class AtmMachine implements AtmMachineState {
    private AtmMachineState atmMachineState;

    public AtmMachine() {
        atmMachineState = new NoDebitCardState();
    }

    @Override
    public void insertDebitCard() {
        atmMachineState.insertDebitCard();
        if(atmMachineState instanceof NoDebitCardState) {
            setAtmMachineState(new HasDebitCardState());
            System.out.println("[[ATM machine state has been changed to Has Card State]]");
        }
    }

    @Override
    public void ejectDebitCard() {
        atmMachineState.ejectDebitCard();
        if(atmMachineState instanceof HasDebitCardState) {
            setAtmMachineState(new NoDebitCardState());
            System.out.println("[[ATM machine state has been changed to No Card State]]");
        }
    }

    @Override
    public void withdrawMoney(int amount) {
        atmMachineState.withdrawMoney(amount);
    }

    public AtmMachineState getAtmMachineState() {
        return atmMachineState;
    }

    public void setAtmMachineState(AtmMachineState atmMachineState) {
        this.atmMachineState = atmMachineState;
    }
}

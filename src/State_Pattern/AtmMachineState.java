package State_Pattern;

public interface AtmMachineState {
    void insertDebitCard();
    void ejectDebitCard();
    void withdrawMoney(int amount);
}

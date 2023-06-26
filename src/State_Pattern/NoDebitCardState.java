package State_Pattern;

public class NoDebitCardState implements AtmMachineState {

    @Override
    public void insertDebitCard() {
        System.out.println("Debit Card inserted");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("Cannot Eject! No Debit Card is in the ATM machine.");
    }

    @Override
    public void withdrawMoney(int amount) {
        System.out.println("Cannot Withdraw! No Debit Card is in the ATM machine.");
    }
}

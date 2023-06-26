package State_Pattern;

public class HasDebitCardState implements AtmMachineState {

    @Override
    public void insertDebitCard() {
        System.out.println("Debit Card has been already inserted.");
    }

    @Override
    public void ejectDebitCard() {
        System.out.println("Debit Card is ejected.");
    }

    @Override
    public void withdrawMoney(int amount) {
        System.out.println(amount + "bdt has been withdrawn from you account.");
    }
}

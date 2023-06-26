package State_Pattern;

public class Client {
    public static void main(String[] args) {
        AtmMachine atmMachine = new AtmMachine();

        atmMachine.insertDebitCard();
        atmMachine.withdrawMoney(200);
        atmMachine.ejectDebitCard();

        System.out.println();

        //Wrong commands
        atmMachine.ejectDebitCard();
        atmMachine.withdrawMoney(500);
    }
}

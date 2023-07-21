package Facade_Pattern;

public class Client {
    public static void main(String[] args) {
        BankingFacade bankingFacade = new BankingFacade("1506004", 5051);
        bankingFacade.showAccountBalance();
        bankingFacade.cashWithdraw(1752.00);
        bankingFacade.cashDeposit(2000.00);
    }
}

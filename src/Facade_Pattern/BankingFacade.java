package Facade_Pattern;

public class BankingFacade {
    private WelcomeSystem welcomeSystem;
    private AccountVerification accountVerification;
    private SecurityPinVerification securityPinVerification;
    private FundTransactions fundTransactions;
    private String enteredAccountNumber;
    private int enteredSecurityPin;

    public BankingFacade(String enteredAccountNumber, int enteredSecurityPin) {
        welcomeSystem = new WelcomeSystem();
        this.enteredAccountNumber = enteredAccountNumber;
        this.enteredSecurityPin = enteredSecurityPin;
        accountVerification = new AccountVerification();
        securityPinVerification = new SecurityPinVerification();
        fundTransactions = new FundTransactions();
        this.verification();
    }

    public boolean verification() {
        boolean flag = true;
        if(accountVerification.isValidAccount(enteredAccountNumber)) {
            System.out.println("Account Verified");
        }
        else {
            System.out.println("Invalid Account Number");
            return false;
        }
        if(securityPinVerification.isValidSecurityPin(enteredSecurityPin)) {
            System.out.println("Security Pin Verified");
        }
        else {
            System.out.println("Invalid Security Pin");
            return false;
        }
        return true;
    }

    public void cashWithdraw(double requestedAmount) {
        fundTransactions.withdrawCash(requestedAmount);
    }
    public void cashDeposit(double depositAmount) {
        fundTransactions.depositMoney(depositAmount);
    }
    public void showAccountBalance() {
        fundTransactions.showBalance();
    }
}

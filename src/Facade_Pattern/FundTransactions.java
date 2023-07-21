package Facade_Pattern;

public class FundTransactions {
    private double currentBalance = 5000;
    public void showBalance() {
        System.out.println("Current Balance is BDT" + currentBalance);
    }
    public void withdrawCash(double withdrawalAmount) {
        if(withdrawalAmount <= currentBalance) {
            currentBalance -= withdrawalAmount;
            System.out.println("Cash withdrawn of BDT" + withdrawalAmount);
            showBalance();
        }
        else {
            System.out.println("Warning! Not sufficient Balance");
        }
    }
    public void depositMoney(double depositAmount) {
        currentBalance += depositAmount;
        System.out.println("Cash Deposit of BDT" + depositAmount + "\nCurrent Balance is BDT" + currentBalance);
        showBalance();
    }
}

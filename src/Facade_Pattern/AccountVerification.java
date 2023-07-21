package Facade_Pattern;

public class AccountVerification {
    private String accountNumber = "1506004";
    public boolean isValidAccount(String enteredAccountNumber) {
        if(accountNumber.equals(enteredAccountNumber)) {
            return true;
        }
        else {
            return false;
        }
    }
}

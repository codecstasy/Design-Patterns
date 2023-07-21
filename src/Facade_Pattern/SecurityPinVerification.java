package Facade_Pattern;

public class SecurityPinVerification {
    private int securityKey = 5051;
    public boolean isValidSecurityPin(int enteredSecurityPin) {
        if(this.securityKey == enteredSecurityPin) {
            return true;
        }
        else {
            return false;
        }
    }
}

package Chain_Of_Responsibility;

public class GeneralManager implements VacationHandler {
    public VacationHandler nextVacationHandler;
    int maxLeaveApproval = 30;
    public void setNextAuthority(VacationHandler vacationHandler) {
        nextVacationHandler = vacationHandler;
    }

    public boolean approveLeave(int noOfDays) {
        if(noOfDays <= maxLeaveApproval) {
            System.out.println("Vacation approved by general manager");
            return true;
        }
        else if(nextVacationHandler != null) {
            return nextVacationHandler.approveLeave(noOfDays);
        }
        else {
            System.out.println("Sorry! cannot be approved");
            return false;
        }
    }
}

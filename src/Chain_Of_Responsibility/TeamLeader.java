package Chain_Of_Responsibility;

public class TeamLeader implements VacationHandler {
    public VacationHandler nextVacationHandler;
    int maxLeaveApproval = 10;
    public void setNextAuthority(VacationHandler vacationHandler) {
        nextVacationHandler = vacationHandler;
    }

    public boolean approveLeave(int noOfDays) {
        if(noOfDays <= maxLeaveApproval) {
            System.out.println("Vacation approved by team leader");
            return true;
        }
        else if(nextVacationHandler != null) {
            return nextVacationHandler.approveLeave(noOfDays);
        }
        else {
            System.out.println("Sorry! Cannot be approved");
            return false;
        }
    }
}

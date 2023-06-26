package Chain_Of_Responsibility;

public class ProjectLeader implements VacationHandler {
    public VacationHandler nextVacationHandler;
    int maxLeaveApproval = 20;
    public void setNextAuthority(VacationHandler vacationHandler) {
        nextVacationHandler = vacationHandler;
    }

    public boolean approveLeave(int noOfDays) {
        if(noOfDays <= maxLeaveApproval) {
            System.out.println("Vacation approved by project leader");
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

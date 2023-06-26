package Chain_Of_Responsibility;

public interface VacationHandler {
    boolean approveLeave(int noOfDays);
    void setNextAuthority(VacationHandler vacationHandler);
}

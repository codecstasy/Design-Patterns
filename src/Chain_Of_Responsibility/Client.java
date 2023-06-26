package Chain_Of_Responsibility;

public class Client {
    public static void main(String[] args) {
        VacationHandler teamLeader = new TeamLeader();
        VacationHandler projectLeader = new ProjectLeader();
        VacationHandler generalManager = new GeneralManager();

        teamLeader.setNextAuthority(projectLeader);
        projectLeader.setNextAuthority(generalManager);

        teamLeader.approveLeave(8);
        teamLeader.approveLeave(15);
        teamLeader.approveLeave(25);
        teamLeader.approveLeave(38);
    }
}

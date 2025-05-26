package OOP.leave_tracking_system;
import OOP.leave_tracking_system.Employee;

public class LeaveRequest {

    private int requestID;
    private Employee employee;
    private String startDate;
    private String endDate;
    private String status; // "Pending", "Approved", "Denied"
    private String reason;

    public LeaveRequest(int requestID, Employee employee, String startDate, String endDate, String status,
            String reason) {
        requestID = this.requestID;
        employee = this.employee;
        startDate = this.startDate;
        endDate = this.endDate;
        status = "Pending";
        reason = this.reason;
    }

}
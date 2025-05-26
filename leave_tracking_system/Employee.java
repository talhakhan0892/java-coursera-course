package OOP.leave_tracking_system;

public class Employee {
    // Properties (attributes)
    private int employeeId;
    private String name;
    private String department;
    private String email;
    private int leaveBalance;

    // Constructor
    public Employee(int employeeId, String name, String department, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.email = email;
        leaveBalance = 20;
    }
    // Methods will be added here


    public int getLeaveBalance() {
        return leaveBalance;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmployeeId(int id) {
        employeeId = id;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLeaveBalance(int leaveBalance) {
        if (leaveBalance >= 0) {
            this.leaveBalance = leaveBalance;
        } else {
            System.out.println("Leave balance cannot be negative.");
        }
    }
}
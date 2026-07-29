public class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;


    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        if(salary > 0){
        this.salary = salary;}
        else{
            System.out.println("Invalid Salary");
        }
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void display(){
        System.out.println("Employee_id : " + employeeId);
        System.out.println("Employee_Name : " + employeeName);
        System.out.println("Salary : " + salary);
    }
}

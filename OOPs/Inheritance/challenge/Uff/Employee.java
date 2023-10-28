package OOPs.Inheritance.challenge.Uff;

public class Employee extends Worker {

    private long employeeID;
    private String hireDate;

    private static int EmployeeNum = 1;

   

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeID = Employee.EmployeeNum++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee [employeeID=" + employeeID + ", hireDate=" + hireDate + "]" + super.toString();
    }

}

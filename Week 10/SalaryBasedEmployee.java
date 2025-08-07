public class SalaryBasedEmployee extends Employee{
    private double fixedSalary;

    public SalaryBasedEmployee(String firstName, String lastName, String socialSecurityNumber, double fixedSalary) {
        super(firstName, lastName, socialSecurityNumber);
        setFixedSalary(fixedSalary);
    }


//  Setter
    public void setFixedSalary(double fixedSalary) {
        if (fixedSalary < 0.0) {
            throw new IllegalArgumentException("Given Salary is not Correct!");
        }
        this.fixedSalary = fixedSalary;
    }

// Getter
    public double getfixedSalary() {
        return fixedSalary;
    }


    @Override
    public String toString() {
        return super.toString() + "Fixed Salary : " + getfixedSalary() + "\n";
    }
    
}

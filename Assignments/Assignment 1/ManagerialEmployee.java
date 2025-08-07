public class ManagerialEmployee extends Employee{
    private double fixedSalary;

    public ManagerialEmployee(String empId, String name, Address address, Contact contact, Email email, String jobTitle, double fixedSalary){
        super(empId, name, address, contact, email, jobTitle);
        setFixedSalary(fixedSalary);
    }


//  Setter
    public void setFixedSalary(double fixedSalary) {
        if (!isValidSalary(fixedSalary)) {
            throw new IllegalArgumentException("Given Salary is not Correct!");
        }
        this.fixedSalary = fixedSalary;
    }

// Getter
    public double getFixedSalary() { return fixedSalary; }


// Validations
    public boolean isValidSalary(double fixedSalary){
        if (fixedSalary < 0) {
            return false;
        }
        return true;
    }


//  toString Method()
    @Override
    public String toString() {
        return super.toString() + "\nBase Salary : " + getFixedSalary() + "\n";
    }

    
    

    
}

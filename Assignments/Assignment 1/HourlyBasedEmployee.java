
//  Cashier Class
public class HourlyBasedEmployee extends Employee {
    private double hours, wage;

//  Constructor
    public HourlyBasedEmployee(String empId, String name, Address address, Contact contact, Email email, String jobTitle, double hours, double wage){
        super(empId, name, address, contact, email, jobTitle);
        setHours(hours);
        setWage(hours);
    }

//  Setters
    public void setHours(double hours) {
        if (!isValidHours(hours)) {
            throw new IllegalArgumentException("Given Hours are not Correct!");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (!isValidWage(wage)) {
            throw new IllegalArgumentException("Given Wage is not Correct!");
        }
        this.wage = wage;
    }
    
//  Getters
    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

//  Validations for Hours and Wages
    private boolean isValidHours(double hours){
        if (hours < 0 || hours > 168) {
            return false;
        }
        return true;
    }

    private boolean isValidWage(double wage){
        if (hours < 0 || hours > 168) {
            return false;
        }
        return true;
    }


//  Earning of HoulyBase Employee
    public double earning(){
        double totalSalary = 0.0;
        // if (getHours() <= 40) {
        //     totalSalary = getHours() * getWage();
        // }
        // else{
        //     double regularHours = 40;
        //     double overTimeHours = getHours() - regularHours;
        //     totalSalary = regularHours * getWage() + overTimeHours * 1.5 * getWage();
        // }
        totalSalary = getHours() <= 40 ? getHours() * getWage() : 40 * getWage() + (getHours() - 40) * 1.5 * getWage();
        return totalSalary;
    }

//  toString Method()
    @Override
    public String toString() {
        return super.toString() + "Hours : " + getHours() + "\nWage : " + getWage() + "\nEaning : " + earning() + "\n";
    }
 
}

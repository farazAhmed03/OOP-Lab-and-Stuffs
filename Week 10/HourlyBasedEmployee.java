public class HourlyBasedEmployee extends Employee {
    private double hours, wage;

    public HourlyBasedEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        setHours(hours);
        setWage(wage);
    }

//  Setters
    public void setHours(double hours) {
        if (hours < 0 || hours > 168) {
            throw new IllegalArgumentException("Given Hours are not Correct!");
        }
        this.hours = hours;
    }

    public void setWage(double wage) {
        if (wage < 0) {
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

//  Earning of HoulyBase Employee
    double earning(){
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

    @Override
    public String toString() {
        return super.toString() + "Hours : " + hours + "\nWage : " + wage + "\nEarning : " + earning() +  "\n";
    }
    
    
    

}

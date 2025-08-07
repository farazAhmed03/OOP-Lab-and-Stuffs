
public class BasePlusCommissioned  extends CommisionEmployee{
    private double baseSalary;  // Represent Fixed Salary

    public BasePlusCommissioned(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
        setBaseSalary(baseSalary);
    }

//  Setter
    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Given Base salary is not Correct!");
        }
        this.baseSalary = baseSalary;
    }

//  Getter
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setIncrease(){
        
    }

//  Calculate total earning of Employee on the basis of commission+Base salary
    @Override   
    public double earning(){
        // double totalSalary = getBaseSalary() + (getGrossSale() * getCommissionRate()); replace (getGrossSale() * getCommissionRate() ) to super.earning Method
        double totalSalary = getBaseSalary() + super.earning();
        return totalSalary;
    }


//  toString method()
    @Override
    public String toString() {
        return "Super Class Methods : \n" + super.toString() + "Sub Class Earning \nBase Salary : " + getBaseSalary() + "\nEarning : " + earning() + "\n";
    }

    
}

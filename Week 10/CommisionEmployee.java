public class CommisionEmployee extends Employee{
    private double commissionRate, grossSale;

//  Constructor
    public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);        
        setGrossSale(grossSale);
        setCommissionRate(commissionRate);
    }


//  Setters
    public void setGrossSale(double grossSale) { 
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("Given Gross sale is not correct!");
        }
        else{
            this.grossSale = grossSale;
        }
         
    }

    public void setCommissionRate(double commissionRate) { 
        if (commissionRate < 0.0) {
            throw new IllegalArgumentException("Given Commission Rate is not incorrect!");
        }
        else{
            this.commissionRate = commissionRate;
        }
    }
    
    
//  Getters
    public double getGrossSale() { 
        return grossSale; 
    }
    
    public double getCommissionRate() { 
        return commissionRate; 
    }


//  Calculate total earning of Employee on the basis of commission rate
    public double earning(){
        double totalSalary = getCommissionRate() * getGrossSale();
        return totalSalary;
    }

//  toString method
    @Override
    public String toString() {
        return super.toString() + "Gross Sale : " + getGrossSale() + "\nCommission Rate : " + getCommissionRate() + "\nEarning : " + earning() + "\n";
    }
    
    

}

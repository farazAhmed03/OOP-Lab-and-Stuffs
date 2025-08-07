class Employee extends Person {
    private double salary;
    private Date dateHired;

  
//  Constructor
    public Employee(String name, Address address, Contact phone, Email email, double salary, Date dateHired) 
    {
        super(name, address, phone, email);
        setSalary(salary);
        setDateHired(dateHired);
    }


//  Setters
    public void setSalary(double salary) 
    {
        if (isValidValue(salary)) {
            throw new IllegalArgumentException("Salary cannot be negative!");
        }
        this.salary = salary;
    }

    public void setDateHired(Date dateHired) { this.dateHired = dateHired; }



//  Getters
    public double getSalary() { return salary; }
    public Date getDateHired() { return dateHired; }


//  Validation
    private boolean isValidValue(double value)
    {
        return value >= 0;
    }
    



//  toString Method
    @Override
    public String toString() 
    {
        return super.toString() + "\nSalary : " + getSalary() + "Date of Hired : " + getDateHired() + "\n";
    }

    
}
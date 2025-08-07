class Student extends Person {

    private final String status;    // Status Junior/Senior => Marked as Constant     


//  Constructor
    public Student(final String name, final Address address, final Contact phone, final Email email, final String status) 
    {
        super(name, address, phone, email);
        this.status = status;
    }


//  Getter
    public String getStatus() 
    {
        return status;
    }



//  toString Method
    @Override
    public String toString() 
    {
        return super.toString() + "Student Status : " + getStatus() + "\n";
    }


}
public class Employee {
    private String empId, name, jobTitle;
    private Address address;        // Composition : Object of Address Class
    private Contact contact;       //  Composition : Object of Contact Class
    private Email email;          //   Composition : Object of Email Class

//  Constructor
    public Employee(String empId, String name, Address address, Contact contact , Email email, String jobTitle) {
        setEmpId(empId);
        setName(name);
        setContact(contact);
        setEmail(email);
        setJobTitle(jobTitle);
        setAddress(address);
    }


//  Setters
    public void setEmpId(String empId) { this.empId = empId; }
    public void setName(String name) { this.name = name; }
    public void setAddress(Address address) { this.address = address; }
    public void setContact(Contact contact) { this.contact = contact; }
    public void setEmail(Email email) { this.email = email; }
    public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }


    
//  Getters
    public String getEmpId() { return empId; }
    public String getName() { return name; }
    public Address getAddress() { return address; }
    public Contact getContact() { return contact; }
    public Email getEmail() { return email; }
    public String getJobTitle() { return jobTitle; }


//  toString
    @Override
    public String toString() {
        return "Employee Id : " + getEmpId() + "\nName : " + getName() + "Address" + getAddress() + getContact().toString() + "Email : " + getEmail() + "JobTitle : " + getJobTitle() + "\n";
    }    

}
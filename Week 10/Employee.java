
public class Employee {
    private  String firstName; 
    private  String lastName; 
    private  String socialSecurityNumber;

//  Constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocialSecurityNumber(socialSecurityNumber);
    }

//  Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }

//  Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }

//  concatinate of two string ( firstName + lastName )  to show as one name
    public String getFullName() {
        return firstName.concat(" ").concat(lastName);
    }

//  toString 
    @Override 
    public String toString() {
        return "Name : " + getFullName() + "\nSocialSecurityNumber : " + getSocialSecurityNumber() + "\n";
    }
     
}

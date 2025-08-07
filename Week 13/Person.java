public abstract class Person{
    private String name;
    private Address address;
    private Contact phone;
    private Email email;

//  Constructor
    protected Person(final String name, final Address address, final Contact phone, final Email email) 
    {
        setName(name);
        setAddress(address);
        setContact(phone);
        setEmail(email);
    }


//  Setters
    public void setName(String name) { this.name = name; }
    public void setAddress(Address address) { this.address = address; }
    public void setContact(Contact phone) { this.phone = phone; }
    public void setEmail(Email email) { this.email = email; }

//  Getters
    public String getName() { return name; }
    public Address getAddress() { return address; }
    public Contact getContact() { return phone; }
    public Email getEmail() { return email; }



//  toString Method
    @Override
    public String toString() 
    {
        return 
        "Name : " + getName() + 
        "\n\n------\t Address   \t------" + getAddress() + 
        "\n\n------\t Contact   \t------\n " + getContact() + 
        "\nEmail : " + getEmail() + "\n";
    }
    
    
}

public class Customer {
    private String customerId, name;
    private Email email;    // Object of Email class
    private Address shippingAdress;     // Object of Shipping Address class

//  Constructor
    public Customer(String customerId, String name, Email email, Address shippingAdress) {
        setCustomerId(customerId);
        setName(name);
        setEmail(email);
        
    }

//  Setters
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(Email email) { this.email = email; }
    public void setShippingAdress(Address shippingAdress) { this.shippingAdress = shippingAdress; }

//  Getters
    public String getCustomerId() { return customerId; }
    public String getName() { return name; }
    public Email getEmail() { return email; }
    public Address getShippingAdress() { return shippingAdress; }


// toString
    @Override
    public String toString() {
        return "Customer Id : " + getCustomerId() + "\nName : " + getName() + "\nEmail : " + getEmail() + "\nShippingAdress : " + getShippingAdress() + "\n";
    }

}

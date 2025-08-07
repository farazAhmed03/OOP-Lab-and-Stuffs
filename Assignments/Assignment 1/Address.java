public class Address {
    private String streetAdress, town, city, country;
    Contact contact;    // Composition : Object of contact class

//  Constructor
    public Address(String streetAdress, String town, String city, String country, Contact contact) {
        setStreetAdress(streetAdress);
        setTown(town);
        setCity(city);
        setCountry(country);
        addContact(contact);
    }

    

//  Setters
    public void setStreetAdress(String streetAdress) { this.streetAdress = streetAdress; }
    public void setTown(String town) { this.town = town; }
    public void setCity(String city) { this.city = city; }
    public void setCountry(String country) { this.country = country; }
    public void addContact(Contact contact){ this.contact = contact; }
    

//  Getters
    public String getStreetAdress() { return streetAdress; }
    public String getTown() { return town; }
    public String getCity() { return city; }
    public String getCountry() { return country; }
    public Contact getContact(){ return contact; }


//  toString 
    @Override
    public String toString(){
        return "\nStreet Address : " + getStreetAdress() + "\nTown : " + getTown() + "\nCity : " + getCity() + "\nCountry : " + getCountry() + "\n";
    }

    

}

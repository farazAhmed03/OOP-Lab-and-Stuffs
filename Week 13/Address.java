public class Address {
    private String streetAdress, city, country;

//  Constructor
    public Address(final String streetAdress, final String city, final String country) {
        setStreetAdress(streetAdress);
        setCity(city);
        setCountry(country);
    }

    

//  Setters
    public void setStreetAdress(String streetAdress) { this.streetAdress = streetAdress; }
    public void setCity(String city) { this.city = city; }
    public void setCountry(String country) { this.country = country; }
    

//  Getters
    public String getStreetAdress() { return streetAdress; }
    public String getCity() { return city; }
    public String getCountry() { return country; }


//  toString 
    @Override
    public String toString(){
        return "\nStreet Address : " + getStreetAdress() + "\nCity : " + getCity() + "\nCountry : " + getCountry() + "\n";
    }

    

}

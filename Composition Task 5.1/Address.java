public class Address {
    private String streetAdress, town, city, country;
    PhoneNo phone;
    
    public Address(String streetAdress, String town, String city, String country, PhoneNo phone) {
        setStreetAdress(streetAdress);
        setTown(town);
        setCity(city);
        setCountry(country);
        this.phone = phone;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
 
    
    
    public String toString(){
        return "\nStreet Address : " + this.streetAdress + "\nTown : " + this.town + "\nCity : " + this.city + "\nCountry : " + this.country + "\n\n\nPhone Details " + this.phone + "\n";
    }

    

}

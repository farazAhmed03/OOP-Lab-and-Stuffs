public class Contact {
    private String countryCode, cityCode, lineNumber;

    public Contact(String countryCode, String cityCode, String lineNumber) {
        setCountryCode(countryCode);
        setCityCode(cityCode);
        setLineNumber(lineNumber);
    }

    
//  Setters
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }
    public void setCityCode(String cityCode) { this.cityCode = cityCode; }
    public void setLineNumber(String lineNumber) { this.lineNumber = lineNumber; }

//  Getters
    public String getCountryCode() { return countryCode; }
    public String getCityCode() { return cityCode; }
    public String getLineNumber() { return lineNumber; }


// to String
    @Override
    public String toString(){
        return "Country Code : " + getCountryCode() + "\nCity Code : " + getCityCode() + "\nLine Number : " + getLineNumber() + "\n";
    }
    

}

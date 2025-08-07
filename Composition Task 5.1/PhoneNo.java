public class PhoneNo {
    private String countryCode, cityCode, lineNumber;

    public PhoneNo(String countryCode, String cityCode, String lineNumber) {
        setCountryCode(countryCode);
        setCityCode(cityCode);
        setLineNumber(lineNumber);
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }
    
    public String toString(){
        return "\nCountry Code : " + this.countryCode + "\nCity Code : " + this.cityCode + "\nLine Number : " + this.lineNumber + "\n";
    }

}

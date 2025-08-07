public class Date {
    private String day;
    private String month;
    private String year;

//  Constructor
    public Date(String day, String month, String year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }


//  Setters
    public void setDay(String day){ this.day = day; }
    public void setMonth(String month){ this.month = month; }
    public void setYear(String year){ this.year = year; }

//  Getters
    public String getDay() { return this.day; }
    public String getMonth() { return this.month; }
    public String getYear() { return this.year; }
    

//  toString() 
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

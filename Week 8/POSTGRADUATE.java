
import java.text.DecimalFormat;

public class POSTGRADUATE extends STUDENT{
    
    private double GPA;

//  Constructor
    public POSTGRADUATE(String studentNo, String studentName, DATE dob, int meritPoints, double GPA){
        super(studentNo, studentName, meritPoints, dob);
        if (GPA < 0 || GPA > 4) {
            throw new IllegalArgumentException("Given GPA is not Correct!");
        }
        if (this.GPA % 1 == 0) {
            this.GPA = GPA;
        }
        else{
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            this.GPA = Double.parseDouble(df.format(GPA));
        }
        
    }

//  Setter
    public void setGPA(double GPA){
        this.GPA = GPA;
    }

//  Getter
    public double getGPA(){
        return this.GPA;
    }

//  Calculate Merit
    public double calculateMerit(){
        double merit = getMeritPoints() + GPA;
        return merit;
    }

//  toString()
    public String toString(){
        return super.toString() + "\nGPA: " + GPA;
    }


}

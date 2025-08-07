
public class UNDERGRADUATE extends STUDENT{
    private double testScore;

//  Constructor
    public UNDERGRADUATE(String studentNo, String studentName, int meritPoints, DATE dob, int testScore){
        super(studentNo, studentName, meritPoints, dob);
        if (testScore < 0 || testScore > 600) {
            throw new IllegalArgumentException("Given Score is not Correct!");
        }
        if (this.testScore % 1 == 0) {
            this.testScore = testScore;
        }
        setScore(testScore);
    }

// Setters
    public void setScore(double testScore){
        this.testScore = testScore;
    }

//  Getters
    public double getScore(){
        return this.testScore;
    }

//  Calculate Merit
    public double calculateMerit(){
        double merit = getMeritPoints() + testScore;
        return merit;
    }

// toString()
    public String toString(){
        return super.toString() + "\nTest Score : " + testScore;
    }
    
}

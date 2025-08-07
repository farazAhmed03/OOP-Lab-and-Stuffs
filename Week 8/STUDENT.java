
public class STUDENT {
    private
        String studentNo, studentName;
        Integer meritPoints;
        DATE dob;
        static int noOfStudents = 0;

//  Default Constructor
    public STUDENT(){
        this.studentNo = "Not Known";
        this.studentName = "Not Known";
        this.meritPoints = 20;
        this.dob = new DATE("DD", "MM", "YYYY");    // Initially Zero
        if (!isUnknownStudent()) {
            noOfStudents++;
        }
    }

//  Parameterized Constructor
   public STUDENT(String studentNo, String studentName, Integer meritPoints, DATE dob) {
    setStudentNo(studentNo);
    setStudentName(studentName);
    this.meritPoints = meritPoints;
    setDob(dob);
    if (!isUnknownStudent()) {
        noOfStudents++;
    }
}



//  Setters Methods
    public void setStudentNo(String studentNo) { this.studentNo = studentNo; }
    public void setStudentName(String studentName) { this.studentName = studentName; }
    public void setMeritPoints(int meritPoints) { 
    // Exception Handling For Merit Values
        if (meritPoints < 20 || meritPoints > 200) {
            throw new IllegalArgumentException("Given Merit Points is not Correct!");
        }
        this.meritPoints = meritPoints; 
    }
    public void setDob(DATE dob) { this.dob = dob; }
    public static void setNoOfStudents(int noOfStudents) {  STUDENT.noOfStudents = noOfStudents; }


//  Getters Methods

    public String getStudentNo() { return studentNo; }
    public String getStudentName() { return studentName; }
    public int getMeritPoints() { return meritPoints; }
    public DATE getDob() { return dob; }
    public static int getNoOfStudents() { return noOfStudents; }


// Check if Student info is not Avaiable
    private boolean isUnknownStudent() {
        return "Not Known".equals(studentNo) && "Not Known".equals(studentName) && "DD".equals(dob.getDay());
    }



//  toString()
public String toString() {
    // if ("Not Known".equals(studentNo) && "Not Known".equals(studentName) && "DD".equals(dob.getDay())) {
    //     return "Student information is not available.";
    // }
        return "Student No: " + studentNo + "\nStudent Name: " + studentName + "\nDate of Birth: " + dob + "\nMerit Points: " + meritPoints;
    }

}
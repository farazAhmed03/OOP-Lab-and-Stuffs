public class Course {
    private String courseCode, courseName;

//  Constructor
    public Course(final String courseCode, final String courseName)
    {
        setCourseCode(courseCode);
        setCourseName(courseName);
    }



//  Setters
    public void setCourseCode(String courseCode) { 
        
        if (!Validation.validateCourseCode(courseCode)) {
            throw new IllegalArgumentException("Invalid Course Code");
        }
        this.courseCode = courseCode; 
    }

    public void setCourseName(String courseName) { 
        if (!Validation.validateCourseName(courseName)) {
            throw new IllegalArgumentException("Invalid Course Title");
        }
        this.courseName = courseName; 
    }



//  Getters
    public String getCourseName() { return courseName; }
    public String getCourseCode() { return courseCode; }



    public String toString(){
        return "CourseCode : " + getCourseCode() + "\nCourseTitle : " + getCourseName() + "\n";
    }

    
    
}
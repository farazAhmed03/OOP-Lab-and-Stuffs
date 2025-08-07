public class Course {

    private String courseCode, courseTitle;

    public Course(String courseCode, String courseTitle){
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }


    public String toString(){
        return "CourseCode : " + this.courseCode + "\nCourseTitle : " + this.courseTitle + "\n";
    }

    
    
}
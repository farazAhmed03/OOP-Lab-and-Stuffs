import java.util.ArrayList;

class Faculty extends Person {
    private String empId;
    private ArrayList<Course> courses = new ArrayList<>();
    private Course course;
    private static int count = 0;

    // Constructor
    public Faculty(final String empId, final String name, final Address address, final Contact phone, final Email email) {
        super(name, address, phone, email);
        setEmployeeId(empId);
        count++;
    }
    
    

//  Setters
    public void setEmployeeId(String empId) { this.empId = empId; }
    public void setCourse(Course course) { this.course = course; }
    
    

//  Getters
    public String getEmployeeId() { return empId; }
    public Course getCourse() { return course; }
    public static int getCount() { return count; }



//  Additional Methods
    public void addCourse(Course c) {
        if(!courses.contains(c))
            courses.add(c);
    }

    public void removeCourse(Course c) {
        if(courses.contains(c))
            courses.remove(c);
    }

    
    public void removeCourseByCode(Course courseToRemove) {
        courses.removeIf(course -> course.getCourseCode().equalsIgnoreCase(courseToRemove.getCourseCode()));
    }
        

    
//  Display All Courses
    public void getCourses(){
        for(Course course : courses)
            System.out.println(course);
    }


    

//  toString Method
    @Override
    public String toString() {
        return super.toString() +
        "\nEmployeeId : " + getEmployeeId() + "\n";
        // "\nCourses : " + getCourse() + "\n";
    }

    
}
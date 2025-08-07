import java.util.ArrayList;

public class Staff extends Person implements AccountSystem {
    private double salary;
    private ArrayList<Course> courses;

    public Staff(String name, double salary) {
        super(name, "N/A");
        this.salary = salary;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String code, String name) {
        if (courses.size() < 3) {
            courses.add(new Course(code, name, null));
        }
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    @Override
    public double getFee() {
        return salary;
    }

    public String toString() {
        return "Staff: " + name + ", Salary: " + salary + ", Courses: " + courses.size();
    }
}

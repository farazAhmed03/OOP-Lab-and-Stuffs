import java.util.*;

public class Student extends Person implements AccountSystem {
    private double tutionFee;
    private HashMap<Course, Integer> marks;
    private ArrayList<Course> courses;

    public Student(String name, double tutionFee) {
        super(name, "N/A");
        this.tutionFee = tutionFee;
        this.marks = new HashMap<>();
        this.courses = new ArrayList<>();
    }

    public void addMarks(Course course, int mark) {
        marks.put(course, mark);
    }

    public void addCourse(String name, String code, double fee) {
        Book dummyBook = new Book("Intro", 0);
        Course course = new Course(code, name, dummyBook);
        courses.add(course);
    }

    @Override
    public double getFee() {
        return tutionFee;
    }

    public String toString() {
        return "Student: " + name + ", Tuition Fee: " + tutionFee + ", Courses: " + courses.size();
    }
}

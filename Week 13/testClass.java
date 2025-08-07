import java.util.ArrayList;

public class testClass {
    public static void main(String[] args) {
        Address address = new Address("Paracha Town", "Kohat", "Pakistan");
        Contact phone = new Contact("+92", "26000", "123456");
        Email email = new Email("test123@gmail.com");

        // Student student = new Student("Muhammad Faraz", address, phone, email, "Senior");
        // System.out.println(student.toString());



        Course course1 = new Course("CS-102", "Programming Fundamentals");
        Course course2 = new Course("CS-213", "OOP");


        ArrayList<Course> courses = new ArrayList<>();
        courses.add(course1);
        courses.add(course2);

        Faculty faculty = new Faculty("Emp101", "Mr-XYZ", address, phone, email);
        faculty.addCourse(course1);
        faculty.addCourse(course2);
        System.out.println("------ Faculty Details ------");
        System.out.println(faculty.toString());
        faculty.getCourses();   
    }
}

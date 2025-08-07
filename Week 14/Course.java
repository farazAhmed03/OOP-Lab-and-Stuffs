public class Course implements AccountSystem {
    private String courseCode;
    private String courseName;
    private Book associatedBook;
    private final double registrationFee = 3000;

    public Course(String courseCode, String courseName, Book book) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.associatedBook = book;
    }

    @Override
    public double getFee() {
        return registrationFee;
    }

    public String toString() {
        return "Course: " + courseName + ", Code: " + courseCode + ", Book: " + associatedBook;
    }
}

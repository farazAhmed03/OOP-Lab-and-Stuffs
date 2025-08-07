public class TestApp {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", 700);
        Book b2 = new Book("OOP", 800);

        Course c1 = new Course("C101", "C++", b1);
        Course c2 = new Course("C102", "OOP", b2);

        Staff staff = new Staff("Faraz", 50000);
        staff.addCourse("C101", "Java");
        staff.addCourse("C102", "OOP");

        Student student = new Student("Ahmed", 30000);
        student.addCourse("Java", "C101", 3000);
        student.addMarks(c1, 85);

        Library lib = new Library("Main Library", "0300-0000000");
        lib.addBook(b1);
        lib.addBook(b2);

        // Polymorphic Display
        AccountSystem[] systems = { b1, c1, staff, student, lib };
        for (AccountSystem a : systems) {
            System.out.println(a.toString());
        }

        // Downcasting Book price to 0
        if (systems[0] instanceof Book) {
            Book donated = (Book) systems[0];
            donated.setPrice(0);
            System.out.println("Books are Donated! New Price: " + donated.getFee());
        }
    }
}

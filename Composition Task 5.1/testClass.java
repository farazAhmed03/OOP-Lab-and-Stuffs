public class testClass {
    public static void main(String[] args) {
        Course course1 = new Course("CS102", "Programming Fundamentals");
        PhoneNo phone = new PhoneNo("+92", "26000", "123456");
        Address address = new Address("1", "Paracha Town", "Kohat", "Pakistan", phone);
        Student student1 = new Student("Faraz", "14301-xxyyyzz-123", address);
        student1.setEmail("test123@gmail.com");
        System.out.println("Email : " + student1.getEmail());
        student1.addCourse(course1);
        System.out.println(student1);
        
    }
}

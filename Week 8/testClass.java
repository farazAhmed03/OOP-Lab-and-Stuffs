public class testClass {
    public static void main(String[] args) {
        STUDENT s1 = new STUDENT();
        // DATE date = new DATE("26", "Oct", "2023");
        STUDENT s2 = new STUDENT("CS120212072", "Faraz", 150, date);
    
        UNDERGRADUATE u1 = new UNDERGRADUATE("CS120212072", "Faraz", 130, new DATE("03", "Apr", "2002"), 480);
        POSTGRADUATE p1 = new POSTGRADUATE("CS120212082", "Saad", new DATE("1", "Jan", "2003"), 150, 3.2);

        System.out.println("\n\nNumber of STUDENTs: " + STUDENT.getNoOfStudents());
        System.out.println("\n\nStudent 1:\n" + s1);
        System.out.println("\n\nStudent 2:\n" + s2);
        System.out.println("\n\nUndergraduate Student:\n" + u1);
        System.out.println("\n\nPostgraduate Student:\n" + p1);
    }
}

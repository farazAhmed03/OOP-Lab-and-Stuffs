public class Student {
    private String name, email, cnic;
    private Course course;
    private Address address;

    public Student(String name, String cnic, Address address){
        setName(name);
        setCnic(cnic);
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public void addCourse(Course course){
        this.course = course;
    }

    public Course getCourse(){
        return this.course;
    }


    public String toString(){
        return "Name : " + this.name + "\nCnic : " + this.cnic + "\n\nAddress " + this.address + "\nCourse : " + this.course + "\n";
    }


}

public abstract class Person {
    protected String name;
    protected String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public abstract double getFee();

    public String toString() {
        return name + ", Address: " + address;
    }
}

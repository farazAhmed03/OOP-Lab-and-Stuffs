import java.util.Scanner;

public class homework {

    // --------------------- Data Members -----------------------------
    private double percentage, gpa;
    private Scanner src = new Scanner(System.in);

    // Constructor
    public homework() {
        this.gpa = 0;
        this.percentage = 0;
    }

    // --------------------- Members Function -----------------------------

    public void takeInput() {
        System.out.print("Enter Percentage : ");
        percentage = src.nextDouble();
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage Input!");
        }
    }

    public double calculateGpa() {
        gpa = (percentage / 100) * 4;
        return gpa;
    }

    public void display() {
        if (gpa < 0 || gpa > 4) {
            return;
        }
        System.out.println("(" + percentage + " / 100) * 4 = " + gpa);
    }

    public void timeCalculte() {
    }

    public void convert() {
    }

}

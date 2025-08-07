public class homework {

    // --------------------- Data Members -----------------------------

    private final double DISTANCE, AVG_SPEED, MINUTES;
    private double timeTaken, minutes;

    // Constructor
    public homework() {
        this.DISTANCE = 55;
        this.AVG_SPEED = 15;
        this.MINUTES = 60; // hour = 60min
        this.timeTaken = 0;
        this.minutes = 0;
    }

    // --------------------- Members Function -----------------------------

    // Time Calculation
    public double timeCalculte() {
        timeTaken = DISTANCE / AVG_SPEED;
        return timeTaken;
    }

    // Convert Time Taken To Hours
    public double convert() {
        minutes = timeTaken * MINUTES;
        return minutes;
    }

    // result
    public void display() {
        System.out.println("Time Taken in Hours : " + String.format("%.2f", timeTaken) + "h");
        System.out.println("Time Taken in Minutes : " + String.format("%.2f", minutes) + "m");
    }

}

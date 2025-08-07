public class Decoration extends HouseholdItems {
    private String paint, clock;
    private Additional additionalCharges;

//  Constructor
    public Decoration(String itemName, double purchasePrice, double shippingCost, String paint, String clock, Additional additionalCharges) {
        super(itemName, purchasePrice, shippingCost);
        setPaint(paint);
        setClock(clock);
        setAdditionalCharges(additionalCharges);
    }


//  Setters
    public void setPaint(String paint) {
        this.paint = paint;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public void setAdditionalCharges(Additional additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    public String getPaint() {
        return paint;
    }

    public String getClock() {
        return clock;
    }

    public Additional getAdditionalCharges() {
        return additionalCharges;
    }

//  Calculate TotalSalary
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + getAdditionalCharges().getAdditionalCharges();
    }

//  toString Method
    @Override
    public String toString() {
        return super.toString() + "Paint: " + getPaint() + "\nClock: " + getClock() + "\n" + getAdditionalCharges().toString();
    }
}

public class WashroomItem extends HouseholdItems {
    private String bathHub, sink;
    private double additionalCost;

    // Constructor for washroom item
    public WashroomItem(String itemName, double purchasePrice, double shippingCost, String bathHub, String sink, double additionalCost) {
        super(itemName, purchasePrice, shippingCost);
        setBathHub(bathHub);
        setSink(sink);
        setAdditionalCost(additionalCost);
    }

    // Setters
    public void setBathHub(String bathHub) {
        this.bathHub = bathHub;
    }

    public void setSink(String sink) {
        this.sink = sink;
    }

    public void setAdditionalCost(double additionalCost) {
        this.additionalCost = additionalCost;
    }

    // Getters
    public String getBathHub() {
        return bathHub;
    }

    public String getSink() {
        return sink;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    // Calculate Total Cost
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + getAdditionalCost();
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "BathHub: " + getBathHub() + "\nSink: " + getSink() + "\nAdditionalCost: " + getAdditionalCost() + "\n";
    }
}

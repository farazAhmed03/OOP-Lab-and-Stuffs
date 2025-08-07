public class Additional {
    private String purchaseDate, endDate;
    private double additionalCharges;

    public Additional(String purchaseDate, String endDate, double additionalCharges) {
        this.purchaseDate = purchaseDate;
        this.endDate = endDate;
        this.additionalCharges = additionalCharges;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public double getAdditionalCharges() {
        return additionalCharges;
    }

    @Override
    public String toString() {
        return "Purchase Date: " + getPurchaseDate() + "\nEnd Date: " + getEndDate() + "\nAdditional Charges: " + getAdditionalCharges() + "\n";
    }
}
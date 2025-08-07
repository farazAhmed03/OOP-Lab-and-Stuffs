public class KitchenUtinsiles extends HouseholdItems {
    private Additional warranty;

// Constructor
    public KitchenUtinsiles(String itemName, double purchasePrice, double shippingCost, Additional warranty) {
        super(itemName, purchasePrice, shippingCost);
        setWarranty(warranty);
    }

// Getters and Setters
    public void setWarranty(Additional warranty) {
        this.warranty = warranty;
    }

    public Additional getWarranty() {
        return warranty;
    }

// Override
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + getWarranty().getAdditionalCharges();
    }


//  toString Method
    @Override
    public String toString() {
        return super.toString() + "\nWarranty : " + getWarranty();
    }


}

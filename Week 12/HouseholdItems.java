public class HouseholdItems {

//  Instance Variables 
    private String itemName;
    private double purchasePrice;
    private static double shippingCost;


//  Constructor
    public HouseholdItems(String itemName, double purchasePrice, double shippingCost) {
        setItemName(itemName);
        setPurchasePrice(purchasePrice);
        setShippingCost(shippingCost);
    }



//  Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPurchasePrice(double purchasePrice) {
        if (!isValidValue(purchasePrice)) {
            throw new IllegalArgumentException("Purchase Price must be greater than or equal to Zero");
        }
        this.purchasePrice = purchasePrice;
    }

    public static void setShippingCost(double cost) {
        if (!isValidValue(cost)) {
            throw new IllegalArgumentException("Shipping Cost must be greater than or equal to Zero");
        }
        shippingCost = cost;
    }


//  Getters
    public String getItemName() {
        return itemName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public static double getShippingCost() {
        return shippingCost;
    }

    private static boolean isValidValue(double value) {
        return value >= 0;
    }

    public double calculateTotalCost() {
        return getPurchasePrice() + getShippingCost();
    }




    @Override
    public String toString() {
        return "Item Name: " + getItemName() + "\nPurchase Price: " + getPurchasePrice() + "\nShipping Cost: " + getShippingCost() + "\n";
    }
}
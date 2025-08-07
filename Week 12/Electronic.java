
public class Electronic extends HouseholdItems {

    private Additional warranty;
    private String name, model;
    private double price;


// Constructor
    public Electronic(String itemName, double purchasePrice, double shippingCost, Additional warranty, String name, String model, double price) {
        super(itemName, purchasePrice, shippingCost);
        setWarranty(warranty);
        setName(name);
        setModel(model);
        setPrice(price);
    }




    // Setters
    public void setWarranty(Additional warranty) {
        this.warranty = warranty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }



// Getters
    public Additional getWarranty() {
        return warranty;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }


    // Calculate Total Cost with Additional Cost
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + getPrice() + getWarranty().getAdditionalCharges();
    }


    // toString Method
    @Override
    public String toString() {
        return "Warranty: " + getWarranty().toString() + "\nName: " + getName() + "\nModel: " + getModel() + "\nPrice: " + getPrice();
    }
}

public class Furniture extends HouseholdItems {
    private String material;
    private boolean isAssemblyRequired;
    private Additional serviceCharges;

    // Constructor
    public Furniture(String itemName, double purchasePrice, double shippingCost, String material, boolean isAssemblyRequired, Additional serviceCharges) {
        super(itemName, purchasePrice, shippingCost);
        setMaterial(material);
        setAssemblyRequired(isAssemblyRequired);
        setServiceCharges(serviceCharges);
    }
    

    // Setters
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAssemblyRequired(boolean isAssemblyRequired) {
        this.isAssemblyRequired = isAssemblyRequired;
    }

    public void setServiceCharges(Additional serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    // Getters
    public String getMaterial() {
        return material;
    }

    public boolean isAssemblyRequired() {
        return isAssemblyRequired;
    }

    public Additional getServiceCharges() {
        return serviceCharges;
    }

    // Calculate Total Cost
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost() + serviceCharges.getAdditionalCharges();
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + "Material: " + getMaterial() + "\nAssembly Required: " + isAssemblyRequired() + "\n" + getServiceCharges() + "\n";
    }
}

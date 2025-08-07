public class Edible extends KitchenUtinsiles {
    private boolean isEdible;

    public Edible(String itemName, double purchasePrice, double shippingCost, Additional warranty, boolean isEdible) {
        super(itemName, purchasePrice, shippingCost, warranty);
        setEdible(isEdible);
    }

    public void setEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }

    public boolean getIsEdible() {
        return isEdible;
    }

    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost();
    }

    @Override
    public String toString() {
        return super.toString() + "Is Edible : " + getIsEdible() + "\n";
    }
}

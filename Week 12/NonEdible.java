public class NonEdible extends KitchenUtinsiles {
    private boolean nonEdible;

    public NonEdible(String itemName, double purchasePrice, double shippingCost, Additional warranty, boolean nonEdible) {
        super(itemName, purchasePrice, shippingCost, warranty);
        setEdible(nonEdible);
    }

    public void setEdible(boolean nonEdible) {
        this.nonEdible = nonEdible;
    }

    public boolean getNonEdible() {
        return nonEdible;
    }

    @Override
    public double calculateTotalCost(){
        return super.calculateTotalCost();
    }

    @Override
    public String toString() {
        return super.toString() + "Is Edible : " + getNonEdible() + "\n";
    }
}

class NonEdibleProduct extends Product {
    private boolean nonEdible;
    private static final double TAX_RATE = 0.17;

    public NonEdibleProduct(String productId, String productName, double productPrice, int productQuantity, boolean nonEditble) {
        super(productId, productName, productQuantity, productPrice);
        setEdible(nonEditble);
        
    }

    public void setEdible(boolean nonEdible) {
        this.nonEdible = nonEdible;
    }

    public boolean getNonEdible() {
        return nonEdible;
    }
    
// Overrides the calculatePrice method to enhance functionality by adding tax for non-edible products.
    @Override
    public double calculatePrice() {
        double totalPrice = super.calculatePrice();
        if (getNonEdible()) {
            totalPrice += totalPrice * TAX_RATE;
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return super.toString() + "Is Edible : " + getNonEdible() + "\n";
    }
}
class EdibleProduct extends Product {
    private boolean isEdible;

    public EdibleProduct(String productId, String productName, double productPrice, int productQuantity, boolean isEdible) {
        super(productId, productName, productQuantity, productPrice);
        setEdible(isEdible);
    }

//  Setter 
    public void setEdible(boolean isEdible) {
        this.isEdible = isEdible;
    }

//  Getter
    public boolean getIsEdible() {
        return isEdible;
    }

    @Override
    public String toString() {
        return super.toString() + "IsEdible : " + getIsEdible() + "\n";
    }
}
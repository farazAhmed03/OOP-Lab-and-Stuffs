
public class Product {
    private String productId, productName;
    private int productQuantity;
    private double productPrice;
    final double DISCOUNT = 0.1;        // Additional
    private static int counter = 0;

//  Constructor
    public Product(String ProductId, String productName, int productQuantity, double productPrice) {
        setProductId(ProductId);
        setProductName(productName);
        setProductQuantity(productQuantity);
        setProductPrice(productPrice);
        counter++;
    }

// Setters
    public void setProductId(String productId) {this.productId = productId; }
    public void setProductName(String productName) {this.productName = productName; }
    public void setProductQuantity(int productQuantity) {this.productQuantity = productQuantity; }
    public void setProductPrice(double productPrice) {this.productPrice = productPrice; }



//  Getters
    public String getProductId() { return productId; }
    public String getProductName() { return productName; }
    public int getProductQuantity() { return productQuantity; }
    public double getProductPrice() { return productPrice; }
    public static int countProducts() { return counter; }    




//  Calculate Prices of Items
    public double calculatePrice(){
        double totalPrice = getProductQuantity() *  getProductPrice();
        return totalPrice;
    }

//  ToString Method
    @Override
    public String toString() {
        return "ProductId : " + getProductId() + "\nProductName : " + getProductName() + "\nProductQuantity : " + getProductQuantity() + "\nProductPrice : " + getProductPrice() + "\n";
    }



}

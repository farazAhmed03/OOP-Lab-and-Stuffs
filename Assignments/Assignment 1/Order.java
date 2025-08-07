import java.util.ArrayList;

class Order {
    private String orderId;
    private Date date;
    private ArrayList<Product> productsInOrder;
    private static int totalOrder = 0;

    public Order(String orderId, Date dateOfOrder, ArrayList<Product> products) {
        setOrderId(orderId);
        setDateOfOrder(dateOfOrder);
        setProducts(products);
        totalOrder++;
    }

    
//  Setters
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public void setDateOfOrder(Date date) { this.date = date; }
    public void setProducts(ArrayList<Product> productsInOrder){ this.productsInOrder = productsInOrder; }

    
//  Getters
    public String getOrderId() { return orderId; }
    public Date getDateOfOrder() { return date; }
    public ArrayList<Product> getProductsInOrder() { return productsInOrder; }
    public static int totalOrders(){ return totalOrder; }


//  Add Products
    public void addProduct(Product product) {
        this.productsInOrder.add(product);
    }


//  Remove Product
    public void removeProduct(Product product) {
        if (productsInOrder.isEmpty()) {
            System.out.println("No Product in List!");
            return;
        }
        
        if (productsInOrder.contains(product)) {
            productsInOrder.remove(product);
            System.out.println("Product Removed");
        }
        else{
            System.out.println("Item not Found in List ");
        }
    }

    // TotalPrice
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : productsInOrder) {
            totalPrice += product.calculatePrice();
        }
    
        return totalPrice;
    }
    

//  toString Method
    @Override
    public String toString() {
        return "OrderId : " + getOrderId() + "\n Order Date : " + getDateOfOrder() + "\nProducts In Order : " + getProductsInOrder() + "\n";
    }


    
    

}


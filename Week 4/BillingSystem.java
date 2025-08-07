public class BillingSystem {

//  Private data members
private
    String itemName;
    int itemQuantity;
    double itemPrice;
    double subTotal, totalBill;
    final double TAX_RATE;  // Constant variable Tax


//  Constructor
public
    BillingSystem(String name, int quantity, double price){
        itemName = name;
        itemQuantity = quantity;
        itemPrice = price;
        this.subTotal = 0;
        this.totalBill = 0;
        this.TAX_RATE = 6.25/100;
    }


// Setters methods
public
    void setName(String name){
        itemName = name;
    }

    void setQuantity(int quantity){
        itemQuantity = quantity;
    }

    void setPrice(double price){
        itemPrice = price;
    }


// Getters  methods
public
    String getName(){
        return itemName;
    }

    int getQuantity(){
        return itemQuantity;
    }

    double getPrice(){
        return itemPrice;
    }


// Subtotal
    public double subTotalPrice(){
        subTotal = itemPrice * itemQuantity;
        return subTotal;
    }

// Tax 
    public double tax(){
        double itemTax = subTotalPrice() * TAX_RATE;
        return itemTax;
    }

// Total Bill
    public double result(){
        totalBill = subTotalPrice() + tax();
        return totalBill;
    }


// Display Result
    public void display(){
        System.out.println("ItemName : " + itemName + "\nItem Quantitiy: " + itemQuantity + "\nItemPrice: " + itemPrice);
    }


} // End of Class
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


// toString
    public String toString() {
        return String.format("%-30s %-10d %-10.2f %-10.2f", itemName, itemQuantity, itemPrice, result());
    }

//  Display Result
    public void printResult() {
        double subTotal = subTotalPrice();
        double totalBill = result();
        System.out.printf("\n%-30s %-10s %-10s %-10.2f\n", "Subtotal", "", "", subTotal);
        System.out.printf("%-30s %-10s %-10s %-10.2f\n", "6.25% sales tax", "", "", tax());
        System.out.printf("%-30s %-10s %-10s %-10.2f\n", "Total", "", "", totalBill);
    }



} // End of Class
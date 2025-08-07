import java.util.*;

public class testClass {
    public static void main(String[] args) {
        final int SIZE = 3;
        Scanner src = new Scanner(System.in);


        
// -----------------   Without Array       -----------------
        // Item1 Input
        // System.out.println("Enter Name of Item1 : ");
        // String name1 = src.next();
        // System.out.println("Enter Quantity of Item 1 : ");
        // int quantity1 = src.nextInt();
        // System.out.println("Enter Price of Item 1 : ");
        // double price1 = src.nextDouble();

        // // Item2 Input
        // System.out.println("Enter Name of Item 2 : ");
        // String name2 = src.next();
        // System.out.println("Enter Quantity of Item 2 : ");
        // int quantity2 = src.nextInt();
        // System.out.println("Enter Price of Item 2 : ");
        // double price2 = src.nextDouble();

        // // Item3 Input
        // System.out.println("Enter Name of Item 3 : ");
        // String name3 = src.next();
        // System.out.println("Enter Quantity of Item 3 : ");
        // int quantity3 = src.nextInt();
        // System.out.println("Enter Price of Item 3 : ");
        // double price3 = src.nextDouble();
        
        // src.close();

        // BillingSystem b1 = new BillingSystem(name1, quantity1, price1);
        // BillingSystem b2 = new BillingSystem(name2, quantity2, price2);
        // BillingSystem b3 = new BillingSystem(name3, quantity3, price3);

        // System.out.println("\n\nItem1:");
        // b1.display();

        // System.out.println("\nItem2:");
        // b2.display();
       
        // System.out.println("\nItem3:");
        // b3.display();
        
        // double subTotal = b1.subTotalPrice() + b2.subTotalPrice() + b3.subTotalPrice();
        // double totalBill = b1.result() + b2.result() + b3.result();
        // System.out.println("Subtotal : " + String.format("%.2f", subTotal));
        // System.out.println("\n\nTotal Bill : " + String.format("%.2f", totalBill));




    //--------------------------      Using Array To Take Input    -----------------------------------
        BillingSystem[] items = new BillingSystem[SIZE];
        String name;
        int quantity;
        double price;
        double totalSubTotal = 0.0;
        double totalTax = 0.0;

        for (int i = 0; i < SIZE; i++) {
            System.out.println("Enter Name of Item " + (i + 1) + " : ");
            name = src.next();

            System.out.println("Enter Quantity of Item " + (i + 1) + " : ");
            quantity = src.nextInt();

            System.out.println("Enter Price of Item " + (i + 1) + " : ");
            price = src.nextDouble();

            items[i] = new BillingSystem(name, quantity, price);
            totalSubTotal += items[i].subTotalPrice();
            totalTax += items[i].tax();
        }

    // Display Details
        System.out.println("\n\n Subtotal: " + String.format("%.2f", totalSubTotal));
        System.out.println("Tax 6.25%: " + String.format("%.2f",totalTax));
        System.out.println("Total Bill: " + String.format("%.2f", totalSubTotal + totalTax));
        

        
    src.close();
    }
}
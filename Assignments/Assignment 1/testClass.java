import java.util.ArrayList;

public class testClass {

    public static void main(String[] args) {

        // Instances of Employee and other stuff
        System.out.print("\n\n--------------\t\t  Employee Details     \t\t--------------------\n\n");

        // Contacts
        Contact[] contacts = new Contact[2];
        contacts[0] = new Contact("+92", "26000", "344-*******254");
        contacts[1] = new Contact("+92", "26000", "317-*******123");

        // Address
        Address[] addresses = new Address[2];
        addresses[0] = new Address("1", "Paracha Town", "Kohat", "Pakistan", contacts[0]);
        addresses[1] = new Address("3", "Ghari Town", "Kohat", "Pakistan", contacts[1]);

        // Email
        Email[] email = new Email[2];
        email[0] = new Email("CS120212072@kust.edu.pk");
        email[1] = new Email("CS120212082@kust.edu.pk");
        // email[1] = new Email("CS120212082@gmail.com");

        // Using ArrayList to make Employee Instances
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new HourlyBasedEmployee("1", "Faraz", addresses[0], contacts[0], email[0], "HourlyBaseEmployee", 130, 50000));
        employees.add(new ManagerialEmployee("2", "Saad", addresses[1], contacts[1], email[1], "ManagerialEmployee", 150000));

        // Iterate through Employee
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        // Object of Product Class
        ArrayList<Product> products = new ArrayList<>();
        products.add(new NonEdibleProduct("1001", "Laptop", 10000, 2, false));
        products.add(new EdibleProduct("1002", "Chocolate", 2, 100, true));



        // Date Class Objects
        Date[] dates = new Date[2];
        dates[0] = new Date("1", "1", "2015");
        dates[1] = new Date("30", "2", "2018");

        
        // Order Class Objects
        Order[] orders = new Order[2];
        orders[0] = new Order("1001", dates[0], products);
        orders[1] = new Order("1002", dates[1], products);

        // ArrayList<Order> orders = new ArrayList<>();
        // orders.add(new Order("1001", dates[0], products));
        // orders.add(new Order("1001", dates[1], products));
        // Order firstOrder = orders.get(0);
        // System.out.println(firstOrder);
        
        // TotalPrice and totalProducts

        System.out.println("\n---------- \t\t Total Price of All Products & Total Number of Products    \t\t ----------------------\n");
        // Product counter
        System.out.println("TotalProducts : " + Order.totalOrders());

        // TotalPrice
        double totalOrderPrice = 0.0;
        for (Order order : orders) {
            totalOrderPrice = totalOrderPrice + order.calculateTotalPrice();
        }
        System.out.println("Total Order Price: " + totalOrderPrice);

        

        System.out.println("\n\n");
    }
}

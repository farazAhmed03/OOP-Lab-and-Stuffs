import java.util.Scanner;

public class testVehicale {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
    
        OWNER owner = new OWNER("Ahmed Faraz", "test123");
        CAR car = new CAR("2009", "White", 3000000, 4, 5, "Toyota");
        
        System.out.println("-------------\t\t     Owner Details  \t\t--------------------");
        System.out.print(owner.toString());
        System.out.println("\n------------- \t\t     Car Details  \t\t--------------------");
        System.out.println(car.toString());


    // Write Changes in Vehicale

        System.out.println("\n\n---------\t\t     Rewrite Needed Details   \t\t---------------------\n");
        System.out.print("Enter New Model : ");
        String model = src.nextLine();
        // System.out.print("Enter new Color : ");
        // String color = src.nextLine();
        // System.out.print("Enter new Car Type : ");
        // String carType = src.nextLine();
        System.out.print("Enter Price : ");
        double price = src.nextDouble();

        car.setModel(model);
        // car.setColor(color);
        // car.setCarType(carType);
        car.setPrice(price);

        System.out.println("\n\n---------\t\t     New Details   \t\t---------------------\n\n");
        System.out.println("-------------\t\t     Owner Details  \t\t--------------------");
        System.out.print(owner.toString());
        System.out.println("\n------------- \t\t  Car Details     \t\t--------------------");
        System.out.println(car.toString());

        System.out.println("New Model : " + car.getModel());
        // System.out.println("New Color : " + car.getColor());
        // System.out.println("New Car Type : " + car.getCarType());
        System.out.println("New Price : " + car.getPrice());

        src.close();

    }    
}

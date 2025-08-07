// import java.util.ArrayList;
// import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        // Scanner src = new Scanner(System.in);
        final int SIZE = 4;

        // ArrayList<Employee> employees = new ArrayList<>(SIZE);

        Employee[] employees = new Employee[SIZE];
        employees[0] = new BasePlusCommissioned("Faraz", "Ahmed", "CS72", 500.00, 10.00, 5000);
        employees[1] = new HourlyBasedEmployee("Muhammad", "Saad", "CS82", 45, 1000.00);
        employees[2] = new PieceWorker("Muhammad", "Siddique", "CS86", 2000.00, 10);
        employees[3] = new SalaryBasedEmployee("Zahid", "Jan", "CS89", 50000);

        System.out
                .println("\n\n----------------\t\t  Employees Details      \t\t ---------------------------------\n\n");
        for (Employee employee : employees) {
            if (employee instanceof BasePlusCommissioned) {
                System.out.println("Base Plus Commissioned Employee \n");
            } else if (employee instanceof HourlyBasedEmployee) {
                System.out.println("Hourly Based Employee \n");
            } else if (employee instanceof PieceWorker) {
                System.out.println("Piece Worker \n");
            } else if (employee instanceof SalaryBasedEmployee) {
                System.out.println("Salary Based Employee \n");
            }

            System.out.println(employee.toString());
        }






//      Working with Inputs

        // while (employees.size() < 4) {
        //     System.out.println(
        //             "Enter employee type (1 for BasePlusCommissioned, 2 for HourlyBasedEmployee, 3 for PieceWorker, 4 for SalaryBasedEmployee, 0 to exit): ");
        //     int employeeType = src.nextInt();
        //     src.nextLine(); // Consume the newline character

        //     // if (employeeType == 0) {
        //     //     break;
        //     // }

        //     switch (employeeType) {
        //         case 1:
        //             System.out.println("Enter Base Plus Commissioned Employee details:");
        //             System.out.print("Enter first name: ");
        //             String firstName = src.nextLine();
        //             System.out.print("Enter last name: ");
        //             String lastName = src.nextLine();
        //             System.out.print("Enter social security number: ");
        //             String socialSecurityNumber = src.nextLine();
        //             System.out.print("Enter gross sale: ");
        //             double grossSale = src.nextDouble();
        //             System.out.print("Enter commission rate: ");
        //             double commissionRate = src.nextDouble();
        //             System.out.print("Enter base salary: ");
        //             double baseSalary = src.nextDouble();
        //             employees.add(new BasePlusCommissioned(firstName, lastName, socialSecurityNumber, grossSale, commissionRate, baseSalary));
        //             break;

        //         case 2:
        //             System.out.println("Enter Hourly Based Employee details:");
        //             System.out.print("Enter first name: ");
        //             String firstNameHourly = src.nextLine();
        //             System.out.print("Enter last name: ");
        //             String lastNameHourly = src.nextLine();
        //             System.out.print("Enter social security number: ");
        //             String socialSecurityNumberHourly = src.nextLine();
        //             System.out.print("Enter hours worked: ");
        //             double hoursWorked = src.nextDouble();
        //             System.out.print("Enter hourly rate: ");
        //             double hourlyRate = src.nextDouble();

        //             employees.add(new HourlyBasedEmployee(firstNameHourly, lastNameHourly, socialSecurityNumberHourly, hoursWorked, hourlyRate));
        //             break;

        //         case 3:
        //             System.out.println("Enter Piece Worker details:");
        //             System.out.print("Enter first name: ");
        //             String firstNamePieceWorker = src.nextLine();
        //             System.out.print("Enter last name: ");
        //             String lastNamePieceWorker = src.nextLine();
        //             System.out.print("Enter social security number: ");
        //             String socialSecurityNumberPieceWorker = src.nextLine();
        //             System.out.print("Enter wage per piece: ");
        //             double wagePerPiece = src.nextDouble();
        //             System.out.print("Enter number of pieces: ");
        //             int numberOfPieces = src.nextInt();

        //             employees.add(new PieceWorker(firstNamePieceWorker, lastNamePieceWorker, socialSecurityNumberPieceWorker, wagePerPiece, numberOfPieces));
        //             break;

        //         case 4:
        //         
        //              break;

        //         default:
        //             System.out.println("Invalid employee type! Please enter a number between 1 and 4");
        //     }
        // }

        // src.close();

    }
}

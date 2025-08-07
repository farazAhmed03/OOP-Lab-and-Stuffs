public class testClass {
    public static void main(String[] args) {
        // Creating instances for demonstration
        Additional additional1 = new Additional("2023-01-01", "2023-12-31", 50.0);
        HouseholdItems[] items = {
                new Decoration("Vase", 25.0, 5.0, "Red", "Antique", additional1),
                new Edible("Cutlery Set", 30.0, 7.0, additional1, true),
                new Electronic("Smart Speaker", 100.0, 10.0, additional1, "Smart", "ModelX", 150.0),
                new Furniture("Table", 50.0, 8.0, "Wood", true, additional1),
                new NonEdible("Plastic Utensils", 15.0, 3.0, additional1, false),
                new WashroomItem("Towel Set", 20.0, 6.0, "Large", "Porcelain", 8.0)
        };

        // Displaying information using polymorphic behavior
        for (HouseholdItems item : items) {
            System.out.println("Item Type: " + item.getClass().getSimpleName());
            System.out.println("Details: " + item.toString());
            System.out.println("Total Cost : " + item.calculateTotalCost());
            System.out.println("--------------------------");
        }
    }
}

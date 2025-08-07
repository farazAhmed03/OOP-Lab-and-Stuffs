public class CAR extends VEHICALE {
    private int noOfDoors, seatingCapacity;
    private String carType;

//  Constructor
    public CAR(String model, String color, double price, int noOfDoors, int seatingCapacity, String carType) {
        super(model, color, price);

        if (noOfDoors < 2 || noOfDoors > 4) {
            throw new IllegalArgumentException("Given Doors are not Correct !");
        }
        
        setNoOfDoors(noOfDoors);
        setCarType(carType);
        setSeatingCapacity(seatingCapacity);
    }


//  Setters
    public void setNoOfDoors(int noOfDoors) { this.noOfDoors = noOfDoors; }
    public void setCarType(String carType) { this.carType = carType; }
    public void setSeatingCapacity(int seatingCapacity) { this.seatingCapacity = seatingCapacity; }
    
//  Getters
    public int getNoOfDoors() { return noOfDoors; }
    public String getCarType() { return carType; }
    public int getSeatingCapacity() { return seatingCapacity; }


//  toString() Method
    public String toString() {
        return super.toString() + "\nNumber of Doors : " + noOfDoors + "\nSeatingCapacity : " + seatingCapacity + "\nCarType : " + carType + "\n";
    }
    

}

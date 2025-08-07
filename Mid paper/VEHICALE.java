public class VEHICALE {
    private String model, color;
    private double price;
    private OWNER owner;

//  Constructor
    public VEHICALE (String model, String color, double price){
        setModel(model);
        setColor(color);
        setPrice(price);
    }

//  Setters
    public void setModel(String model) { this.model = model; }
    public void setColor(String color) { this.color = color; }
    public void setPrice(double price) { this.price = price; }
    public void setOwner(OWNER owner){ this.owner = owner; }        // Set Owner
    
    
//  Getters
    public String getModel() { return this.model; }
    public String getColor() { return this.color; }
    public double getPrice() { return this.price; }
    public OWNER getOwner(){ return this.owner; }   // Get Owner

    

    

//  toString Method
    // public String toString() {
    //     return "Model : " + this.model + "\nColor : " + this.color + "\nPrice : " + this.price + "\n";
    // }
    
    public String toString() {
        return String.format("Model: %s%nColor: %s%nPrice: %s", model, color, price);
    }
    
    
    
}
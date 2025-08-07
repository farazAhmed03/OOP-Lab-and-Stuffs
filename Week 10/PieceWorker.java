public class PieceWorker extends Employee{
    private double wage, pieces;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setPieces(pieces);
    }

//  Setters
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

//  Getters
    public double getWage() {
        return wage;
    }

    public double getPieces() {
        return pieces;
    }

// earning method
    double earning(){
        double totalSalary = getWage() * getPieces();
        return totalSalary;
    }

    @Override
    public String toString() {
        return super.toString() + "Wage : " + getWage() + "\nPieces : " + getPieces() + "\nEarning : " + earning() + "\n";
    }
    
}

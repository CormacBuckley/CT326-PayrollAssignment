//Cormac Buckley 15534413

import java.time.LocalDate;

// PieceWorker class derived from Employee

public final class PieceWorker extends Employee {

    private double wagePerPiece; // wage per piece output
    private int quantity; // output for week
    private int bonus = 0;

    // constructor for class PieceWorker
    public PieceWorker(String first, String last,LocalDate joinDate, double wage, int numberOfItems) {
        super(first, last, joinDate); // call superclass constructor
        setWage(wage + bonus);
        setQuantity(numberOfItems);
    }

    // set PieceWorker's wage
    public void setWage(double wage) {
    	//Altered to allow for exception 
        wagePerPiece = wage; //(wage > 0 ? wage : 0);
    }

    // set number of items output
    public void setQuantity(int numberOfItems) {
    	//Altered to allow for exception 
        quantity = numberOfItems;//(numberOfItems > 0 ? numberOfItems : 0);
    }

    // determine PieceWorker's earnings
    public double earnings() {
        return (quantity * wagePerPiece) + bonus;
    }

    public String toString() {
        return "Piece worker: " + super.toString();
    }

	@Override
	public void giveBonus() {
		bonus+=200;
		
	}
}

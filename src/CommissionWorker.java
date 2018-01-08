//Cormac Buckley 15534413

import java.time.LocalDate;

// CommissionWorker class derived from Employee

public final class CommissionWorker extends Employee {

    private double salary; // base salary per week
    private double commission; // amount per item sold
    private int quantity; // total items sold for week

    // constructor for class CommissionWorker
    public CommissionWorker(String first, String last, LocalDate joinDate, double salary, double commission, int quantity) {
        super(first, last, joinDate); // call superclass constructor
        setSalary(salary);
        setCommission(commission);
        setQuantity(quantity);
    }

    // set CommissionWorker's weekly base salary
    public void setSalary(double weeklySalary) {
    	//Altered to allow for exception 
    	 weeklySalary = salary; //(weeklySalary > 0 ? weeklySalary : 0);
    }

    // set CommissionWorker's commission
    public void setCommission(double itemCommission) {
    	//Altered to allow for exception 
        commission = itemCommission; //(itemCommission > 0 ? itemCommission : 0);
    }

    // set CommissionWorker's quantity sold
    public void setQuantity(int totalSold) {
        quantity = totalSold;//(totalSold > 0 ? totalSold : 0);
    }

    // determine CommissionWorker's earnings
    public double earnings() {
        return salary + commission * quantity;
    }

    // get String representation of CommissionWorker's name
    public String toString() {
        return "Commission worker: " + super.toString();
    }

	@Override
	public void giveBonus() {
		salary+=200;
		
	}
} // end class CommissionWorker

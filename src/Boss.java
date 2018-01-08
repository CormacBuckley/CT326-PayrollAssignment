//Cormac Buckley 15534413

import java.time.LocalDate;

// Boss class derived from Employee.

public final class Boss extends Employee {

    private double weeklySalary;

    // constructor for class Boss
    public Boss(String first, String last, double salary, LocalDate joinDate) {
        super(first, last, joinDate); // call superclass constructor
        setWeeklySalary(salary);
    }

    // set Boss's salary
    public void setWeeklySalary(double salary) {
    	//Altered to allow for exception 
        weeklySalary = salary; //(salary > 0 ? salary : 0);
    }

    // get Boss's pay
    public double earnings() {
        return weeklySalary;
    }

    // get String representation of Boss's name
    public String toString() {
        return "Boss: " + super.toString();
    }

	@Override
	public void giveBonus() { //Applies a salary bonus when called 
		 weeklySalary += 200;
	}
} // end class Boss

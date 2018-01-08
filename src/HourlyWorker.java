
//Cormac Buckley 15534413

import java.time.LocalDate;

// Definition of class HourlyWorker

public final class HourlyWorker extends Employee {

	private double wage; // wage per hour
	private double hours; // hours worked for week
	private double bonus;

	// constructor for class HourlyWorker
	public HourlyWorker(String first, String last, LocalDate joinDate, double wagePerHour, double hoursWorked) {
		super(first, last, joinDate); // call superclass constructor
		setWage(wagePerHour);
		setHours(hoursWorked);
	}

	// Set the wage
	public void setWage(double wagePerHour) {
		// Altered to allow for exception
		wage = wagePerHour; // (wagePerHour > 0 ? wagePerHour : 0);
	}

	// Set the hours worked
	public void setHours(double hoursWorked) {
        hours = hoursWorked;//(hoursWorked >= 0 && hoursWorked < 168 ? hoursWorked : 0);
    }

	// Get the HourlyWorker's pay
	public double earnings() {
		return (wage * hours) + bonus;
	}

	public String toString() {
		return "Hourly worker: " + super.toString();
	}

	@Override
	public void giveBonus() {
		bonus += 200;

	}
}

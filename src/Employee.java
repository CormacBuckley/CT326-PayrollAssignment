
//Cormac Buckley 15534413

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

// Abstract base class Employee.

public abstract class Employee {

	private String firstName;
	private String lastName;
	private LocalDate joinDate;
	static AtomicInteger nextId = new AtomicInteger();
	private int ID;

	// constructor
	public Employee(String first, String last, LocalDate join) {
		firstName = first;
		lastName = last;
		joinDate = join;
		ID = nextId.incrementAndGet();
	}

	// get first name
	public String getFirstName() {
		return firstName;
	}

	// get last name
	public String getLastName() {
		return lastName;
	}

	public LocalDate getJoinDate() {
		return joinDate;
	}

	public int getID() {
		return ID;
	}
	
	// toString method now includes ID no and start date of each employee
	public String toString() {
		return firstName + ' ' + lastName + ", " + "ID no: " + getID() + "," + " Start Date: " + joinDate;
	}

	public abstract double earnings() throws EmployeeEarningsException;

	public abstract void giveBonus();
}

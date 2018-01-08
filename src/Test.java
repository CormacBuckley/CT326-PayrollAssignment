//Cormac Buckley 15534413

// Driver for Employee hierarchy

// Java core packages
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.joda.time.DateTime;

// Java extension packages
import javax.swing.JOptionPane;

public class Test {

	// test Employee hierarchy
	public static void main(String args[]) throws EmployeeEarningsException {
		
		ArrayList<Employee> emp = new ArrayList<Employee>(); //Using an arraylist to store the employee objects
		Employee employee; // superclass reference
		String output = "";

		LocalDate today = LocalDate.now(); //Setting todays date for employee check 

		// Assigning various start dates to varibles
		LocalDate a = LocalDate.of(2000, 04, 03);
		LocalDate b = LocalDate.of(2008, 8, 15);
		LocalDate c = LocalDate.of(2015, 9, 10);
		LocalDate d = LocalDate.of(2001, 01, 6);

		
		//Creating various employee objects
		Boss boss = new Boss("John", "Smith", 1800.0, a);

		CommissionWorker commissionWorker = new CommissionWorker("Sue", "Jones", b, 400.0, 3.0, 150);

		
		//Testing below for negative earnings 
		PieceWorker pieceWorker = new PieceWorker("Bob", "Lewis", c, 2.5, -200);

		HourlyWorker hourlyWorker = new HourlyWorker("Karen", "Price", d, -13.75, 40);

		
		//Adding employee objects to arraylist
		emp.add(boss);
		emp.add(commissionWorker);
		emp.add(pieceWorker);
		emp.add(hourlyWorker);

		DecimalFormat precision2 = new DecimalFormat("0.00");

		
		//Payroll loop with error handling 
		for (int i = 0; i < emp.size(); i++) {
			try {
				if (emp.get(i).earnings() < 0) {
					//Prints out employees name followed by error message
					throw new EmployeeEarningsException("Invalid Wage: " + emp.get(i).earnings() + ". " + emp.get(i).getFirstName() + "'s earnings cannot be negative. The government isn't that bad.");
				}

			//Checking employee join date for bonus awarding using my giveBonus method
			if (emp.get(i).getJoinDate().getYear() < (today.getYear() - 5)) {
				emp.get(i).giveBonus();
				output += emp.get(i).toString() + " earned $" + precision2.format(emp.get(i).earnings() * 4) + " With $200 bonus" + "\n";
			} else {
				output += emp.get(i).toString() + " earned $" + precision2.format(emp.get(i).earnings() * 4) + " No bonus awarded" + "\n";
			}
			} catch (EmployeeEarningsException err) {
				System.out.println(err.getMessage());
				output += emp.get(i).toString() + " earned $" + "0" + "\n";
				
			}
		}
			

		JOptionPane.showMessageDialog(null, output, "Monthly Payroll Run", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
} // end class Test

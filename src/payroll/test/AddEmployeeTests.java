package payroll.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddEmployeeTests {

	@Test
	void testAddHourlyEmployee() {
		// Assumptions
		int empId = 1001;
		String name = "Bill";
		String address = "Home";
		double hourlyRate = 12.5;
		// Actions
		Transaction t = new AddHourlyEmployeeTransaction(
						empId, name, address, hourlyRate);
		t.execute();
				
	}
	
}

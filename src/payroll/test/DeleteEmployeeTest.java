package payroll.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import payroll.trans.AddHourlyEmployeeTransaction;

public class DeleteEmployeeTest {

	@Test
	public void testDeleteEmployeeExisted() {
		
		int empId = 2001;
		new AddHourlyEmployeeTransaction(empId,"Bill","Home",12.5).execute();
	}

}

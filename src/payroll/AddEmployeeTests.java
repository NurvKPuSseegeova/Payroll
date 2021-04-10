package payroll;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import payroll.Employee;
import payroll.PaymentClassification;
import payroll.PaymentMethod;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.clasification.SalariedClassification;
import payroll.classification.HourlyClassification;
import payroll.method.HoldMethod;
import payroll.trans.AddHourlyEmployeeTransaction;
import payroll.trans.AddSalariedEmployeeTransaction;

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
		// Assertions
		Employee e = PayrollDatabase.getEmployee(empId);
		assertNotNull(e);
		assertEquals(empId, e.getEmpId());
		assertEquals(name, e.getName());
		assertEquals(address, e.getAddress());
		PaymentClassification pc = e.getPaymentClassification();
		assertTrue(pc instanceof HourlyClassification);
		HourlyClassification hc = (HourlyClassification) pc;
		assertEquals(hourlyRate, hc.getHourlyRate(), 0.01);
		PaymentMethod pm = e.getPaymentMethod();
		assertTrue(pm instanceof HoldMethod);
	}
	

@Test
public void testAddSalariedEmployee() {
	int empId = 1002;
	String name = "Bill";
	String address = "Home";
	double salary = 2410.0;
	
	Transaction t = new AddSalariedEmployeeTransaction(empId, name, address, salary);
	t.execute();
	Employee e = PayrollDatabase.getEmployee(empId);
	assertNotNull(e);
	assertEquals(name, e.getName());
	assertEquals(address, e.getAddress());
	PaymentClassification pc = e.getPaymentClassification();
	assertTrue(pc instanceof SalariedClassification);
	SalariedClassification sc = (SalariedClassification) pc;
	assertEquals(salary, sc.getSalary(), 0.01);
	PaymentMethod pm = e.getPaymentMethod();
	assertTrue(pm instanceof HoldMethod);
}
}

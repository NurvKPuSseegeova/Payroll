package payroll.trans;

import payroll.Employee;
import payroll.PaymentClassification;
import payroll.PayrollDatabase;
import payroll.Transaction;
import payroll.method.HoldMethod;

public abstract class AddEmployeeTransaction {

	protected int empId;

	protected abstract PaymentClassification getPaymentClassification();

	protected String name;
	protected String address;

	public AddEmployeeTransaction() {
		super();
	}

	public void execute() {
		
		Employee e = new Employee(empId, name, address);
		e.setPaymentClassification(getPaymentClassification());
		e.setPaymentMethod(new HoldMethod());
		PayrollDatabase.save(e);
	}

}
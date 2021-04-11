package payroll.classification;

import payroll.PaymentClassification;

public class CommissionedClassification extends PaymentClassification {

	private double commissionRate;

	public CommissionedClassification(double salary, double commissionRate) {
		this.commissionRate = commissionRate;
		
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public double getCommissionRate() {
		// TODO Auto-generated method stub
		return 0;
	}

}

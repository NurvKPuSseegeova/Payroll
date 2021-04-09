package payroll;

import java.util.LinkedHashMap;
import java.util.Map;

public class PayrollDatabase {
	
	private static Map<Integer, Employee> employees = new LinkedHashMap<>();

	public static Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return employees.get(empId);
	}

	public static void save(Employee e) {
		// TODO Auto-generated method stub
		employees.put(e.getEmpId(),e);
	}

}

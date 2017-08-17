package view;

import controller.Register;
import model.Employee;

public class App {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		Register reg = new Register();
		
		emp.setIDWipro(385653);
		emp.setName("Jessica");
		emp.setEmail("jessica.tereda@wipro.com");
		emp.setManageId(659854);
		
		reg.addEmployee(emp);
	}

}

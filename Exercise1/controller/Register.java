package controller;
import java.util.HashSet;
import java.util.Set;

import model.Employee;

public class Register {

	private Set<Employee> employees = new HashSet<Employee>();
	
	public void addEmployee(Employee employee) {
		EmployeeCounter ec = EmployeeCounter.getInstance();
		EmployeeCounter.increase();			
		employee.setIDClient(EmployeeCounter.getNumber());
		
		employees.add(employee);
		notify(employee);
	}
	
	protected void notify(Employee e)  {	    
	   //TODO: send e-mail manager
	}
	
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public Set<Employee> getEmployees(){
		return this.employees;
	}
}

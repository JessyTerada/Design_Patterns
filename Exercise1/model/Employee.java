package model;

import java.util.HashSet;
import java.util.Set;

import controller.Register;

public class Employee {

	private String name;
	private int wiproId;
	private int clientId;
	private String email;
	private int manageId;
	
	public int getManageId() {
		return manageId;
	}

	public void setManageId(int manageId) {
		this.manageId = manageId;
	}

	private Set<Employee> employees = new HashSet<Employee>(); 
	
	public void registerMe() {
		//TODO: implement
	}
	
	private Register register;
	public Set<Employee> listCollegues(){
		return register.getEmployees();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIDWipro() {
		return wiproId;
	}
	public void setIDWipro(int iDWipro) {
		wiproId = iDWipro;
	}
	public int getIDClient() {
		return clientId;
	}
	public void setIDClient(int iDClient) {
		clientId = iDClient;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
}

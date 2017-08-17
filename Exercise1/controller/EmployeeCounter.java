package controller;

public class EmployeeCounter {

	private static int number = 1;
	
	private static EmployeeCounter instance = new EmployeeCounter();
	
	public static EmployeeCounter getInstance() {
		return instance;
	}
	
	public static void increase() {
		number++;
	}
	
	public static int getNumber() {
		return number;
	}
}

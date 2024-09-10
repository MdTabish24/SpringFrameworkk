package com.springcore;

public class Employee {
	private String EmpName;
	private int empsalary;
	private String empaddress;
	
	
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		System.out.println("Name has been set");
		EmpName = empName;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		System.out.println("salary has been set");
		this.empsalary = empsalary;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		System.out.println("address has been set");
		this.empaddress = empaddress;
	}
	
	
	public Employee(String empName, int empsalary, String empaddress) {
		super();
		EmpName = empName;
		this.empsalary = empsalary;
		this.empaddress = empaddress;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Employee [EmpName=" + EmpName + ", empsalary=" + empsalary + ", empaddress=" + empaddress + "]";
	}
	
	
	
	
}

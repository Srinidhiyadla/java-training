package com.evoke.arrays;

public class EmployeeDetails {
	int emp_id;
	String emp_name,emp_address;
	

	public int getEmp_id() {
		return emp_id;
	}


	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}


	public String getEmp_name() {
		return emp_name;
	}


	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}


	public String getEmp_address() {
		return emp_address;
	}


	public void setEmp_address(String emp_address) {
		this.emp_address = emp_address;
	}


	@Override
	public String toString() {
		return "EmployeeDetails [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_address=" + emp_address + "]";
	}

public static class Employee
{
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		emp.setEmp_id(47);
		emp.setEmp_name("Sai");
		emp.setEmp_address("Hyderabad");
		
		System.out.println(emp);
		
	}
	
	}

}

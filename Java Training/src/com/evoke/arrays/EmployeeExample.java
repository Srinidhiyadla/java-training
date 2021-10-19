package com.evoke.arrays;

public class EmployeeExample {

	public static void main(String[] args) {
	Employee[] obj = new Employee[2];
	
	obj[0] = new Employee(512,"Rithik");
	obj[1] = new Employee(247,"Karthik");
	
	System.out.println("Employee Object 1:");
	obj[0].display();
	System.out.println("Employee Object 2:");
	obj[1].display();
	}
}
class Employee {
	int emp_id;
	String emp_name;
	Employee(int eid,String n) 
	{
		emp_id = eid;
		emp_name = n;
	}
	
	public void display() {
		System.out.print("EmpId ="+emp_id + " " + "Employee name = "+emp_name);
		System.out.println();
	}

	}


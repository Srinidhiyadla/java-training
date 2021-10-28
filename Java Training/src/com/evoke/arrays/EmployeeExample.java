package com.evoke.arrays;

public class EmployeeExample {

	public static void main(String[] args) {
	Employee[] obj = new Employee[6];
	
	obj[0] = new Employee(512,"Karthik");
	obj[1] = new Employee(842,"Neha");
	obj[2] = new Employee(247,"Rithik");
	obj[3] = new Employee(215,"Pooja");
	obj[4] = new Employee(378,"Harsha");
	obj[5] = new Employee(783,"Kumar");
	
	System.out.println("Employee Object 1:");
	obj[0].display();
	System.out.println("Employee Object 2:");
	obj[1].display();
	System.out.println("Employee Object 3:");
	obj[2].display();
	System.out.println("Employee Object 4:");
	obj[3].display();
	System.out.println("Employee Object 5:");
	obj[4].display();
	System.out.println("Employee Object 6:");
	obj[5].display();
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

	public static int getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	}


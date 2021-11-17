package com.evoke.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparator {
		 int ID;
		 String name,address;
		public EmployeeComparator(int rollno,String name, String address) {
			this.ID=rollno;
			this.name=name;
			this.address=address;
		}

		public String tostring() {
			return this.ID+" "+this.name+" "+this.address;
		}
}
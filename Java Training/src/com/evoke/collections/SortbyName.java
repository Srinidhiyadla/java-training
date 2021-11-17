package com.evoke.collections;

import java.util.Comparator;

	 class SortbyName implements Comparator<EmployeeComparator> {
			public int compare(EmployeeComparator a,EmployeeComparator b)
			{
				/*if(a.ID>b.ID)
					return 1;
					return -1;*/
			
			
				return a.name.compareTo(b.name);
			
		}
	 }


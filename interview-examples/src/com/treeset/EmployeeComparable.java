package com.treeset;

import java.util.Comparator;

public class EmployeeComparable implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getDesignation().equals(emp2.getDesignation()) )
			return 0;			
		else if(emp1.getSubOrdinateDesignations().contains(emp2.getDesignation()) )
		{
			return -1;
		}
		else if (emp2.getSubOrdinateDesignations().contains(emp1.getDesignation()))
		return 1;
		return 1;
	}


	
	

}

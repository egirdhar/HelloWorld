package com.treeset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		
		List<Designation> subOrdinateDesignations1 = new ArrayList<>();
		
		subOrdinateDesignations1.add(Designation.TEAMLEAD);
		subOrdinateDesignations1.add(Designation.ARCHITECT);
		subOrdinateDesignations1.add(Designation.MODULELEAD);
		subOrdinateDesignations1.add(Designation.SOFTENGINEER);
		
		List<Designation> subOrdinateDesignations2 = new ArrayList<>();
		
		subOrdinateDesignations2.add(Designation.TEAMLEAD);		
		subOrdinateDesignations2.add(Designation.MODULELEAD);
		subOrdinateDesignations2.add(Designation.SOFTENGINEER);
		
		List<Designation> subOrdinateDesignations3 = new ArrayList<>();
						
		subOrdinateDesignations3.add(Designation.MODULELEAD);
		subOrdinateDesignations3.add(Designation.SOFTENGINEER);
		
		Employee employee1= new Employee("Rajesh", Designation.MANAGER, 23445, subOrdinateDesignations1);
		
		Employee employee2= new Employee("Anuj", Designation.ARCHITECT, 26445, subOrdinateDesignations2);
		
		Employee employee3= new Employee("Kapil", Designation.TEAMLEAD, 28445, subOrdinateDesignations3);
		
	    Set<Employee> employees = new TreeSet<Employee>(new EmployeeComparable());
	    
	    employees.add(employee3);
	    employees.add(employee1);
	    employees.add(employee2);
	    
	    for(Employee employee: employees ){
	    	System.out.println(employee.getDesignation());
	    }
	}
}

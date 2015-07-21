package com.treeset;

import java.util.List;

enum Designation  {MANAGER, TEAMLEAD,ARCHITECT, SOFTENGINEER, MODULELEAD};
public class Employee {

	private String name;
	private int empId;	
	private Designation designation;
	private List<Designation> subOrdinateDesignations;
	
	public Employee(String name , 
			Designation designation,int empId, List<Designation> subOrdinateDesignations ) {
		this.subOrdinateDesignations=subOrdinateDesignations;
		this.empId =empId;
		this.name =name;
		this.designation=designation;
	}

	public List<Designation> getSubOrdinateDesignations() {
		return subOrdinateDesignations;
	}
	
	public Designation getDesignation(){
		return designation;
	}
	
	
	
}

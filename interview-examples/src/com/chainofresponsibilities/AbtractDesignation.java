package com.chainofresponsibilities;

 enum DESIGNATION  { MANAGER,TEAMLEAD, SRSOFTENGINEER, SOFTENGINEER }; 

public abstract class AbtractDesignation {

	 protected DESIGNATION designation;
	 protected DESIGNATION subOrdinateDesignation;
	 
	 private AbtractDesignation nextDesignation;
	 
	 public void setNextDesignation(AbtractDesignation nextDesignation){
		 this.nextDesignation = nextDesignation;
	 }
	 
	 
		 
	 
	 void doAccessPerformance(AbtractDesignation currentDesignationInChain, DESIGNATION designationInChain) {
			System.out.println(currentDesignationInChain.designation  + " accessing performance of "+ designationInChain);
			
	}
	 public void accessPerformance(AbtractDesignation currentDesignationInChain, DESIGNATION designationInChain){
		 if(currentDesignationInChain.subOrdinateDesignation.equals(designationInChain)){
			 doAccessPerformance(currentDesignationInChain,designationInChain);
			 return;
		 }
		if(currentDesignationInChain.nextDesignation != null)
			accessPerformance(currentDesignationInChain.nextDesignation, designationInChain);
		else
			accessPerformance(currentDesignationInChain, designationInChain);
			 
		
	 }
	 
	 
}

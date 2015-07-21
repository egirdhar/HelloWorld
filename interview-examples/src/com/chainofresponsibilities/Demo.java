package com.chainofresponsibilities;

public class Demo {

	public static void main(String[] args) {
		AbtractDesignation firstDesignationInChain =makeChain();		
		firstDesignationInChain.accessPerformance(firstDesignationInChain,DESIGNATION.TEAMLEAD);
	}
	
	public static AbtractDesignation makeChain(){
		
		AbtractDesignation srSoftEnggDesignation = new TeamLeadDesignation(DESIGNATION.SRSOFTENGINEER,DESIGNATION.SOFTENGINEER);
		AbtractDesignation teamLeadDesignation = new TeamLeadDesignation(DESIGNATION.TEAMLEAD,DESIGNATION.SRSOFTENGINEER);
		AbtractDesignation managerDesignation = new ManagerDesignation(DESIGNATION.MANAGER,DESIGNATION.TEAMLEAD);
		srSoftEnggDesignation.setNextDesignation(teamLeadDesignation);
		teamLeadDesignation.setNextDesignation(managerDesignation);
		return srSoftEnggDesignation;
	}
}

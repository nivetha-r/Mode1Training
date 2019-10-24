package com.hcl.obj;

public class Agent {
	
	public StringBuilder show(String agentId,String fullName,int maritalstatus,String zipCode){
		StringBuilder sbError=new StringBuilder();
		boolean isvalid=true;
		if(!(agentId.charAt(0)=='A')){
			sbError.append("agentId must starts with A" + "\r\n");
			isvalid=false;
		}
		if(fullName.indexOf(' ')==-1){
			sbError.append("fullName must contain space" + "\r\n");
			isvalid=false;
		}
		if(fullName.length()>20){
			sbError.append("fullName cannot cross 20 chars" + "\r\n");
			isvalid=false;
		}
		if(maritalstatus>=2){
			sbError.append("maritalstatus shuld be either 0 or 1" + "\r\n");
			isvalid=false;
		}
		if(zipCode.length()>=6){
			sbError.append("zipcode contains only 6 chars"  +"\r\n");
			isvalid=false;
			
		}
		if(isvalid==true){
			
			sbError.append("agentId "+agentId + "\r\n");
			sbError.append("fullName "+fullName+ "\r\n");
			sbError.append("maritalstatus "+maritalstatus+ "\r\n");
			sbError.append("zipCode "+zipCode +"\r\n");
			
		}
		return sbError;
	}
	
	public static void main(String[] args) {
		String agentId;
		String fullName;
		int maritalstatus;
		String zipCode;
		agentId="A99";
		fullName="Nisha r";
		maritalstatus=0;
		zipCode="632007";
		StringBuilder sb=new Agent().show(agentId,fullName,maritalstatus,zipCode);
		System.out.println(sb);

}
}

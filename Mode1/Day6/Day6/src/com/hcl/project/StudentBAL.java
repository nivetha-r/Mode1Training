package com.hcl.project;

import java.util.List;

public class StudentBAL {
	StringBuilder sb= new StringBuilder();
	public boolean addStudentBAL(Student objstudent) throws StudentException {
		boolean isAdded=true;
		
		if(objstudent.getSno() <= 0){
			sb.append("student no cannot ne negative or zero \r\n");
			isAdded=false;
		}
		if(objstudent.getName().length() <=3) {
			sb.append("Name more than 3 characters \r\n");
			isAdded=false;
		}
		if(objstudent.getCgp() <0){
			sb.append("Cgp non negative \r\n");
			isAdded=false;
		}
		if(objstudent.getCity().length() <=3 ){
			sb.append("city more than 3 characters \r\n");
			isAdded=false;
		}
		if(isAdded==false) {
			throw new StudentException(sb.toString());
		}else{
			new StudentDAO().addStudentDAO(objstudent);
		
		}
		return isAdded;
	}
	public Student searchStudentBAL(int Sno) {
		return new StudentDAO().searchStudentDAO(Sno);
	}public List<Student> showStudentBAL() {
		return new StudentDAO().showStudentDAO();
	}
	public String updateStudentBAL(Student objstudent) {
		return new StudentDAO().updateStudentDAO(objstudent);
	}
	public String deleteStudentBAL(int Sno) {
		return new StudentDAO().deletestudentDAO(Sno);
	}
}
	
	
	
	
	
	
	
	



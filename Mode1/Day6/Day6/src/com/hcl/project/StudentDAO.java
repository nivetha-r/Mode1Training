package com.hcl.project;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
  static List<Student> lststudent = null;
  
  static {
	  lststudent=new ArrayList<Student>();
  }
  public String addStudentDAO(Student student) {
	  lststudent.add(student);
	return "student create successfully";
  }
  
  public Student searchStudentDAO(int sno) {
	  Student objstudent=null;
	  for (Student student : lststudent) {
		  if(student.getSno()==sno) {
			  objstudent=student;
		  }
		
	}
	return objstudent;
	  
	  
  }
  public List<Student> showStudentDAO(){
	  return lststudent;
  }
  public String updateStudentDAO(Student objstudent) {
	  Student student=searchStudentDAO(objstudent.getSno());
	  if(student!=null) {
		  for (Student s : lststudent) {
             if(s.getSno()==objstudent.getSno()) {
            	 s.setName(objstudent.getName());
            	 s.setCity(objstudent.getCity());
            	 s.setCgp(objstudent.getCgp());
            	 
             }
		}
		  return"records updated";
		  
	  }else{
		  return "student num not found";
	  }
	
}
public String deletestudentDAO(int Sno){
	Student student=searchStudentDAO(Sno);
	if(student!=null) {
		lststudent.remove(student);
		return"student removed";
	}else{
		return"student num not found";
		
			
		}
	}
}

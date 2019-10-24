package com.hcl.collections;

public class Student {
  String firstName;
  String lastNmae;
  String city;
  double cgp;
  
  @Override
public String toString() {
    return "Student[firstName = " + firstName + ",lastNmae = " + lastNmae + ",city = " + city + ",cgp = " + cgp + "]";
  }
  public Student(String firstName, String lastNmae, String city, double cgp) {
    super();
    this.firstName = firstName;
    this.lastNmae = lastNmae;
    this.city = city;
    this.cgp = cgp;
  }
}

package com.hcl.mrng;

public class ThrEx {
  /**
* The main entry point.
* @param x args the list of parameters.
*/
  public void show(int x) {
    boolean flag = true;
    if (x < 0) { 
      flag = false;
      throw new NumberFormatException("neg num not allowed");
    }
    if (x == 0) {
      flag = false;
      throw new ArithmeticException("zero invalid");
    }
    if (flag == true) { 
      System.out.println("x value " + x);
    }
  }
  
  /**
* The main entry point.
* @param args the list of arguments.
*/
  public static void main(String[] args) {
    int n = -12;
    try { 
      new ThrEx().show(n);
    } catch (NumberFormatException e) { 
      System.out.println(e.getMessage());
    } catch (ArithmeticException e) { 
      System.out.println(e.getMessage());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
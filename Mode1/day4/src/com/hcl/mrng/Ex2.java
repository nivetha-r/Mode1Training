package com.hcl.mrng;

public class Ex2 {
  /**
* The main entry point.
* @param args the list of parameters
*/
  public static void main(String[] args) {
    try {
      System.out.println("A");
      throw new NullPointerException();
    } catch (ArithmeticException e) { 
      System.out.println(e);
    } catch (NullPointerException e) {
      //System.out.println("error");
      throw new NumberFormatException();
    } catch (NumberFormatException e) {
      System.out.println("rethrowm error");
    }
  }

}

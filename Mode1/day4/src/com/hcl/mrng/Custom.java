package com.hcl.mrng;

public class Custom {
  /**
* The main entry point.
* @param a args the list of parameters
* @param b args the list of parameters
* @throws NegativeException throws NegativeException
* @throws NumberZeroException throws NumberZeroException
*/
  public void sum(int a,int b) throws NegativeException, NumberZeroException { 
    int c;
    boolean flag = true;
    if (a < 0 || b < 0) { 
      flag = false;
      throw new NegativeException("neg nos nt allowed");
    }
    if (a == 0 || b == 0) {
      flag = false;
      throw new NumberZeroException("zero invalid");
    }
    if (flag == true) {
      c = a + b;
      System.out.println("sum is " + c);
    }
  }
  /**
   * The main entry point.
   * @param args the list of arguments
   */
  
  public static void main(String[] args) {
    int a = 5;
    int b = -14;
    try {
      new Custom().sum(a, b);
    } catch (NegativeException | NumberZeroException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}

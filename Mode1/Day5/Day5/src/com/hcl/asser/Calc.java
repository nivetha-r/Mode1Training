package com.hcl.asser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
  /**
* The main entry point.
* @param args the list of arguments.
*/
  public static void main(String[] args) {
    int a;
    int b;
    int c;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the nos:");
    try {
      a = Integer.parseInt(br.readLine());
      b = Integer.parseInt(br.readLine());
      c = a + b;
      System.out.println("sum is " + c);
    } catch (NumberFormatException | IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}

package com.hcl.asser;

import java.util.List;
import java.util.ArrayList;

public class ArrIntEx {
  public static void main(String[] args) {
    List num = new ArrayList();
    num.add(new Integer(45));
    num.add(new Integer(34));
    num.add(new Integer(24));
    num.add(new Integer(12));
    num.add(new Integer(67));
    num.add(new Integer(3));
    int sum = 0;
    for (Object ob : num) {
      sum += (Integer)ob;
    }
    System.out.println("sum " + sum);
  }

}

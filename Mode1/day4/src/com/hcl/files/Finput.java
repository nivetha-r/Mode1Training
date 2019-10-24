package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Finput {
  /**
* The main entry point.
* @param args the list of parameters.
*/
  public static void main(String[] args) {
    FileInputStream fin = null;
    try {
      fin = new FileInputStream("D:/hcljava/Day4/day4/src/com/hcl/mrng/Custom.java");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    int ch;
    try {
      while ((ch = fin.read()) != -1) {
        System.out.print((char)ch);
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    try {
      fin.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  } 
}
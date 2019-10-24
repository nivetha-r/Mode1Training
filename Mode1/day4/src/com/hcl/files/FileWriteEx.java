package com.hcl.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
  /**
* The main entry point.
* @param args the list of arguments.
*/
  public static void main(String[] args) {
    File src;
    File tar;
    FileReader fr;
    FileWriter fw;
    src = new File("D:/hcljava/Day4/day4/src/com/hcl/mrng/Custom.java");
    tar = new File("c:/files/custom.java");
    try {
      fr = new FileReader(src);
      fw = new FileWriter(tar);
      int ch;
      while ((ch = fr.read()) != -1) {
        fw.write((char)ch);
      }
      fr.close();
      fw.close();
      System.out.println("*** file copied");
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

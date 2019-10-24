package com.hcl.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Foutput {
  public static void main(String[] args) {
    FileInputStream src;
    FileOutputStream tar;
    try {
      src = new FileInputStream("D:/hcljava/Day4/day4/src/com/hcl/mrng/Custom.java");
      tar = new FileOutputStream("c:/files/target.txt");
int ch;
while((ch=src.read()) != -1) {
tar.write((char)ch);
}
src.close();
tar.close();
System.out.println("*** File copied***");
} catch (FileNotFoundException e){
e.printStackTrace();
} catch (IOException e){
e.printStackTrace();
}}

}

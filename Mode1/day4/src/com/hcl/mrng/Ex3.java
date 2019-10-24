package com.hcl.mrng;

public class Ex3 {
  /**
* The main entry point.
 *@param email args the list of arguments
 *@throws InvalidEmailException throws InvalidEmailException
 *@throws InvalidUserNameException throws InvalidUserNameException
 */
  public void checkEmail(String email) throws InvalidEmailException, InvalidUserNameException { 
    boolean flag = true;
    if (email.indexOf("@") == -1) { 
      flag = false;
      throw new InvalidEmailException("invalid email @ not found");
    }
    if (email.indexOf("@") > 12) { 
      flag = false;
      throw new InvalidUserNameException("invalid user name");
    }
    { 
      System.out.println("Email " + email);
    }
  }
  /**
   * The main entry point.
   * @param args the list of arguments
   */
  
  public static void main(String[] args) {
    String emailid = "hcl@gmail.com";
    try { 
      new Ex3().checkEmail(emailid);
    } catch (Exception e) { 
      e.printStackTrace();
    }
  }
}

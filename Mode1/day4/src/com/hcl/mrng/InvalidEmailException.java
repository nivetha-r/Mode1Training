package com.hcl.mrng;

/**
 * Exception class for handling Custom Exceptions.
 * @author Coalesce for Exception Handling.
 *
 */

public class InvalidEmailException extends Exception {  
  public InvalidEmailException(String error) { 
    super(error);
  }
}
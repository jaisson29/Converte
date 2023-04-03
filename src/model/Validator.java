package model;

public class Validator {

  public boolean verify ( String operation ){
    boolean isNumber = operation.matches("[+-]?\\d*(\\.\\d+)?");
    return isNumber;
  }
  public double transformToDouble (String operation) {
    return Double.parseDouble(operation);
  }
}

package enums;

public enum ConversorType {

  /*COP TO OTHER CURRENCIES*/
  COP_TO_AMERICAN_DOLLAR("From COP to american dollar"),
  COP_TO_CANADIAN_DOLLAR("From COP tp canadian dollar"),
  COP_TO_EURO("From COP to euro"),
  COP_TO_STERLING_POUND("From COP to sterling pound"),
  COP_TO_MEXICAN_PESO("From COP to mexican peso"),


  /*OTHER CURRENCIES TO COP*/
  AMERICAN_DOLLAR_TO_COP("From american dollar to COP"),
  CANADIAN_DOLLAR_TO_COP("From canadian dollar to COP"),
  EURO_TO_COP("From euro to COP"),
  STERLING_POUND_TO_COP("From sterling pound to COP"),
  MEXICAN_PESO_TO_COP("From mexinca peso to COP"),

  /*TEMPERATURES CONVERTERS*/

  CELSIUS_TO_FAHRENHEIT("From Celsius to Fahrenheit"),
  CELSIUS_TO_KELVIN("From Celsius to Kelvin"),
  KELVIN_TO_FAHRENHEIT("From Kelvin to Fahrenheit"),
  KELVIN_TO_CELSIUS ("From Kelvin to Celsius"),
  FAHRENHEIT_TO_CELSIUS ("From Fahrenheit to Celsius"),
  FAHRENHEIT_TO_KELVIN("From Fahrenheit to Kelvin");

  private final String description;
  ConversorType(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
  
}

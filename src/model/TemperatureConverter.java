package model;

public class TemperatureConverter {
  private double convertedValue;
  public double convertCelsiusToFahrenheit(double value){
    return convertedValue = value *1.8 + 32;
  }
  public double convertFahrenheitToCelsius(double value) {
    return convertedValue = (value - 32)/1.8;
  }

  public double convertCelsiusToKelvin(double value) {
    return convertedValue = value + 273;
  }

  public double convertKelvinToCelsius(double value){
    return convertedValue = value - 273;
  }

  public double convertKelvinToFahrenheit(double value){
    convertedValue = convertKelvinToCelsius(value);
    return convertedValue = convertCelsiusToFahrenheit(convertedValue);
  }
  public double convertFahrenheitToKelvin(double value){
    convertedValue = convertFahrenheitToCelsius(value);
    return convertedValue = convertCelsiusToKelvin(convertedValue);
  }
}

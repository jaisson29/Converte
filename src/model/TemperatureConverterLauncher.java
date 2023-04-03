package model;

public class TemperatureConverterLauncher {

  private static final String CELSIUS_TO_FAHRENHEIT = "From Celsius to Fahrenheit";
  private static final String CELSIUS_TO_KELVIN = "From Celsius to Kelvin";
  private static final String KELVIN_TO_FAHRENHEIT = "From Kelvin to Fahrenheit";
  private static final String KELVIN_TO_CELSIUS  = "From Kelvin to Celsius";
  private static final String FAHRENHEIT_TO_CELSIUS  = "From Fahrenheit to Celsius";
  private static final String FAHRENHEIT_TO_KELVIN = "From Fahrenheit to Kelvin";

  TemperatureConverter tempConverter = new TemperatureConverter();
  public double operateCOnversion(String temperatureOperation, double initialValue) throws Exception {
    switch (temperatureOperation){
      case CELSIUS_TO_FAHRENHEIT -> {
        return tempConverter.convertCelsiusToFahrenheit(initialValue);
      }
      case CELSIUS_TO_KELVIN -> {
        return tempConverter.convertCelsiusToKelvin(initialValue);
      }
      case FAHRENHEIT_TO_CELSIUS -> {
        return tempConverter.convertFahrenheitToCelsius(initialValue);
      }
      case FAHRENHEIT_TO_KELVIN -> {
        return tempConverter.convertFahrenheitToKelvin(initialValue);
      }
      case KELVIN_TO_FAHRENHEIT -> {
        return tempConverter.convertKelvinToFahrenheit(initialValue);
      }
      case KELVIN_TO_CELSIUS -> {
        return tempConverter.convertKelvinToCelsius(initialValue);
      }
      default -> throw new Exception("INVALID OPTION");
    }
  }
}

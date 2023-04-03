import enums.ConversorType;
import model.CurrencyConverterLauncher;
import model.Repeater;
import model.TemperatureConverterLauncher;
import model.Validator;

import javax.swing.*;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws Exception {
    System.out.println(ConversorType.AMERICAN_DOLLAR_TO_COP);
    String currencyConverter = "Convert currency";
    String temperatureConverter = "Convert temperature";

    boolean execute = true;

    Repeater repeater = new Repeater();

    while (execute) {

      String opc = (JOptionPane.showInputDialog(null,
          "Ingrese una opción", "Menu",
          JOptionPane.QUESTION_MESSAGE, null,
          new Object[]{currencyConverter, temperatureConverter}, "--Selection")).toString();

      if (opc.equals(currencyConverter)){
        CurrencyConverterLauncher currencyLauncher = new CurrencyConverterLauncher();
        String currencyOperation = JOptionPane.showInputDialog(null, "Choose a currency", "--Currency", JOptionPane.QUESTION_MESSAGE, null, new String[]{
            ConversorType.COP_TO_AMERICAN_DOLLAR.getDescription(),
            ConversorType.COP_TO_CANADIAN_DOLLAR.getDescription(),
            ConversorType.COP_TO_EURO.getDescription(),
            ConversorType.COP_TO_STERLING_POUND.getDescription(),
            ConversorType.COP_TO_MEXICAN_PESO.getDescription(),
            ConversorType.AMERICAN_DOLLAR_TO_COP.getDescription(),
            ConversorType.CANADIAN_DOLLAR_TO_COP.getDescription(),
            ConversorType.EURO_TO_COP.getDescription(),
            ConversorType.STERLING_POUND_TO_COP.getDescription(),
            ConversorType.MEXICAN_PESO_TO_COP.getDescription(),
        }, "--Choose one").toString();

        String stringValue = JOptionPane.showInputDialog("Enter a value to convert");
        Validator vlt = new Validator();
        if(!vlt.verify(stringValue)) JOptionPane.showMessageDialog(null, "INVALID VALUE", "Error", JOptionPane.ERROR_MESSAGE, null);
        else {
          double initialValue = vlt.transformToDouble(stringValue);
          BigDecimal convertedValue = currencyLauncher.operateConversion(currencyOperation, initialValue);
          JOptionPane.showMessageDialog(null, convertedValue, "Result", JOptionPane.INFORMATION_MESSAGE, null);
        }
      } else if (opc.equals(temperatureConverter)){
        TemperatureConverterLauncher temperaturLauncher = new TemperatureConverterLauncher();
        String tempOperation = JOptionPane.showInputDialog(null, "Choose one", "--Temperature measures", JOptionPane.QUESTION_MESSAGE, null, new String[]{
            ConversorType.CELSIUS_TO_FAHRENHEIT.getDescription(),
            ConversorType.CELSIUS_TO_KELVIN.getDescription(),
            ConversorType.FAHRENHEIT_TO_CELSIUS.getDescription(),
            ConversorType.FAHRENHEIT_TO_KELVIN.getDescription(),
            ConversorType.KELVIN_TO_FAHRENHEIT.getDescription(),
            ConversorType.KELVIN_TO_CELSIUS.getDescription()
        }, "--Choose one").toString();
        String stringValue = JOptionPane.showInputDialog("Enter a value to convert");
        Validator vlt = new Validator();
        if(!vlt.verify(stringValue)) JOptionPane.showMessageDialog(null, "INVALID VALUE", "Error", JOptionPane.ERROR_MESSAGE, null);
        else {
          double initialValue = vlt.transformToDouble(stringValue);
          double convertedValue = temperaturLauncher.operateCOnversion(tempOperation, initialValue);
          JOptionPane.showMessageDialog(null, convertedValue, "Result", JOptionPane.INFORMATION_MESSAGE, null);

        }
      }
      execute = repeater.tryToRepeat();
    }
  }
}

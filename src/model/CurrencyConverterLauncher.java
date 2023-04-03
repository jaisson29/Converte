package model;

import enums.Currency;

import java.math.BigDecimal;

public class CurrencyConverterLauncher {
  private static final String COP_TO_AMERICAN_DOLLAR = "From COP to american dollar";
  private static final String COP_TO_CANADIAN_DOLLAR = "From COP tp canadian dollar";
  private static final String COP_TO_EURO = "From COP to euro";
  private static final String COP_TO_STERLING_POUND = "From COP to sterling pound";
  private static final String COP_TO_MEXICAN_PESO = "From COP to mexican peso";
  private static final String AMERICAN_DOLLAR_TO_COP = "From american dollar to COP";
  private static final String CANADIAN_DOLLAR_TO_COP = "From canadian dollar to COP";
  private static final String EURO_TO_COP = "From euro to COP";
  private static final String STERLING_POUND_TO_COP = "From sterling pound to COP";
  private static final String MEXICAN_PESO_TO_COP = "From mexican peso to COP";
  private final CurrencyConverter americanDollarConverter = new AmericanDollarConverter();
  private final CurrencyConverter canadianDollarConverter = new CanadianDollarConverter();
  private final CurrencyConverter euroConverter = new EuroConverter();
  private final CurrencyConverter sterlingPoundConverter = new SterlingPoundConverter();
  private final CurrencyConverter mexicanPesoConverter = new MexicanPesoConverter();
  private Currency currency;

  public BigDecimal operateConversion(String currencyOperation, double initialValue) throws Exception {
    switch (currencyOperation) {
      case COP_TO_AMERICAN_DOLLAR -> {
        return americanDollarConverter.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
      }
      case COP_TO_CANADIAN_DOLLAR -> {
        return canadianDollarConverter.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
      }
      case COP_TO_EURO -> {
        return euroConverter.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
      }
      case COP_TO_STERLING_POUND -> {
        return sterlingPoundConverter.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
      }
      case COP_TO_MEXICAN_PESO -> {
        return mexicanPesoConverter.convertToCurrency(currency, BigDecimal.valueOf(initialValue));
      }

      case AMERICAN_DOLLAR_TO_COP -> {
        return americanDollarConverter.convertToCOP(currency, BigDecimal.valueOf(initialValue));
      }
      case CANADIAN_DOLLAR_TO_COP -> {
        return canadianDollarConverter.convertToCOP(currency, BigDecimal.valueOf(initialValue));

      }
      case EURO_TO_COP ->{
        return euroConverter.convertToCOP(currency, BigDecimal.valueOf(initialValue));

      }
      case STERLING_POUND_TO_COP -> {
        return sterlingPoundConverter.convertToCOP(currency, BigDecimal.valueOf(initialValue));

      }
      case MEXICAN_PESO_TO_COP -> {
        return mexicanPesoConverter.convertToCOP(currency, BigDecimal.valueOf(initialValue));

      }
      default ->{
        throw new Exception("INVALID OPTION");
      }
    }
  }
}

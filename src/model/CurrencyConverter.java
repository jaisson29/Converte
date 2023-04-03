package model;

import enums.Currency;
import interfaces.ConvertibleCurrency;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter implements ConvertibleCurrency {

  public BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue){
    return COPValue.divide(currency.getCONVERSION_FACTOR(), 2, RoundingMode.HALF_UP);
  }

  public BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue){
    return currencyValue.multiply(currency.getCONVERSION_FACTOR());
  }
}

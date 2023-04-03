package model;

import enums.Currency;

import java.math.BigDecimal;

public class SterlingPoundConverter extends CurrencyConverter {

  @Override
  public BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue) {
    currency = Currency.STERLING_POUND;
    return super.convertToCurrency(currency, COPValue);
  }

  @Override
  public BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue) {
    currency = Currency.STERLING_POUND;
    return super.convertToCOP(currency, currencyValue);
  }
}

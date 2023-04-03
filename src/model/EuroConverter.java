package model;

import enums.Currency;

import java.math.BigDecimal;

public class EuroConverter extends CurrencyConverter {

  @Override
  public BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue) {
    currency = Currency.EURO;
    return super.convertToCurrency(currency, COPValue);
  }

  @Override
  public BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue) {
    currency = Currency.EURO;
    return super.convertToCOP(currency, currencyValue);
  }
}

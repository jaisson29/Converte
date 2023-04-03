package model;

import enums.Currency;

import java.math.BigDecimal;

public class MexicanPesoConverter extends CurrencyConverter {

  @Override
  public BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue) {
    currency = Currency.MEXICAN_PESO;
    return super.convertToCurrency(currency, COPValue);
  }

  @Override
  public BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue) {
    currency = Currency.MEXICAN_PESO;
    return super.convertToCOP(currency, currencyValue);
  }
}

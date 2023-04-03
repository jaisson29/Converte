package interfaces;

import enums.Currency;

import java.math.BigDecimal;

public interface ConvertibleCurrency {

  BigDecimal convertToCurrency(Currency currency, BigDecimal COPValue);
  BigDecimal convertToCOP(Currency currency, BigDecimal currencyValue);
}

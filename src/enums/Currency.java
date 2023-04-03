package enums;

import java.math.BigDecimal;

public enum Currency {
  /*VALUES OBTAINED FROM 02/04/2023*/
  AMERICAN_DOLLAR(BigDecimal.valueOf(4_663.26)),
  CANADIAM_DOLLAR(BigDecimal.valueOf(3_448.88)),
  EURO(BigDecimal.valueOf(5_033.08)),
  STERLING_POUND(BigDecimal.valueOf(5_727.23)),
  MEXICAN_PESO(BigDecimal.valueOf(258.62));


  private final  BigDecimal CONVERSION_FACTOR;
  Currency(BigDecimal CONVERSION_FACTOR ) {
    this.CONVERSION_FACTOR = CONVERSION_FACTOR;
  }

  public BigDecimal getCONVERSION_FACTOR() {
    return CONVERSION_FACTOR;
  }
}

package eu.greyson;

import eu.greyson.currency.designator.CurrencyDesignator;

import java.math.BigDecimal;

public interface Payment {

    /**
     * Designator can be currency code ISO 4217 (USD, CZK etc.) or currency symbol ($, € etc.)
     * @return the implementation of the specific currency designator
     */
    CurrencyDesignator getDesignator();

    BigDecimal getAmount();
}
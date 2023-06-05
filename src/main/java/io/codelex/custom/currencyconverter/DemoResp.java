package io.codelex.custom.currencyconverter;

import java.math.BigDecimal;
import java.util.Map;

public class DemoResp {
    private Map<String, BigDecimal> rates;
    public DemoResp(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }
    public DemoResp() { }
    public Map<String, BigDecimal> getRates() { return rates; }
    public void setRates(Map<String, BigDecimal> rates) { this.rates = rates; }
}

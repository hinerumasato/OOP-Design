package BTOn.CurrencyConvert;

public class USDToUnit {
    
    public CurrencyMeasure convertToUnit(double usdValue, CurrencyUnit unit) {
        return new CurrencyMeasure(usdValue * unit.exchangeRate, unit);
    }
    
}

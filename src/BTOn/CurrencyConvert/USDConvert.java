package BTOn.CurrencyConvert;

public class USDConvert {
    
    public CurrencyMeasure convertToUnit(double usdValue, CurrencyUnit unit) {
        return new CurrencyMeasure(usdValue * unit.exchangeRate, unit);
    }
    
}

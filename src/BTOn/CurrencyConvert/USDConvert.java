package BTOn.CurrencyConvert;

public class USDConvert implements IUSDConvert {

    @Override
    public CurrencyMeasure convertToUnit(double usdValue, CurrencyUnit unit) {
        return new CurrencyMeasure(usdValue * unit.exchangeRate, unit);
    }
    
}

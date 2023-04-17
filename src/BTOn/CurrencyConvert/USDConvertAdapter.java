package BTOn.CurrencyConvert;

public class USDConvertAdapter implements CurrencyConvert {

    private USDConvert usdConvert = new USDConvert();

    @Override
    public CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit unit) {
        double usdValue = measure.getValue() / measure.getUnit().exchangeRate;
        return usdConvert.convertToUnit(usdValue, unit);
    }
    
}

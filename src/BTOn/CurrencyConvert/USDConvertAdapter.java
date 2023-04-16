package BTOn.CurrencyConvert;

public class USDConvertAdapter implements CurrencyConvert {

    private USDConvert usdConvert = new USDConvert();

    @Override
    public CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit unit) {
        return usdConvert.convertToUnit(measure.getValue() / measure.getUnit().exchangeRate, unit);
    }
    
}

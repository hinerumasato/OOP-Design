package BTOn.CurrencyConvert;

public class CurrenyConvertAdapter implements CurrencyConvert {

    private USDToUnit usdToUnit = new USDToUnit();

    @Override
    public CurrencyMeasure convert(CurrencyMeasure measure, CurrencyUnit unit) {
        return usdToUnit.convertToUnit(measure.getValue() / measure.getUnit().exchangeRate, unit);
    }
    
}

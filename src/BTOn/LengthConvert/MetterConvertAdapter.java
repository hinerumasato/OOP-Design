package BTOn.LengthConvert;

public class MetterConvertAdapter implements LengthConvert {

    private IMetterConvert metterConvert = new MetterConvert();

    @Override
    public LengthMeasure convert(LengthMeasure measure, LengthUnit unit) {
        double metterValue;
        if(measure.getUnit().getExchangeRate() < 1)
            metterValue = measure.getValue() / measure.getUnit().getExchangeRate();
        else metterValue = measure.getValue() * measure.getUnit().getExchangeRate();
        
        return metterConvert.convertToAnotherUnit(metterValue, unit);
    }
    
}

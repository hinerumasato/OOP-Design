package BTOn.LengthConvert;

public class MetterConvert {
    public LengthMeasure convertToAnotherUnit(double metterValue, LengthUnit unit) {
        return new LengthMeasure(metterValue * unit.getExchangeRate(), unit);
    }
}

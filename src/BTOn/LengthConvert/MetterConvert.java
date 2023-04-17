package BTOn.LengthConvert;

public class MetterConvert implements IMetterConvert {

    @Override
    public LengthMeasure convertToAnotherUnit(double metterValue, LengthUnit unit) {
        return new LengthMeasure(metterValue * unit.getExchangeRate(), unit);
    }
}

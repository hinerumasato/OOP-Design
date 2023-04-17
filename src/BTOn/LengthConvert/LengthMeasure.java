package BTOn.LengthConvert;

public class LengthMeasure {
    private double value;
    private LengthUnit unit;

    public LengthMeasure(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LengthUnit getUnit() {
        return unit;
    }

    public void setUnit(LengthUnit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return value + unit.getSymbol();
    }

    
    
}

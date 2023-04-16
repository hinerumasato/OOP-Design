package BTOn.CurrencyConvert;

public class CurrencyMeasure {
    private double value;
    private CurrencyUnit unit;

    public CurrencyMeasure(double value, CurrencyUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public CurrencyUnit getUnit() {
        return unit;
    }

    public void setUnit(CurrencyUnit unit) {
        this.unit = unit;
    }

}

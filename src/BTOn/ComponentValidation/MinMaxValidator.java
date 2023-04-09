package BTOn.ComponentValidation;

public class MinMaxValidator implements Validator {

    private double min;
    private double max;

    public MinMaxValidator(double min, double max) {
        this.min = min;
        this.max = max;
    }

    private boolean isBetween(double data) {
        return data >= min && data <= max;
    }

    @Override
    public boolean validate(Object data) {
        return isBetween(max);
    }
    
}

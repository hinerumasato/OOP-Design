package BTOn.ComponentValidation;

public class NumberValidation implements Validator {

    private boolean isNumber(String data) {
        for (char c : data.toCharArray())
            if (!Character.isDigit(c))
                return false;
        return true;
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String)data;
        return isNumber(strData);
    }

}

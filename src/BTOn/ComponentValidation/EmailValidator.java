package BTOn.ComponentValidation;

public class EmailValidation implements Validator {

    private boolean isEmail(String data) {
        return data.contains("@") && data.contains(".");
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String)data;
        return isEmail(strData);
    }
    
}

package BTOn.ComponentValidation;

public class EmailValidator implements Validator {

    private boolean isEmail(String data) {
        return data.split("\\@").length == 2 && data.contains(".");
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String)data;
        return isEmail(strData);
    }
    
}

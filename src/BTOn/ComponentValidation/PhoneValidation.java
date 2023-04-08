package BTOn.ComponentValidation;

public class PhoneValidation implements Validation {

    private boolean isPhoneNumber(String data) {
        String prefix = data.substring(0, 2);
        return prefix.equals("08") && data.length() == 10;
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String)data;
        return isPhoneNumber(strData);
    }
    
}

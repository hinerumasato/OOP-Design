package BTOn.ComponentValidation;

public class NumberValidator implements Validator {

    private boolean isFullNumber(String data) {
        for(char c : data.toCharArray()) {
            if(!Character.isDigit(c)) 
                return false;
        }
        return true;
    }

    private boolean isNumber(String data) {
        String[] checkMinusArr = data.split("\\-");
        String[] checkDotArr = data.split("\\.");
        
        if(checkMinusArr.length > 2) 
            return false;
        else {
            if(checkMinusArr.length == 2) {
                checkDotArr = checkMinusArr[1].split("\\.");
                data = checkMinusArr[1];
            }

            if(checkDotArr.length == 2) {
                return isFullNumber(checkDotArr[0]) && isFullNumber(checkDotArr[1]);
            }
            else return isFullNumber(data);
        }

    }

    @Override
    public boolean validate(Object data) {
        String strData = (String)data;
        return isNumber(strData);
    }

}

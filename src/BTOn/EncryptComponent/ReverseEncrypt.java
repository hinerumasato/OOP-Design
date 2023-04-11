package BTOn.EncryptComponent;

public class ReverseEncrypt implements Enryptable {

    @Override
    public String encrypt(String data) {
        String result = "";
        for(int i = data.length() - 1; i >= 0; i--)
            result += data.charAt(i) + "";
        return result;
    }
    
}

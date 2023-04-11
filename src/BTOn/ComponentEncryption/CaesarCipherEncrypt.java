package BTOn.ComponentEncryption;

public class CaesarCipherEncrypt implements Enryptable {

    @Override
    public String encrypt(String data) {
        String result = "";
        for(char c : data.toCharArray())
            if(Character.toUpperCase(c) == c )
                result += (char)('A' + (c  - 65 + 2) % 26);
            else result += (char)('a' + (c  - 97 + 2) % 26);
        return result;
    }
    
}

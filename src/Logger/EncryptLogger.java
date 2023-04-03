package Logger;

public class EncryptLogger extends LoggerDecorator {

    public EncryptLogger(Logger logger) {
        super(logger);
    }

    private String encrypt(String msg) {
        String result = "";
        for(char c : msg.toCharArray()) {
            c += 2;
            result += c;
        }
        return result;

    }

    @Override
    public void log(String msg) {
        msg = encrypt(msg);
        logger.log(msg);
    }
    
}

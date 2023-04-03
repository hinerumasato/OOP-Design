package Logger;

public class HTMLLogger extends LoggerDecorator {

    public HTMLLogger(Logger logger) {
        super(logger);
    }

    public String makeHTML(String msg) {
        msg = "<HTML><BODY>" + "<b>" + msg + "</b>" + "</BODY></HTML>";
        return msg;
    }

    @Override
    public void log(String msg) {
        logger.log(makeHTML(msg));
    }

}

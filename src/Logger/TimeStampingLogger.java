package Logger;

import java.util.Date;

public class TimeStampingLogger extends LoggerDecorator {

    public TimeStampingLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void log(String msg) {
        Date now = new Date();
        msg = now + "" + msg;
        logger.log(msg);
    }

}

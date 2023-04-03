package Logger;

public class DecoratorClient {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();
        Logger logger = factory.getLogger();
        String msg = "tenki ga ii kara sanpo shimashou";
        
        HTMLLogger htmlLogger = new HTMLLogger(logger);
        htmlLogger.log(msg);

        UpperLogger uLogger = new UpperLogger(logger);
        uLogger.log(msg);

        TimeStampingLogger tLogger = new TimeStampingLogger(logger);
        tLogger.log(msg);
    }
}

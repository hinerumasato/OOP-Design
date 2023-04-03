package Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {

    private Properties p;

    public LoggerFactory() {
        try {
            p = new Properties();
            p.load(new FileInputStream(new File("src/Logger/Logger.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isFileLoggingEnabled() {
        String fileLoggingValue = p.getProperty("FileLogging");
        if (fileLoggingValue.equalsIgnoreCase("ON") == true)
            return true;
        else
            return false;
    }

    public Logger getLogger() {
        if (isFileLoggingEnabled()) {
            String path = p.getProperty("FileLocation");
            return new FileLogger(path);
        } else {
            return new ConsoleLogger();
        }
    }
}

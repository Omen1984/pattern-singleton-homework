import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private int num = 1;
    private LocalDateTime localDateTime;
    private DateTimeFormatter formatter;

    private static Logger logger = null;

    private Logger() {
        localDateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.printf("[%s %d] %s\n", localDateTime.format(formatter), num++, msg);
    }
}
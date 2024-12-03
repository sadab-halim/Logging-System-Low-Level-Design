package loggingsystem;

public class LoggingSystem {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.ERROR, "Exception occurred");
        logger.log(LogProcessor.DEBUG, "Issue found");
        logger.log(LogProcessor.INFO, "Success");
    }
}

package Behavioural.ChainOfResponsibility;

public abstract class LogProcessor {
    public static int INFO = 0;
    public static int DEBUG = 1;
    public static int ERROR = 2;
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public abstract void log(int logLevel, String message);
}

package Behavioural.ChainOfResponsibility;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (DEBUG == logLevel) {
            System.out.println("DEBUG : " + message);
        } else {
            nextLogProcessor.log(logLevel, message);
        }
    }
}

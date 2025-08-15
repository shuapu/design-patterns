package Behavioural.ChainOfResponsibility;

public class MainClass {
    public static void main(String[] args) {
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log(LogProcessor.INFO,"This is info log");
        logger.log(LogProcessor.DEBUG,"This is Debug log");
        logger.log(LogProcessor.ERROR,"This is Error log");
    }
}

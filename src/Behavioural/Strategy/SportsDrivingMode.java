package Behavioural.Strategy;

public class SportsDrivingMode implements DriveMode{
    @Override
    public void drive() {
        System.out.println("Driving in sports mode!!");
    }
}

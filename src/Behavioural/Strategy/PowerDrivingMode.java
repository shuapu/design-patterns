package Behavioural.Strategy;

public class PowerDrivingMode implements DriveMode{
    @Override
    public void drive() {
        System.out.println("Driving in power mode!!");
    }
}

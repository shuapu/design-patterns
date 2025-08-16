package Behavioural.Strategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle(DriveMode driveMode) {
        super(driveMode);
    }

    @Override
    public void drive() {
        getDriveMode().drive();
    }
}

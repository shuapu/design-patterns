package Behavioural.Strategy;

public class OffRodeVehicle extends Vehicle{
    public OffRodeVehicle(DriveMode driveMode) {
        super(driveMode);
    }

    @Override
    public void drive() {
        getDriveMode().drive();
    }
}

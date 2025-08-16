package Behavioural.Strategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveMode driveMode) {
        super(driveMode);
    }

    @Override
    public void drive() {
        getDriveMode().drive();
    }
}

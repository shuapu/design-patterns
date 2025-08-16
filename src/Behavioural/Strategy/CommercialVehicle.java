package Behavioural.Strategy;

public class CommercialVehicle extends Vehicle {

    public CommercialVehicle(DriveMode driveMode) {
        super(driveMode);
    }

    @Override
    public void drive() {
        getDriveMode().drive();
    }
}

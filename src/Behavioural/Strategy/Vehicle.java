package Behavioural.Strategy;

public abstract class Vehicle {
    private DriveMode driveMode;

    public Vehicle(DriveMode driveMode) {
        this.driveMode = driveMode;
    }

    public DriveMode getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(DriveMode driveMode) {
        this.driveMode = driveMode;
    }

    public abstract void drive();


}

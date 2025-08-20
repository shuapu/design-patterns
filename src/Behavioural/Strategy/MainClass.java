package Behavioural.Strategy;

public class MainClass {
    public static void main(String[] args) {
        /*
        Use case : When a class have n  number of children and out of n , m has simpler behaviour .
        Then we should use strategy patterns to avoid code duplicate in all m children.
         */

        DriveMode economyDriveMode = new EconomyDriveMode();
        DriveMode sportsDrivingMode = new SportsDrivingMode();
        DriveMode powerDrivingMode = new PowerDrivingMode();

        PassengerVehicle passengerVehicle = new PassengerVehicle(economyDriveMode);
        passengerVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle(sportsDrivingMode);
        sportsVehicle.drive();

        CommercialVehicle commercialVehicle = new CommercialVehicle(powerDrivingMode);
        commercialVehicle.drive();

        OffRodeVehicle offRodeVehicle = new OffRodeVehicle(powerDrivingMode);//Strategy created used in two different children.
        offRodeVehicle.drive();

    }
}

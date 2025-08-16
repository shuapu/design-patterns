package Behavioural.Strategy;

public class MainClass {
    public static void main(String[] args) {
        EconomyDriveMode economyDriveMode = new EconomyDriveMode();
        SportsDrivingMode sportsDrivingMode = new SportsDrivingMode();
        PowerDrivingMode powerDrivingMode = new PowerDrivingMode();

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

package Creational.AbstractFactory;

public class MainClass {
    public static void main(String[] args) {
         /*
         Use case : When we have factory of factories then abstract factory design pattern is used.
         Here VehicleFactory is a factory of the electrical and Petrol Vehicles Factories.
          */
        VehicleFactory electricVehicleFactory = new ElectricalVehicleFactory();
        Car electricCar = electricVehicleFactory.createCar();
        electricCar.drive();
        Bike electricBike = electricVehicleFactory.createBike();
        electricBike.drive();

        VehicleFactory petrolvehiclefactory = new PetrolVehicleFactory();
        Car petrolCar = petrolvehiclefactory.createCar();
        petrolCar.drive();
        Bike petrolBike = petrolvehiclefactory.createBike();
        petrolBike.drive();


    }
}

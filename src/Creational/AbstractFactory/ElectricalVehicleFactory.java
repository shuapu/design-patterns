package Creational.AbstractFactory;

public class ElectricalVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Bike createBike() {
        return new ElectricBike();
    }
}

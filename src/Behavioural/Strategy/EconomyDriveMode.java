package Behavioural.Strategy;

public class EconomyDriveMode implements DriveMode{

    @Override
    public void drive() {
        System.out.println("Driving in economy mode!!");
    }
}

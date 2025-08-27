package Structural.Facade;

public class MainClass {


    public static void main(String[] args) {
        //The Facade Pattern is a structural design pattern that provides a simplified interface to a complex system of classes, libraries, or frameworks.
        //It hides the complexity of the system from the client.
        //The client interacts with only the Facade, not the subsystem classes.

       HomeTheater homeTheater = new HomeTheater();
       homeTheater.playMovie("MovieName",5,7,true);
       homeTheater.stopMovie();


    }
}

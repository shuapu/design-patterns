package Structural.Facade;

public class DvdPlayer {
    private String movie;

    public void play(String movie) {
        this.movie = movie;
        System.out.println("Playing Movie " + movie);
    }

    public void stop() {
        System.out.println("Stoping movie : " + movie);
    }
}

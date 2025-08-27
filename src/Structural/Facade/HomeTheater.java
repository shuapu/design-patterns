package Structural.Facade;

public class HomeTheater {
    private Lights lights;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheater() {
        this.dvdPlayer = new DvdPlayer();
        this.lights = new Lights();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
    }

    public HomeTheater(Lights lights, DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem) {
        this.lights = lights;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public Lights getLights() {
        return lights;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public Projector getProjector() {
        return projector;
    }

    public void setProjector(Projector projector) {
        this.projector = projector;
    }

    public SoundSystem getSoundSystem() {
        return soundSystem;
    }

    public void setSoundSystem(SoundSystem soundSystem) {
        this.soundSystem = soundSystem;
    }

    public void playMovie(String movie,int volume,int lightLevel,boolean watchOnProjector) {
        lights.on();
        lights.lightLeve(lightLevel);

        if(watchOnProjector){
            projector.on();
        }

        soundSystem.on();
        soundSystem.setVolume(volume);

        dvdPlayer.play(movie);
    }

    public void stopMovie() {
        System.out.println("\n \nStoping movie play!!");
        dvdPlayer.stop();
        soundSystem.off();
        projector.off();
        lights.off();
    }

}

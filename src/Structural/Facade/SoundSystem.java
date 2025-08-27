package Structural.Facade;

public class SoundSystem {
    private int volume;


    public void on(){
        System.out.println("Sound system on");
    }
    public void off(){
        System.out.println("Sound system on");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Sound volume set to : " + volume);
    }

    public void increaseVolume() {
        volume++;
        System.out.println("Volume increase to :" + volume);
    }

    public void decreaseVolume() {
        volume--;
        System.out.println("Volume decrease to :" + volume);
    }
}

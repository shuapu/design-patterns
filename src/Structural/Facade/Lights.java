package Structural.Facade;

public class Lights {
    private int level;

    public void on(){
        System.out.println("Lights on");
    }
    public void off(){
        System.out.println("Lights off");
    }
    public void lightLeve(int level) {
        this.level = level;
        System.out.println("Light level set to " + level);
    }

    public void increaseLightLevel() {
        level++;
    }

    public void decreaseLightLevel() {
        level--;
    }
}

package Structural.Proxy;

public class ActualImage implements Image {
    private final String fileName;

    public ActualImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        loadImage(fileName);
        System.out.println("Displaying Image");
    }

    public void loadImage(String fileName) {
        System.out.println(fileName + " loading image from disk ");
    }
}

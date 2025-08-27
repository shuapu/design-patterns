package Structural.Proxy;

import java.util.Objects;

public class ProxyImage implements Image {
    private final String fileName;
    private ActualImage image;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (Objects.isNull(image)) {
            image = new ActualImage(fileName);
            image.loadImage(fileName);
        }
        image.displayImage();
    }
}

package Structural.Proxy;

public class MainClass {
    public static void main(String[] args) {
       // The Proxy Pattern is a structural design pattern.
       // It provides a placeholder (proxy) object that controls access to another object (the real object).

        ProxyImage image = new ProxyImage("Photo.jpg");
        image.displayImage();
    }
}

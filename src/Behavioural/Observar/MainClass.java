package Behavioural.Observar;

public class MainClass {
    public static void main(String[] args) {
        Observer mobileObserver = new Mobile();
        Observer desktopObserver = new Desktop();

        WeatherUpdate weatherUpdate = new WeatherUpdate();
        weatherUpdate.add(desktopObserver);
        weatherUpdate.add(mobileObserver);

        weatherUpdate.updateInWeather("24 C");
    }
}

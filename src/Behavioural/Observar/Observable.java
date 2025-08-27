package Behavioural.Observar;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyWeather();
}

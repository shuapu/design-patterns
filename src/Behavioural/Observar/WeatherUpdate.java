package Behavioural.Observar;

import java.util.ArrayList;
import java.util.List;

public class WeatherUpdate implements Observable{
    private String weather;

    private final List<Observer> observers;
    public WeatherUpdate(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
      observers.remove(observer);
    }

    @Override
    public void notifyWeather() {
       observers.forEach(observer -> {observer.update(weather);});
    }

    public void updateInWeather(String weather){
        this.weather = weather;
        notifyWeather();
    }

}

package Behavioural.Observar;

public class Desktop implements Observer{
    @Override
    public void update(String weather) {
        System.out.println("Desktop weather update : "+weather);
    }
}

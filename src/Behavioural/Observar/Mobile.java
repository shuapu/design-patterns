package Behavioural.Observar;

public class Mobile implements Observer{
    @Override
    public void update(String weather) {
        System.out.println("Mobile weather update : "+weather);
    }
}

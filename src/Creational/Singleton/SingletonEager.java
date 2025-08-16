package Creational.Singleton;

public class SingletonEager {
    /*
    Pros : Simple,Thread Safe.
    Cons ; Memory wastage(Instance created even not used)
     */

    private static final SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }

}

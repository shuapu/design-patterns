package Creational;

public class SingletonLazy {
    /*
    Pros : Simple,Memory optimised(Object created only when used)
    Cons : Not a thread safe implementation.
     */

    private static SingletonLazy instance = null;

    private SingletonLazy() {

    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}

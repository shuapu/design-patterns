package Creational;

public class SingletonLazy {

    private static SingletonLazy instance = null;

    /**
     * Private Constructor to avoid creation of object outside class.
     */
    private SingletonLazy() {
        if (instance != null) {
            throw new RuntimeException("Class object creation not supported");
        }
    }

    /**
     * This is not thread safe but Lazy initialization
     *
     * @return SingletonLazy
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * Thread Safe and Lazy initialization but comparatively slow as complete method is synchronized.
     *
     * @return SingletonLazy
     */
    public static synchronized SingletonLazy getThreadSafeInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    /**
     * Thread Safe and Lazy initialization but performance optimised.
     *
     * @return SingletonLazy
     */
    public static SingletonLazy getBlockThreadSafeInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                instance = new SingletonLazy();
            }
        }
        return instance;
    }


}

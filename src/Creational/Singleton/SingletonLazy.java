package Creational.Singleton;

import java.io.Serial;
import java.io.Serializable;

public class SingletonLazy  implements Cloneable,Serializable {

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


    @Override
    public SingletonLazy clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not supported");
    }

    /**
     * This is special method called while serialization and deserialization.
     * This protects singleton to be broken while serialization and deserialization.
     * @return SingletonLazy
     */
    @Serial
    protected Object readResolve(){
        return instance;
    }

}

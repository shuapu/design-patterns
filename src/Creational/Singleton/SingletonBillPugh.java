package Creational.Singleton;

public class SingletonBillPugh {
    /*
      Pros : Best approach.Lazy init and no synchronization overhead.
      Cons : No
     */
    private SingletonBillPugh() {

    }

    public static class Helper {
        public static SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public SingletonBillPugh getInstance() {
        return Helper.INSTANCE;
    }


}

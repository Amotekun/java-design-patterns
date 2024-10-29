package creationdesignpattern.singleton;

public class SingletonApp {
    public static void run() {
        System.out.println("==== Basic Singleton Implementation ====");
        System.out.println("This pattern restricts the instantiation of a class to one object.");

        BasicSingleton basicSingleton = BasicSingleton.getInstance();
        basicSingleton.showMessage();

        System.out.println("==== Thread-Safe Singleton Implementation ====");
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
        threadSafeSingleton.showMessage();

        System.out.println("==== Eager Initialization Singleton Implementation ====");
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();

        System.out.println("==== Double-Checked Locking Singleton Implementation ====");
        DoubleCheckedLockingSingleton doubleCheckedLockingSingleton = DoubleCheckedLockingSingleton.getInstance();
        doubleCheckedLockingSingleton.showMessage();

        System.out.println("==== Enum Singleton Implementation ====");
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        enumSingleton.showMessage();
    }

}

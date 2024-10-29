package creationdesignpattern.singleton;

public class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton() {
    }

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Basic Singleton");
    }
}

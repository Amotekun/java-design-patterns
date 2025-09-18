package creationdesignpattern.singleton;

/**
 * Basic Singleton implementation with thread safety.
 * Note: This implementation is thread-safe but may have performance implications
 * due to synchronized method. Consider using other singleton implementations
 * for better performance in multi-threaded environments.
 */
public class BasicSingleton {
    private static volatile BasicSingleton instance;

    private BasicSingleton() {
        // Private constructor to prevent instantiation
    }

    /**
     * Returns the singleton instance.
     * This method is thread-safe using double-checked locking pattern.
     * 
     * @return the singleton instance
     */
    public static BasicSingleton getInstance() {
        if (instance == null) {
            synchronized (BasicSingleton.class) {
                if (instance == null) {
                    instance = new BasicSingleton();
                }
            }
        }
        return instance;
    }

    /**
     * Displays a message from the singleton instance.
     */
    public void showMessage() {
        System.out.println("Hello from Basic Singleton");
    }
}

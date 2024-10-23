package factormethodpattern.inheritance_without_interface;

public class InheritanceWithoutInterfaceApp {
    public static void run() {
        System.out.println("===== Factor Method Pattern (Inheritance Without Interface) =====\n");

        Animal dog = new Dog();
        dog.makeSound();

        Animal cat = new Cat();
        cat.makeSound();
    }
}

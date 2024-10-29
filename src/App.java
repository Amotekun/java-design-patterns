public class App {
    public static void main(String[] args) throws Exception {

        creationdesignpattern.factormethod.inheritance.with_interface.InheritanceWithInterfaceApp.run();
        printSeparator();

        creationdesignpattern.factormethod.inheritance.without_interface.InheritanceWithoutInterfaceApp.run();
        printSeparator();

        creationdesignpattern.factormethod.static_method.StaticMethodsApp.run();
        printSeparator();

        creationdesignpattern.factormethod.with_enums.WithEnumsApp.run();
        printSeparator();

        creationdesignpattern.factormethod.dependency_injection.DependencyInjectionApp.run();
        printSeparator();

        creationdesignpattern.abstractmethod.guisystem.AbstractionMethodApp.run();
        printSeparator();

        creationdesignpattern.builder.BuilderApp.run();
        printSeparator();

        creationdesignpattern.prototype.PrototypeApp.run();
        printSeparator();

        creationdesignpattern.singleton.SingletonApp.run();
        printSeparator();

        System.out.println("All patterns executed successfully!");

    }

    private static void printSeparator() {
        System.out.println("\n  \n");
    }
}
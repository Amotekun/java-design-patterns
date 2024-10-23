public class App {
    public static void main(String[] args) throws Exception {

        factormethodpattern.inheritance_with_interface.InheritanceWithInterfaceApp.run();
        printSeparator();

        factormethodpattern.inheritance_without_interface.InheritanceWithoutInterfaceApp.run();
        printSeparator();

        System.out.println("All patterns executed successfully!");

    }

    private static void printSeparator() {
        System.out.println("\n  \n");
    }
}
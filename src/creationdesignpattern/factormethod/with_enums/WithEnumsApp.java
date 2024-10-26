package creationdesignpattern.factormethod.with_enums;

public class WithEnumsApp {
    public static void run() {
        System.out.println("===== Factor Method Pattern with Enums Example =====");

        MargheritaPizza margheritapizza = (MargheritaPizza) PizzaFactory.createPizza(PizzaType.MAGHERITA);
        margheritapizza.prepare();

        PepperoniPizza pepperoniPizza = (PepperoniPizza) PizzaFactory.createPizza(PizzaType.PEPPERONI);
        pepperoniPizza.prepare();
    }
}
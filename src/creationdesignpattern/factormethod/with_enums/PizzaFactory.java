package creationdesignpattern.factormethod.with_enums;

public class PizzaFactory {
    public static Object createPizza(PizzaType type) {
        switch (type) {
            case MAGHERITA:
                return new MargheritaPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            default:
                throw new IllegalArgumentException("Unknown pizza type");
        }
    }

}

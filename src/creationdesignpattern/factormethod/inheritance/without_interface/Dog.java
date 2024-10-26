package creationdesignpattern.factormethod.inheritance.without_interface;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

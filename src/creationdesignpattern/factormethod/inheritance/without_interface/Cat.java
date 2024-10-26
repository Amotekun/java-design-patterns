package creationdesignpattern.factormethod.inheritance.without_interface;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

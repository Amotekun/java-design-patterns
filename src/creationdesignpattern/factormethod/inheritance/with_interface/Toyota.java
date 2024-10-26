package creationdesignpattern.factormethod.inheritance.with_interface;

public class Toyota implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Toyota");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Toyota");
    }

    @Override
    public void test() {
        System.out.println("Testing Toyota");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Toyota");
    }
}

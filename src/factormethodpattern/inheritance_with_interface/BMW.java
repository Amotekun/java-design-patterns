package factormethodpattern.inheritance_with_interface;

public class BMW implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing BMW");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing BMW");
    }

    @Override
    public void test() {
        System.out.println("Testing BMW");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering BMW");
    }
}

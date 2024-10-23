package factormethodpattern.inheritance_with_interface;

public class Honda implements Vehicle {
    @Override
    public void design() {
        System.out.println("Designing Honda");
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Honda");
    }

    @Override
    public void test() {
        System.out.println("Testing Honda");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering Honda");
    }

}

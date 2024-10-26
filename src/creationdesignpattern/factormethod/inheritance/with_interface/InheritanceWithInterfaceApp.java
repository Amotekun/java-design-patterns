package creationdesignpattern.factormethod.inheritance.with_interface;

public class InheritanceWithInterfaceApp {

    private static void produceVehicle(Vehicle vehicle) {
        vehicle.design();
        vehicle.manufacture();
        vehicle.test();
        vehicle.deliver();
    }

    public static void run() {
        System.out.println("===== Factor Method Pattern =====\n");

        Vehicle toyota = VehicleFactory.createVehicle("toyota");
        produceVehicle(toyota);

        System.out.println();

        Vehicle bmw = VehicleFactory.createVehicle("bmw");
        produceVehicle(bmw);
    }

}
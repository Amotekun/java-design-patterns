package factormethodpattern.inheritance_with_interface;

public class VehicleFactory {
    // Factory method to create vehicles based on input

    public static Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "toyota":
                return new Toyota();

            case "honda":
                return new Honda();

            case "bmw":
                return new BMW();

            default:
                throw new IllegalArgumentException("Invalid vehicle type:" + type);
        }
    }
}

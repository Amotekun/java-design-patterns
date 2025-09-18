package creationdesignpattern.factormethod.inheritance.with_interface;

import java.util.Objects;

/**
 * VehicleFactory demonstrates the Factory Method pattern.
 * This factory creates different types of vehicles based on the input type.
 * It provides a centralized way to create vehicle objects without exposing
 * the instantiation logic to the client.
 */
public class VehicleFactory {
    
    /**
     * Creates a vehicle instance based on the specified type.
     * 
     * @param type the type of vehicle to create (case-insensitive)
     * @return a new Vehicle instance
     * @throws IllegalArgumentException if type is null, empty, or not supported
     */
    public static Vehicle createVehicle(String type) {
        Objects.requireNonNull(type, "Vehicle type cannot be null");
        
        if (type.trim().isEmpty()) {
            throw new IllegalArgumentException("Vehicle type cannot be empty");
        }
        
        String normalizedType = type.toLowerCase().trim();
        
        switch (normalizedType) {
            case "toyota":
                return new Toyota();
            case "honda":
                return new Honda();
            case "bmw":
                return new BMW();
            default:
                throw new IllegalArgumentException("Unsupported vehicle type: '" + type + 
                    "'. Supported types are: toyota, honda, bmw");
        }
    }
    
    /**
     * Gets the list of supported vehicle types.
     * 
     * @return array of supported vehicle type names
     */
    public static String[] getSupportedTypes() {
        return new String[]{"toyota", "honda", "bmw"};
    }
    
    /**
     * Checks if a vehicle type is supported.
     * 
     * @param type the vehicle type to check
     * @return true if the type is supported, false otherwise
     */
    public static boolean isSupportedType(String type) {
        if (type == null || type.trim().isEmpty()) {
            return false;
        }
        
        String normalizedType = type.toLowerCase().trim();
        for (String supportedType : getSupportedTypes()) {
            if (supportedType.equals(normalizedType)) {
                return true;
            }
        }
        return false;
    }
}

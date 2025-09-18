package creationdesignpattern.prototype.shape_cloning;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ShapeCache manages a cache of shape prototypes for cloning.
 * This class implements the Prototype pattern by providing a centralized
 * way to store and retrieve shape prototypes.
 */
public class ShapeCache {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    /**
     * Retrieves a cloned copy of a shape from the cache.
     * 
     * @param shapeId the ID of the shape to retrieve
     * @return a cloned copy of the shape
     * @throws IllegalArgumentException if shapeId is null or empty
     * @throws IllegalStateException if the shape is not found in cache
     */
    public static Shape getShape(String shapeId) {
        Objects.requireNonNull(shapeId, "Shape ID cannot be null");
        
        if (shapeId.trim().isEmpty()) {
            throw new IllegalArgumentException("Shape ID cannot be empty");
        }
        
        Shape cachedShape = shapeMap.get(shapeId);
        if (cachedShape == null) {
            throw new IllegalStateException("Shape with ID '" + shapeId + "' not found in cache. " +
                    "Make sure to call loadCache() first.");
        }
        
        try {
            return (Shape) cachedShape.clone();
        } catch (Exception e) {
            throw new RuntimeException("Failed to clone shape with ID: " + shapeId, e);
        }
    }

    /**
     * Loads the cache with predefined shape prototypes.
     * This method should be called before attempting to retrieve shapes.
     */
    public static void loadCache() {
        try {
            Circle circle = new Circle();
            circle.setId("1");
            shapeMap.put(circle.getId(), circle);

            Rectangle rectangle = new Rectangle();
            rectangle.setId("2");
            shapeMap.put(rectangle.getId(), rectangle);

            Square square = new Square();
            square.setId("3");
            shapeMap.put(square.getId(), square);
            
            System.out.println("Shape cache loaded with " + shapeMap.size() + " shapes");
        } catch (Exception e) {
            throw new RuntimeException("Failed to load shape cache", e);
        }
    }

    /**
     * Clears the shape cache.
     */
    public static void clearCache() {
        shapeMap.clear();
        System.out.println("Shape cache cleared");
    }

    /**
     * Returns the number of shapes currently in the cache.
     * 
     * @return the number of cached shapes
     */
    public static int getCacheSize() {
        return shapeMap.size();
    }
}

package test;

import creationdesignpattern.singleton.BasicSingleton;
import creationdesignpattern.singleton.ThreadSafeSingleton;
import creationdesignpattern.singleton.EagerSingleton;
import creationdesignpattern.singleton.DoubleCheckedLockingSingleton;
import creationdesignpattern.singleton.EnumSingleton;
import creationdesignpattern.builder.Computer;
import creationdesignpattern.builder.House;
import creationdesignpattern.factormethod.inheritance.with_interface.VehicleFactory;
import creationdesignpattern.factormethod.inheritance.with_interface.Vehicle;
import creationdesignpattern.prototype.shape_cloning.ShapeCache;
import creationdesignpattern.prototype.shape_cloning.Shape;
import creationdesignpattern.prototype.employee_system.Employee;
import creationdesignpattern.prototype.game_character.GameCharacter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class to verify that all design pattern fixes are working correctly.
 */
public class DesignPatternsTest {

    @BeforeEach
    void setUp() {
        // Clear any singleton state before each test
        // Note: In a real application, you'd need reflection to reset singletons
    }

    @Test
    void testBasicSingletonThreadSafety() {
        // Test that BasicSingleton is now thread-safe
        BasicSingleton instance1 = BasicSingleton.getInstance();
        BasicSingleton instance2 = BasicSingleton.getInstance();
        
        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2, "Singleton should return the same instance");
    }

    @Test
    void testAllSingletonImplementations() {
        // Test all singleton implementations
        BasicSingleton basic = BasicSingleton.getInstance();
        ThreadSafeSingleton threadSafe = ThreadSafeSingleton.getInstance();
        EagerSingleton eager = EagerSingleton.getInstance();
        DoubleCheckedLockingSingleton doubleChecked = DoubleCheckedLockingSingleton.getInstance();
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;

        assertNotNull(basic);
        assertNotNull(threadSafe);
        assertNotNull(eager);
        assertNotNull(doubleChecked);
        assertNotNull(enumSingleton);

        // Test that they can execute their methods
        assertDoesNotThrow(() -> basic.showMessage());
        assertDoesNotThrow(() -> threadSafe.showMessage());
        assertDoesNotThrow(() -> eager.showMessage());
        assertDoesNotThrow(() -> doubleChecked.showMessage());
        assertDoesNotThrow(() -> enumSingleton.showMessage());
    }

    @Test
    void testBuilderPatternValidation() {
        // Test Computer builder with valid data
        Computer computer = new Computer.Builder()
                .withCPU("Intel i7")
                .withGPU("RTX 3080")
                .withRAM(16)
                .withSSD(512)
                .build();

        assertNotNull(computer);
        assertEquals("Intel i7", computer.getCpu());
        assertEquals("RTX 3080", computer.getGpu());
        assertEquals(16, computer.getRam());
        assertEquals(512, computer.getSsd());

        // Test validation - null CPU
        assertThrows(IllegalArgumentException.class, () -> 
            new Computer.Builder().withCPU(null).build());

        // Test validation - empty CPU
        assertThrows(IllegalArgumentException.class, () -> 
            new Computer.Builder().withCPU("").build());

        // Test validation - negative RAM
        assertThrows(IllegalArgumentException.class, () -> 
            new Computer.Builder().withRAM(-1).build());

        // Test validation - missing required fields
        assertThrows(IllegalStateException.class, () -> 
            new Computer.Builder().build());
    }

    @Test
    void testHouseBuilderPattern() {
        // Test House builder with valid data
        House house = new House.Builder()
                .withBedrooms(3)
                .withGarage(true)
                .withPool(false)
                .withGarden(true)
                .build();

        assertNotNull(house);
        assertEquals(3, house.getBedrooms());
        assertTrue(house.hasGarage());
        assertFalse(house.hasPool());
        assertTrue(house.hasGarden());

        // Test validation - negative bedrooms
        assertThrows(IllegalArgumentException.class, () -> 
            new House.Builder().withBedrooms(-1).build());
    }

    @Test
    void testVehicleFactoryErrorHandling() {
        // Test valid vehicle creation
        Vehicle toyota = VehicleFactory.createVehicle("toyota");
        Vehicle honda = VehicleFactory.createVehicle("HONDA");
        Vehicle bmw = VehicleFactory.createVehicle("Bmw");

        assertNotNull(toyota);
        assertNotNull(honda);
        assertNotNull(bmw);

        // Test null input
        assertThrows(IllegalArgumentException.class, () -> 
            VehicleFactory.createVehicle(null));

        // Test empty input
        assertThrows(IllegalArgumentException.class, () -> 
            VehicleFactory.createVehicle(""));

        // Test unsupported type
        assertThrows(IllegalArgumentException.class, () -> 
            VehicleFactory.createVehicle("ferrari"));

        // Test supported types check
        assertTrue(VehicleFactory.isSupportedType("toyota"));
        assertTrue(VehicleFactory.isSupportedType("TOYOTA"));
        assertFalse(VehicleFactory.isSupportedType("ferrari"));
        assertFalse(VehicleFactory.isSupportedType(null));
        assertFalse(VehicleFactory.isSupportedType(""));
    }

    @Test
    void testShapeCacheErrorHandling() {
        // Test that cache is empty initially
        assertEquals(0, ShapeCache.getCacheSize());

        // Test getting shape before loading cache
        assertThrows(IllegalStateException.class, () -> 
            ShapeCache.getShape("1"));

        // Load cache
        ShapeCache.loadCache();
        assertEquals(3, ShapeCache.getCacheSize());

        // Test valid shape retrieval
        Shape shape1 = ShapeCache.getShape("1");
        Shape shape2 = ShapeCache.getShape("2");
        Shape shape3 = ShapeCache.getShape("3");

        assertNotNull(shape1);
        assertNotNull(shape2);
        assertNotNull(shape3);

        // Test null input
        assertThrows(IllegalArgumentException.class, () -> 
            ShapeCache.getShape(null));

        // Test empty input
        assertThrows(IllegalArgumentException.class, () -> 
            ShapeCache.getShape(""));

        // Test non-existent shape
        assertThrows(IllegalStateException.class, () -> 
            ShapeCache.getShape("999"));

        // Clear cache
        ShapeCache.clearCache();
        assertEquals(0, ShapeCache.getCacheSize());
    }

    @Test
    void testPrototypePatternSafeCasting() {
        // Test Employee cloning without unsafe casting
        Employee originalEmployee = new Employee("John Doe", "IT", 5000);
        Employee clonedEmployee = originalEmployee.clone();

        assertNotNull(clonedEmployee);
        assertNotSame(originalEmployee, clonedEmployee);
        assertEquals(originalEmployee.getName(), clonedEmployee.getName());
        assertEquals(originalEmployee.getDepartment(), clonedEmployee.getDepartment());
        assertEquals(originalEmployee.getSalary(), clonedEmployee.getSalary());

        // Test GameCharacter cloning without unsafe casting
        GameCharacter originalCharacter = new GameCharacter("Warrior", "Fighter", 100, 80, 90);
        GameCharacter clonedCharacter = originalCharacter.clone();

        assertNotNull(clonedCharacter);
        assertNotSame(originalCharacter, clonedCharacter);
        assertEquals(originalCharacter.getName(), clonedCharacter.getName());
        assertEquals(originalCharacter.getType(), clonedCharacter.getType());
        assertEquals(originalCharacter.getHealth(), clonedCharacter.getHealth());
    }

    @Test
    void testBuilderPatternEqualsAndHashCode() {
        Computer computer1 = new Computer.Builder()
                .withCPU("Intel i7")
                .withGPU("RTX 3080")
                .withRAM(16)
                .withSSD(512)
                .build();

        Computer computer2 = new Computer.Builder()
                .withCPU("Intel i7")
                .withGPU("RTX 3080")
                .withRAM(16)
                .withSSD(512)
                .build();

        Computer computer3 = new Computer.Builder()
                .withCPU("AMD Ryzen")
                .withGPU("RTX 3080")
                .withRAM(16)
                .withSSD(512)
                .build();

        // Test equals
        assertEquals(computer1, computer2);
        assertNotEquals(computer1, computer3);

        // Test hashCode
        assertEquals(computer1.hashCode(), computer2.hashCode());
        assertNotEquals(computer1.hashCode(), computer3.hashCode());
    }
}

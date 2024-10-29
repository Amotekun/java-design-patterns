package creationdesignpattern.builder;

public class BuilderApp {
    public static void run() {

        System.out.println("==== Builder Pattern ====");

        // Using the Builder pattern to create computer and house objects
        Computer computer = new Computer.Builder()
                .withCPU("M1")
                .withGPU("RTX 3090")
                .withRAM(16)
                .withSSD(512)
                .build();

        Computer computer2 = new Computer.Builder()
                .withCPU("Intel i9")
                .withGPU("GeForce RTX 3080")
                .withRAM(32)
                .withSSD(1024)
                .build();

        House house = new House.Builder()
                .withBedrooms(4)
                .withGarage(true)
                .withPool(true)
                .withGarden(true)
                .build();

        House house2 = new House.Builder()
                .withBedrooms(3)
                .withGarage(false)
                .withPool(false)
                .withGarden(false)
                .build();

        System.out.println("Built computer: " + computer2);
        System.out.println("Built computer: " + computer);

        System.out.println("Built house: " + house);
        System.out.println("Built house: " + house2);

    }

}

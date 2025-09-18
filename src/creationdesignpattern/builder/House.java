package creationdesignpattern.builder;

import java.util.Objects;

/**
 * House class demonstrating the Builder pattern.
 * This class represents a house with various features that can be
 * built step by step using the Builder pattern.
 */
public class House {
    private final int bedrooms;
    private final boolean hasGarage;
    private final boolean hasPool;
    private final boolean hasGarden;

    private House(Builder builder) {
        this.bedrooms = builder.bedrooms;
        this.hasGarage = builder.hasGarage;
        this.hasPool = builder.hasPool;
        this.hasGarden = builder.hasGarden;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    public boolean hasPool() {
        return hasPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedrooms=" + bedrooms +
                ", hasGarage=" + hasGarage +
                ", hasPool=" + hasPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return bedrooms == house.bedrooms && 
               hasGarage == house.hasGarage && 
               hasPool == house.hasPool && 
               hasGarden == house.hasGarden;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bedrooms, hasGarage, hasPool, hasGarden);
    }

    /**
     * Builder class for constructing House objects.
     * Provides a fluent interface for setting house features.
     */
    public static class Builder {
        private int bedrooms = 1; // Default value
        private boolean hasGarage = false;
        private boolean hasPool = false;
        private boolean hasGarden = false;

        /**
         * Sets the number of bedrooms for the house.
         * 
         * @param bedrooms the number of bedrooms
         * @return this builder instance
         * @throws IllegalArgumentException if bedrooms is not positive
         */
        public Builder withBedrooms(int bedrooms) {
            if (bedrooms <= 0) {
                throw new IllegalArgumentException("Bedrooms must be positive, got: " + bedrooms);
            }
            this.bedrooms = bedrooms;
            return this;
        }

        /**
         * Sets whether the house has a garage.
         * 
         * @param hasGarage true if the house has a garage
         * @return this builder instance
         */
        public Builder withGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        /**
         * Sets whether the house has a pool.
         * 
         * @param hasPool true if the house has a pool
         * @return this builder instance
         */
        public Builder withPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        /**
         * Sets whether the house has a garden.
         * 
         * @param hasGarden true if the house has a garden
         * @return this builder instance
         */
        public Builder withGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        /**
         * Builds the House object with the configured parameters.
         * 
         * @return a new House instance
         */
        public House build() {
            return new House(this);
        }
    }
}

package creationdesignpattern.builder;

public class House {
    private int bedrooms;
    private boolean hasGarage;
    private boolean hadPool;
    private boolean hasGarden;

    private House(Builder builder) {
        this.bedrooms = builder.bedrooms;
        this.hasGarage = builder.hasGarage;
        this.hadPool = builder.hadPool;
        this.hasGarden = builder.hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedrooms=" + bedrooms +
                ", hasGarage=" + hasGarage +
                ", hadPool=" + hadPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class Builder {
        private int bedrooms;
        private boolean hasGarage;
        private boolean hadPool;
        private boolean hasGarden;

        public Builder withBedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder withGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder withPool(boolean hadPool) {
            this.hadPool = hadPool;
            return this;
        }

        public Builder withGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}

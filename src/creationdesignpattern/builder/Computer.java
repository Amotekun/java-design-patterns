package creationdesignpattern.builder;

public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int SSD;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.SSD = builder.SSD;
    }

    @Override
    public String toString() {
        return "Computer [CPU: " + CPU + ", GPU: " + GPU + ", RAM: " + RAM + "GB, SSD: " + SSD + "GB]";
    }

    public static class Builder {
        private String CPU;
        private String GPU;
        private int RAM;
        private int SSD;

        public Builder withCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder withGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder withRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder withSSD(int SSD) {
            this.SSD = SSD;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

}

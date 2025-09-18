package creationdesignpattern.builder;

import java.util.Objects;

/**
 * Computer class demonstrating the Builder pattern.
 * This class represents a computer with various components that can be
 * built step by step using the Builder pattern.
 */
public class Computer {
    private final String cpu;
    private final String gpu;
    private final int ram;
    private final int ssd;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.gpu = builder.gpu;
        this.ram = builder.ram;
        this.ssd = builder.ssd;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public int getRam() {
        return ram;
    }

    public int getSsd() {
        return ssd;
    }

    @Override
    public String toString() {
        return "Computer [CPU: " + cpu + ", GPU: " + gpu + ", RAM: " + ram + "GB, SSD: " + ssd + "GB]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && ssd == computer.ssd && 
               Objects.equals(cpu, computer.cpu) && Objects.equals(gpu, computer.gpu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, ram, ssd);
    }

    /**
     * Builder class for constructing Computer objects.
     * Provides a fluent interface for setting computer components.
     */
    public static class Builder {
        private String cpu;
        private String gpu;
        private int ram;
        private int ssd;

        /**
         * Sets the CPU for the computer.
         * 
         * @param cpu the CPU model
         * @return this builder instance
         * @throws IllegalArgumentException if cpu is null or empty
         */
        public Builder withCPU(String cpu) {
            Objects.requireNonNull(cpu, "CPU cannot be null");
            if (cpu.trim().isEmpty()) {
                throw new IllegalArgumentException("CPU cannot be empty");
            }
            this.cpu = cpu;
            return this;
        }

        /**
         * Sets the GPU for the computer.
         * 
         * @param gpu the GPU model
         * @return this builder instance
         * @throws IllegalArgumentException if gpu is null or empty
         */
        public Builder withGPU(String gpu) {
            Objects.requireNonNull(gpu, "GPU cannot be null");
            if (gpu.trim().isEmpty()) {
                throw new IllegalArgumentException("GPU cannot be empty");
            }
            this.gpu = gpu;
            return this;
        }

        /**
         * Sets the RAM amount for the computer.
         * 
         * @param ram the RAM amount in GB
         * @return this builder instance
         * @throws IllegalArgumentException if ram is not positive
         */
        public Builder withRAM(int ram) {
            if (ram <= 0) {
                throw new IllegalArgumentException("RAM must be positive, got: " + ram);
            }
            this.ram = ram;
            return this;
        }

        /**
         * Sets the SSD storage amount for the computer.
         * 
         * @param ssd the SSD storage amount in GB
         * @return this builder instance
         * @throws IllegalArgumentException if ssd is not positive
         */
        public Builder withSSD(int ssd) {
            if (ssd <= 0) {
                throw new IllegalArgumentException("SSD must be positive, got: " + ssd);
            }
            this.ssd = ssd;
            return this;
        }

        /**
         * Builds the Computer object with the configured parameters.
         * 
         * @return a new Computer instance
         * @throws IllegalStateException if required fields are not set
         */
        public Computer build() {
            validateRequiredFields();
            return new Computer(this);
        }

        private void validateRequiredFields() {
            if (cpu == null) {
                throw new IllegalStateException("CPU is required but not set");
            }
            if (gpu == null) {
                throw new IllegalStateException("GPU is required but not set");
            }
            if (ram == 0) {
                throw new IllegalStateException("RAM is required but not set");
            }
            if (ssd == 0) {
                throw new IllegalStateException("SSD is required but not set");
            }
        }
    }
}

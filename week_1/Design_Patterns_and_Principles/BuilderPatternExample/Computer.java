public class Computer {
//defining the attributes
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private boolean hasBluetooth;
    private boolean hasWifi;

    // constructors for declaring the variables
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.hasBluetooth = builder.hasBluetooth;
        this.hasWifi = builder.hasWifi;
    }

    // i had introduced the getters for accessing the variables individual
    public String getCpu()
     {
         return cpu; 
    }
    public String getRam()
     {
         return ram; 
    }
    public String getStorage()
     {
         return storage;
     }
    public String getGpu()
     {
         return gpu;
     }
    public boolean hasBluetooth()
     { 
        return hasBluetooth;
     }
    public boolean hasWifi()
     { 
        return hasWifi; 
    }

    // Overriding toString() to print the computer configuration
    @Override
    public String toString() {
        return "Computer [CPU=" + cpu + ", RAM=" + ram + ", Storage=" + storage +
               ", GPU=" + gpu + ", Bluetooth=" + hasBluetooth + ", WiFi=" + hasWifi + "]";
    }

    // Builder Class
    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private boolean hasBluetooth;
        private boolean hasWifi;

        // Builder methods to set each attribute
        public Builder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        // Build method to return the final Computer object
        public Computer build() {
            return new Computer(this); // Pass builder to Computer constructor
        }
    }
}

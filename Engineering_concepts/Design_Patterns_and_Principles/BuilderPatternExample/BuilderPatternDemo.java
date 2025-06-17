public class BuilderPatternDemo {
    public static void main(String[] args) {

        // Create a high-end computer with all features
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGpu("NVIDIA RTX 4080")
                .setBluetooth(true)
                .setWifi(true)
                .build();

        // Create a budget computer with basic setup
        Computer officePC = new Computer.Builder()
                .setCpu("Intel i3")
                .setRam("8GB")
                .setStorage("500GB HDD")
                .build(); // no GPU, Bluetooth or WiFi

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}

